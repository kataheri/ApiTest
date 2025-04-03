package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;
    public ApiStep() {
        apiPage = new ApiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @When("hit api for get list users")
    public void hitApiForGetListUsers() {
        apiPage.hitApiForGetListUsers();
    }

    @Then("Validation status code is equal {int}")
    public void validationStatusCodeIsEqual(int status_code) {
        apiPage.validationStatusCodeIsEqual(status_code);
    }

    @And("Validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @And("Validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @When("hit api for post create new user")
    public void hitApiForPostCreateNewUser() {
        apiPage.hitApiForPostCreateUsers();
    }

    @And("Validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyCreateUser();
    }

    @When("hit api for delete user")
    public void hitApiForDeleteUser() {
        apiPage.hitApiForDeleteUsers();
    }

    @When("hit api for update data")
    public void hitApiForUpdateData() {
        apiPage.hitApiForUpdateData();
    }

    @And("Validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }

    @Given("prepare an invalid URL for the {string}")
    public void prepareAnInvalidURLForThe(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("Validation response message should be {string}")
    public void validationResponseMessageShouldBe(String arg0) {
        apiPage.theResponseMessageShouldBe(arg0);
    }
}
