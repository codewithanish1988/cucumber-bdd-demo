package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.codewithanish.LoginManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private String inputUserName;
    private String inputPassword;
    private String actualResponse;

    @Given("A user with username {string} and password {string}")
    public void aUserWithUsernameAndPassword(String userName, String password) {
        this.inputUserName = userName;
        this.inputPassword = password;
    }

    @When("The user clicks login Button")
    public void theUserClicksLoginButton() {
        actualResponse = new LoginManagement().login(inputUserName, inputPassword);
    }

    @Then("The response should be {string}")
    public void theResponseShouldBe(String expectedResponse) {
       assertEquals(expectedResponse, actualResponse);
    }
}
