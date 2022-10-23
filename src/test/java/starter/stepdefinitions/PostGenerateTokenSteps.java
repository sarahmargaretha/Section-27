package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.PostGenerateToken;

public class PostGenerateTokenSteps {
    @Steps
    PostGenerateToken postGenerateToken;
    @Given("I set url and valid token")
    public void iSetUrlAndValidToken() {
        postGenerateToken.setUrlAndValidToken();
    }

    @When("I request with valid username and password")
    public void iRequestWithValidUsernameAndPassword() {
        postGenerateToken.requestWithValidUsernameAndPassword();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        postGenerateToken.statusCode200();
    }

    @Given("I set url and null body")
    public void iSetUrlAndNullBody() {
        postGenerateToken.setUrlAndNullBody();
    }

    @When("I request with null username and null password")
    public void iRequestWithNullUsernameAndNullPassword() {
        postGenerateToken.requestWithNullBody();
    }

    @Given("I set url and valid password")
    public void iSetUrlAndValidPassword() {
        postGenerateToken.setUrlAndValidPassword();
    }

    @When("I request with null username")
    public void iRequestWithNullUsername() {
        postGenerateToken.requestWithNullUserName();
    }

    @And("status code 400")
    public void statusCode400() {
        postGenerateToken.statusCode400();
    }

    @Given("I set url and valid username")
    public void iSetUrlAndValidUsername() {
        postGenerateToken.setUrlAndValidUserName();
    }

    @When("I request with null password")
    public void iRequestWithNullPassword() {
        postGenerateToken.requestWithNullPassword();
    }

    @Given("I set url and invalid body")
    public void iSetUrlAndInvalidBody() {
        postGenerateToken.setUrlAndInvalidBody();
    }

    @When("I request with invalid body")
    public void iRequestWithInvalidBody() {
        postGenerateToken.requestWithInvalidBody();
    }

    @Given("I set url and integer body")
    public void iSetUrlAndIntegerBody() {
        postGenerateToken.setUrlAndIntegerBody();
    }

    @When("I request with integer body")
    public void iRequestWithIntegerBody() {
        postGenerateToken.requestWithIntegerBody();
    }

    @And("I set integer username and valid password")
    public void iSetIntegerUsernameAndValidPassword() {
        postGenerateToken.setIntegerUsername();
    }

    @When("I request with integer username and valid password")
    public void iRequestWithIntegerUsernameAndValidPassword() {
        postGenerateToken.requestWithIntegerUserName();
    }

    @And("I set valid username and integer password")
    public void iSetValidUsernameAndIntegerPassword() {
        postGenerateToken.setIntegerPassword();
    }

    @When("I request with valid username and integer password")
    public void iRequestWithValidUsernameAndIntegerPassword() {
        postGenerateToken.requestWithIntegerPassword();
    }

    @Then("I get status code 400")
    public void iGetStatusCode400() {
        postGenerateToken.statusCode400();
    }

    @Given("I set url and invalid token")
    public void iSetUrlAndInvalidToken() {
        postGenerateToken.setUrlAndInvalidToken();
    }

    @When("I request with invalid token")
    public void iRequestWithInvalidToken() {
        postGenerateToken.requestWithInvalidToken();
    }

    @Then("I get status code 401")
    public void iGetStatusCode401() {
        postGenerateToken.statusCode401();
    }

    @Given("I set url")
    public void iSetUrl() {
        postGenerateToken.setUrl();
    }
}