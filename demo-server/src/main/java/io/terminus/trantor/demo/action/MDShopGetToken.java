package io.terminus.trantor.demo.action;

import com.lazada.lazop.api.LazopClient;
import com.lazada.lazop.api.LazopRequest;
import com.lazada.lazop.api.LazopResponse;
import com.lazada.lazop.util.ApiException;
import io.terminus.api.utils.JsonUtil;
import io.terminus.trantor.demo.model.facade.response.ShopAccessTokenInfo;

/**
 * @Author by yuanpeng
 * @Date 2021/1/21
 */
public class MDShopGetToken {
    public static void main(String[] args) {
        try {
//            getShipment();
            getToken();
//            refreshToken();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getShipment() throws Exception{
        LazopClient client = new LazopClient("https://api.lazada.sg/rest", "124923", "BtPwqWoyErRwsaDkU3tasJXRds424XKR");
        LazopRequest request = new LazopRequest();
        request.setApiName("/shipment/providers/get");
        request.setHttpMethod("GET");
        LazopResponse response = client.execute(request, "050000900730cQEMesFJIpysQBD2kzkiwiwQEcbfwBm10b0ba1fWWGglPjODpJ8sx");
        System.out.println(response.getBody());

        ShopAccessTokenInfo result = JsonUtil.getObject(response.getBody(), new ShopAccessTokenInfo().getClass());

        Thread.sleep(10);
    }
    /**
     * 授权
     * @throws Exception
     */
    public static void getToken() throws Exception{
//        shopVO.setAppKey("111111"); // 授权key
//        shopVO.setAppSecret("xxxxxx");
        LazopClient client = new LazopClient("https://auth.lazada.com/rest", "111111", "xxxxxx");
        LazopRequest request = new LazopRequest("/auth/token/create");
        request.addApiParameter("code", "0_124923_wDWkm8YT30Dj88DKPGfoJY6g3230");
        LazopResponse response = client.execute(request);
        System.out.println(response.getBody());
    }

    public static void refreshToken(){
        LazopClient client = new LazopClient("https://auth.lazada.com/rest", "124923", "BtPwqWoyErRwsaDkU3tasJXRds424XKR");
        LazopRequest request = new LazopRequest("/auth/token/refresh");
        request.addApiParameter("refresh_token", "50001900706cQEMesF159d3e81JIpysQBD2kzkiwiwQEcbfwBmWWGglPjODpJ8sx");
        LazopResponse response = null;
        try {
            response = client.execute(request);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(response.getBody());
    }
}
