package starter;

import freemarker.core.JSONOutputFormat;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostGenerateToken {

    private String url, token;

    public void setUrlAndValidToken() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }

    public void setUrl() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
    }

    public JSONObject postLoginWithToken() {
        JSONObject body = new JSONObject();
        body.put("username", "sarahms");
        body.put("password", "@Sarah.1203");
        return body;
    }

    public void requestWithValidUsernameAndPassword() {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(postLoginWithToken().toJSONString());
        when().post(url);
    }

    public void statusCode200() {
        then().statusCode(200);
    }

    public void setUrlAndNullBody() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }

    public JSONObject bodyLoginWithNullBody() {
        JSONObject body = new JSONObject();
        body.put("username", "");
        body.put("password", "");
        return body;
    }

    public void requestWithNullBody() {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithNullBody().toJSONString());
        when().post(url);
    }

    public void setUrlAndValidPassword() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }

    public JSONObject bodyLoginWithValidPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "");
        body.put("password", "@Sarah.1203");
        return body;
    }

    public void requestWithNullUserName() {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithValidPassword().toJSONString());
        when().post(url);
    }

    public void statusCode400() {
        then().statusCode(400);
    }

    public void setUrlAndValidUserName() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }

    public JSONObject bodyLoginWithNullPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "sarahms");
        body.put("password", "");
        return body;
    }

    public void requestWithNullPassword() {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithNullPassword().toJSONString());
        when().post(url);
    }

    public void setUrlAndInvalidBody() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }

    public JSONObject bodyLoginWithinvalidUsernameAndPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "sarah");
        body.put("password", "12maret2003");
        return body;
    }

    public void requestWithInvalidBody() {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithinvalidUsernameAndPassword().toJSONString());
        when().post(url);
    }
    public void setUrlAndIntegerBody () {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }
    public JSONObject bodyLoginWithIntegerBody() {
        JSONObject body = new JSONObject();
        body.put("username", 123);
        body.put("password", 4567);
        return body;
    }

    public void requestWithIntegerBody () {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithIntegerBody().toJSONString());
        when().post(url);
    }
    public void setIntegerUsername () {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }
    public JSONObject bodyLoginWithIntegerUserName() {
        JSONObject body = new JSONObject();
        body.put("username", 123);
        body.put("password", "@Sarah.1203");
        return body;
    }
    public void requestWithIntegerUserName () {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithIntegerUserName().toJSONString());
        when().post(url);
    }

    public void setIntegerPassword () {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "1078e3d3-ece8-4237-8e8f-05ab28353052";
    }
    public JSONObject bodyLoginWithIntegerPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "sarahms");
        body.put("password", 123);
        return body;
    }

    public void requestWithIntegerPassword () {
        given().header("Authorization", "username" + token)
                .header("Authorization", "password" + token)
                .header("Content-Type", "application/json")
                .body(bodyLoginWithIntegerPassword().toJSONString());
        when().post(url);
    }

    public void setUrlAndInvalidToken() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost";
        token = "abc";
    }

    public void requestWithInvalidToken() {
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(url);
    }

    public void statusCode401() {
        then().statusCode(401);
    }}