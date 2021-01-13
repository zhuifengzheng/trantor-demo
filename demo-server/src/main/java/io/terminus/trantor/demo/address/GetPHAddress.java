package io.terminus.trantor.demo.address;

import io.terminus.api.utils.JsonUtil;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.Nullable;
import org.springframework.util.CollectionUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 * 获取东南亚地址库
 */
public class GetPHAddress {
    public static void main(String[] args) throws Exception {
        //越南(Lazada.vn)、新加坡(Lazada.sg)、马来西亚(Lazada.com.my)、
        // 泰国(Lazada.co.th)、菲律宾(Lazada.com.ph)、印度尼西亚(Lazada.co.id)
        String comment = "/locationtree/api/getSubAddressList";
        String ph = "https://member.Lazada.com.ph" + comment;//菲律宾
        String vn = "https://member.lazada.vn" + comment;//越南
        String sg = "https://member.lazada.sg" + comment;//新加坡
        String my = "https://member.lazada.com.my" + comment;//马来西亚
        String id = "https://member.lazada.co.id" + comment;//印度尼西亚
        String th = "https://member.lazada.co.th" + comment;//泰国

        String countryCode = "TH";
        String tempCountry = th;

        String sqlStaticProvince = "INSERT INTO `base__district`(`initial`, `level`, `cityCode`, `initials`, `center`, `suffix`, `createdAt`, `deletedAt`, `pinyin`, `mergerName`, `isDeleted`, `simpleName`, `name`, `id`, `order`, `updatedAt`, `DistrictParent`, `CreatedBy`, `UpdatedBy`) VALUES ('%s', 'PROVINCE', NULL, '%s', NULL, '省', now(), 0, NULL, '%s', 0, NULL, '%s', '%s', NULL, now(), '%s', NULL, NULL);";
        String sqlStaticCity = "INSERT INTO `base__district`(`initial`, `level`, `cityCode`, `initials`, `center`, `suffix`, `createdAt`, `deletedAt`, `pinyin`, `mergerName`, `isDeleted`, `simpleName`, `name`, `id`, `order`, `updatedAt`, `DistrictParent`, `CreatedBy`, `UpdatedBy`) VALUES ('%s', 'CITY', NULL, '%s', NULL, '市', now(), 0, NULL, '%s', 0, NULL, '%s', '%s', NULL, now(), '%s', NULL, NULL);";
        String sqlStaticDistrict = "INSERT INTO `base__district`(`initial`, `level`, `cityCode`, `initials`, `center`, `suffix`, `createdAt`, `deletedAt`, `pinyin`, `mergerName`, `isDeleted`, `simpleName`, `name`, `id`, `order`, `updatedAt`, `DistrictParent`, `CreatedBy`, `UpdatedBy`) VALUES ('%s', 'DISTRICT', NULL, '%s', NULL, '区', now(), 0, NULL, '%s', 0, NULL, '%s', '%s', NULL, now(), '%s', NULL, NULL);";

        outResult(countryCode, tempCountry,sqlStaticProvince,sqlStaticCity,sqlStaticDistrict,false);
    }

    /**
     *
     * @param countryCode
     * @param tempCountry
     * @param sqlStaticProvince
     * @param sqlStaticCity
     * @param sqlStaticDistrict
     * @param hasBarangay 是否存在县
     * @throws Exception
     */
    private static void outResult(String countryCode, String tempCountry, String sqlStaticProvince,String sqlStaticCity,String sqlStaticDistrict, boolean hasBarangay) throws Exception {
        String path = "/Users/zhuifengzheng/IdeaProjects/trantor-demo/demo-server/src/main/java/io/terminus/trantor/demo/address";
        File file = new File(path + "/" + countryCode+".sql");

        AddressInfo provinceInfo = country(countryCode, tempCountry);
        List<Module> provinceModules = provinceInfo.getModule();
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        for (Module province : provinceModules) {
            // 省sql
            String formatProvince = String.format(sqlStaticProvince,countryCode,countryCode ,province.getName().replace("'","\\'"),province.getName().replace("'","\\'"),province.getId(),province.getParentId());
            bw.write(formatProvince+"\n");
            System.out.println("省："+formatProvince);

            AddressInfo cityInfo = shixian(countryCode, province.getId(), tempCountry);
            List<Module> cityModules = cityInfo.getModule();
            if (CollectionUtils.isEmpty(cityModules)){
                continue;
            }
            for (Module city : cityModules) {
                if (hasBarangay) {
                    AddressInfo barangayInfo = shixian(countryCode, city.getId(), tempCountry);
                    List<Module> barangayModules = barangayInfo.getModule();
                    if (!CollectionUtils.isEmpty(barangayModules)) {
                        for (Module barangay : barangayModules) {
                            // 县sql
                            String barangayTemp = province.getName() + "," + city.getName() + "," + barangay.getName();
                            String formatBarangay = String.format(sqlStaticDistrict, countryCode, countryCode, barangayTemp.replace("'", "\\'"), barangay.getName().replace("'", "\\'"), barangay.getId(), barangay.getParentId());
                            bw.write(formatBarangay + "\n");
//                        System.out.println("省：" + province.getName() + " 市：" + city.getName() + " 县：" + barangay.getName());
//                        bw.write("省: " + province.getName() + " 市: " + city.getName() + " 县: " + barangay.getName()+ "\n");
                        }
                    }
                }else{
                    // 只有两级情况下开启
                    // 市sql
                    String cityTemp = province.getName()+","+city.getName();
                    String formatCity = String.format(sqlStaticCity,countryCode,countryCode ,cityTemp.replace("'","\\'"),city.getName().replace("'","\\'"),city.getId(),city.getParentId());
                    bw.write(formatCity+"\n");
//                System.out.println(formatCity);
//                bw.write("省: " + province.getName() + " 市: " + city.getName()+ "\n");

                }

            }
        }
        bw.close();
        System.out.println("==========end============");
    }

    /**
     * 获取国家下面省份信息
     * @param countryCode
     * @param url
     * @return
     * @throws Exception
     */
    public static AddressInfo country(String countryCode, String url) throws Exception {
        Response response = getUrlResponse(url);
        AddressInfo info = new AddressInfo();
        AddressInfo result = JsonUtil.getObject(response.body().string(), info.getClass());
        return result;
    }

    /**
     * 地址请求
     * @param url
     * @return
     */
    @Nullable
    private static Response getUrlResponse(String url) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);
        Response response = null;
        try {
            response = call.execute();
//            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    /**
     * 获取省份下城市和县信息
     * @param countryCode
     * @param addressId
     * @param url
     * @return
     * @throws Exception
     */
    public static AddressInfo shixian(String countryCode, String addressId, String url) throws Exception {
        String urlCountry = url + "?countryCode=" + countryCode + "&addressId=" + addressId + "&page=addressEdit";
        Response response = getUrlResponse(urlCountry);
        AddressInfo info = new AddressInfo();
        AddressInfo result = JsonUtil.getObject(response.body().string(), info.getClass());
        return result;
    }

    public static void testOutJson(){
        //国家：https://member.lazada.com.ph/locationtree/api/getSubAddressList?countryCode=PH&addressId=R52299&page=addressEdit
        //城市：https://member.lazada.com.ph/locationtree/api/getSubAddressList?countryCode=PH&addressId=R80157317&page=addressEdit
        AddressInfo addressInfo = new AddressInfo();
        List list = new ArrayList();
        Module module = new Module();
        module.setDisplayName("ddd");

        Module module2 = new Module();
        module2.setDisplayName("ddd");
        list.add(module);
        list.add(module2);
        addressInfo.setModule(list);
        System.out.println(JsonUtil.getIndentJsonString(addressInfo));
    }
}
