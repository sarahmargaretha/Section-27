package starter;

import freemarker.core.JSONOutputFormat;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostGenerateToken {

    private String url, username, password;

    public void setUrlAndNullUsernameAndNullPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "";
        password = "";
    }
    public JSONObject bodyPostGenerateToken(){
        JSONObject body = new JSONObject();
        body.put("username", "");
        body.put("password", "");
        return body;
    }
    public void requestPostGenerateToken(){
        given().header("Content-Type", "application/json")
                .body(bodyPostGenerateToken().toJSONString());
        when().post(url);
    }
    public void validateStatusCode(){then().statusCode(400);
    }
    public void validateStatusMessage(){
        then().body(equalTo("Error"));
    }

    public void setUrlAndNullUsernameAndValidPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "";
        password = "@Sarah.1203";
    }
    public JSONObject bodyPostGenerateTokenWithNullUsernameAndValidPassword(){
        JSONObject body = new JSONObject();
        body.put("username", "");
        body.put("password", "@Sarah.1203");
        return body;
    }
    public void requestPostGenerateTokenWithNullUsernameAndValidPassword() {
        given().header("Content-Type", "application/json")
                .body(bodyPostGenerateTokenWithNullUsernameAndValidPassword().toJSONString());
        when().post(url);
    }

    public void setUrlAndValidUsernameAndNullPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "sarahms";
        password = "";
    }
    public JSONObject bodyPostGenerateTokenWithValidUsernameAndNullPassword(){
        JSONObject body = new JSONObject();
        body.put("username", "sarahms");
        body.put("password", "");
        return body;
    }
    public void requestPostGenerateTokenWithValidUsernameAndNullPassword() {
        given().header("Content-Type", "application/json")
                .body(bodyPostGenerateTokenWithValidUsernameAndNullPassword().toJSONString());
        when().post(url);
    }

    public void setUrlAndInvalidUsernameAndInvalidPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "sarah";
        password = "12maret2003";
    }
    public JSONObject bodyPostGenerateTokenWithInvalidUsernameAndInvalidPassword(){
        JSONObject body = new JSONObject();
        body.put("username", "sarah");
        body.put("password", "12maret2003");
        return body;
    }
    public void requestPostGenerateTokenWithInvalidUsernameAndInvalidPassword() {
        given().header("Content-Type", "application/json")
                .body(bodyPostGenerateTokenWithInvalidUsernameAndInvalidPassword().toJSONString());
        when().post(url);
    }
    public void validateCode(){then().statusCode(200);}
    public void validateFailedMessage(){then().body(equalTo("Failed"));}


    public void setUrlAndValidUsernameAndInvalidPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "sarahms";
        password = "12maret2003";
    }
    public JSONObject bodyPostGenerateTokenWithValidUsernameAndInvalidPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "sarahms");
        body.put("password", "12maret2003");
        return body;
    }
    public void requestPostGenerateTokenWithValidUsernameAndInvalidPassword() {
        given().header("Content-Type", "application/json")
                    .body(bodyPostGenerateTokenWithValidUsernameAndInvalidPassword().toJSONString());
        when().post(url);
    }

    public void setUrlAndInvalidUsernameAndValidPassword() {
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "sarah";
        password = "@Sarah.1203";
    }
    public JSONObject bodyPostGenerateTokenWithInvalidUsernameAndValidPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "sarah");
        body.put("password", "@Sarah.1203");
        return body;
    }
    public void requestPostGenerateTokenWithInvalidUsernameAndValidPassword() {
        given().header("Content-Type", "application/json")
                .body(bodyPostGenerateTokenWithInvalidUsernameAndValidPassword().toJSONString());
        when().post(url);
    }

    public void setUrlAndValidUsernameAndValidPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "sarahms";
        password = "@Sarah.1203";
    }
    public JSONObject bodyPostGenerateTokenWithValidUsernameAndValidPassword(){
        JSONObject body = new JSONObject();
        body.put("username", "sarahms");
        body.put("password", "@Sarah.1203");
        return body;
    }
    public void requestPostGenerateTokenWithValidUsernameAndValidPassword() {
        given().header("Content-Type", "application/json")
                .body(bodyPostGenerateTokenWithValidUsernameAndValidPassword().toJSONString());
        when().post(url);
    }
    public void validateSuccessMessage(){then().body(equalTo("Success"));}
}