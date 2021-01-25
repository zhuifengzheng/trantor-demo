//package io.terminus.trantor.demo.action;
//
//import com.lazada.lazop.api.LazopClient;
//import com.lazada.lazop.api.LazopRequest;
//import com.lazada.lazop.api.LazopResponse;
//import com.lazada.lazop.util.ApiException;
//
///**
// * @Author by yuanpeng
// * @Date 2021/1/21
// */
//public class MDShopGetToken {
//    public static void main(String[] args) {
//        try {
////            getToken();
//            refreshToken();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 授权
//     * @throws Exception
//     */
//    public static void getToken() throws Exception{
////        shopVO.setAppKey("111111"); // 授权key
////        shopVO.setAppSecret("xxxxxx");
//        LazopClient client = new LazopClient("https://auth.lazada.com/rest", "111111", "xxxxxx");
//        LazopRequest request = new LazopRequest("/auth/token/create");
//        request.addApiParameter("code", "0_111111_8nOEREcpvSqdPz65na9HgvzR65924");
//        LazopResponse response = client.execute(request);
//        System.out.println(response.getBody());
//    }
//
//    public static void refreshToken(){
//        LazopClient client = new LazopClient("https://auth.lazada.com/rest", "124923", "BtPwqWoyErRwsaDkU3tasJXRds424XKR");
//        LazopRequest request = new LazopRequest("/auth/token/refresh");
//        request.addApiParameter("refresh_token", "50001900706cQEMesF159d3e81JIpysQBD2kzkiwiwQEcbfwBmWWGglPjODpJ8sx");
//        LazopResponse response = null;
//        try {
//            response = client.execute(request);
//        } catch (ApiException e) {
//            e.printStackTrace();
//        }
//        System.out.println(response.getBody());
//    }
//}
