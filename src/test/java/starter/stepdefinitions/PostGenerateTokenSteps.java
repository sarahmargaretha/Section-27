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

    @Given("I set url and null username and null password to post generate token")
    public void iSetUrlAndNullUsernameAndNullPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndNullUsernameAndNullPassword();
    }

    @When("I request post generate token")
    public void iRequestPostGenerateToken() {
        postGenerateToken.requestPostGenerateToken();
    }

    @Then("I will get {int}")
    public void iWillGet(int arg0) {postGenerateToken.validateStatusCode();
    }

    @And("get Error message")
    public void getErrorMessage() {
        postGenerateToken.validateStatusMessage();
    }

    @Given("I set url and null username and valid password to post generate token")
    public void iSetUrlAndNullUsernameAndValidPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndNullUsernameAndValidPassword();
    }

    @When("I request post generate token with null username and valid password")
    public void iRequestPostGenerateTokenWithNullUsernameAndValidPassword() {
        postGenerateToken.requestPostGenerateTokenWithNullUsernameAndValidPassword();
    }

    @Given("I set url and valid username and null password to post generate token")
    public void iSetUrlAndValidUsernameAndNullPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndValidUsernameAndNullPassword();
    }

    @When("I request post generate token with valid username and null password")
    public void iRequestPostGenerateTokenWithValidUsernameAndNullPassword() {
        postGenerateToken.requestPostGenerateTokenWithValidUsernameAndNullPassword();
    }

    @Given("I set url and invalid username and invalid password to post generate token")
    public void iSetUrlAndInvalidUsernameAndInvalidPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndInvalidUsernameAndInvalidPassword();}

    @When("I request post generate token with invalid username and invalid password")
    public void iRequestPostGenerateTokenWithInvalidUsernameAndInvalidPassword() {
        postGenerateToken.requestPostGenerateTokenWithInvalidUsernameAndInvalidPassword();}

    @Then("I will get code {int}")
    public void iWillGetCode(int arg0) {postGenerateToken.validateCode();
    }

    @And("get Failed message")
    public void getFailedMessage() {postGenerateToken.validateFailedMessage();
    }

    @Given("I set url and valid username and invalid password to post generate token")
    public void iSetUrlAndValidUsernameAndInvalidPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndValidUsernameAndInvalidPassword();
    }


    @When("I request post generate token with valid username and invalid password")
    public void iRequestPostGenerateTokenWithValidUsernameAndInvalidPassword() {
        postGenerateToken.requestPostGenerateTokenWithValidUsernameAndInvalidPassword();
    }


    @Given("I set url and invalid username and valid password to post generate token")
    public void iSetUrlAndInvalidUsernameAndValidPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndInvalidUsernameAndValidPassword();
    }

    @When("I request post generate token with invalid username and valid password")
    public void iRequestPostGenerateTokenWithInvalidUsernameAndValidPassword() {
        postGenerateToken.requestPostGenerateTokenWithInvalidUsernameAndValidPassword();
    }

    @Given("I set url and valid username and valid password to post generate token")
    public void iSetUrlAndValidUsernameAndValidPasswordToPostGenerateToken() {
        postGenerateToken.setUrlAndValidUsernameAndValidPassword();
    }

    @When("I request post generate token with valid username and valid password")
    public void iRequestPostGenerateTokenWithValidUsernameAndValidPassword() {
        postGenerateToken.requestPostGenerateTokenWithValidUsernameAndValidPassword();
    }

    @And("get Success message")
    public void getSuccessMessage() {postGenerateToken.validateSuccessMessage();
    }



}
