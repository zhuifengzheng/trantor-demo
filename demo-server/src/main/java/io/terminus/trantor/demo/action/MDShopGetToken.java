package io.terminus.trantor.demo.action;

import com.lazada.lazop.api.LazopClient;
import com.lazada.lazop.api.LazopRequest;
import com.lazada.lazop.api.LazopResponse;

/**
 * @Author by yuanpeng
 * @Date 2021/1/21
 */
public class MDShopGetToken {
    public static void main(String[] args) {
        try {
            getToken();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 授权
     * @throws Exception
     */
    public static void getToken() throws Exception{
//        shopVO.setAppKey("124923"); // 授权key
//        shopVO.setAppSecret("BtPwqWoyErRwsaDkU3tasJXRds424XKR");
        LazopClient client = new LazopClient("https://auth.lazada.com/rest", "124923", "BtPwqWoyErRwsaDkU3tasJXRds424XKR");
        LazopRequest request = new LazopRequest("/auth/token/create");
        request.addApiParameter("code", "0_124923_8nOEREcpvSqdPz65na9HgvzR65924");
        LazopResponse response = client.execute(request);
        System.out.println(response.getBody());
    }
}
