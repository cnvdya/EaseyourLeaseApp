package sjsu.jentab.EaseYourLease.config;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//import com.microsoft.aad.adal4j.AuthenticationResult;
//import com.nimbusds.openid.connect.sdk.AuthenticationResponse;
//import com.nimbusds.openid.connect.sdk.AuthenticationResponseParser;
//import com.nimbusds.openid.connect.sdk.AuthenticationSuccessResponse;

public class AuthHelper {

//    public static final String PRINCIPAL_SESSION_NAME = "principal";
//
//    private AuthHelper() {
//    }
//
//    public static boolean isAuthenticated(HttpServletRequest request) {
//        return request.getSession().getAttribute(PRINCIPAL_SESSION_NAME) != null;
//    }
//
//    public static AuthenticationResult getAuthSessionObject(
//            HttpServletRequest request) {
//        return (AuthenticationResult) request.getSession().getAttribute(
//                PRINCIPAL_SESSION_NAME);
//    }
//
//    public static boolean containsAuthenticationData(
//            HttpServletRequest httpRequest) {
//        Map<String, String[]> map = httpRequest.getParameterMap();
//        return httpRequest.getMethod().equalsIgnoreCase("POST") && (httpRequest.getParameterMap().containsKey(
//                AuthParameterNames.ERROR)
//                || httpRequest.getParameterMap().containsKey(
//                AuthParameterNames.ID_TOKEN) || httpRequest
//                .getParameterMap().containsKey(AuthParameterNames.CODE));
//    }
//
//    public static boolean isAuthenticationSuccessful(
//            AuthenticationResponse authResponse) {
//        return authResponse instanceof AuthenticationSuccessResponse;
//    }
}
