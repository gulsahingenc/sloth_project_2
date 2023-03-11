package com.cydeo.step_definition;

import com.cydeo.pages.FidexioLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FidexioLogin_StepDefinition {


    FidexioLoginPage fidexioLoginPage = new FidexioLoginPage();


    @Given("user is on fidexio login page")
    public void user_is_on_fidexio_login_page() {
       Driver.getDriver().get("https://qa.fidexio.com/");
    }
    @When("user enters {string} as username in  Email field")
    public void user_enters_as_username_in_email_field(String email) {
        fidexioLoginPage.email.sendKeys(email);

    }
    @When("{string} as password in Password field")
    public void as_password_in_password_field(String password) {
       fidexioLoginPage.password.sendKeys(password);
    }
    @When("click Log in button")
    public void click_log_in_button() {
       fidexioLoginPage.logIn.click();
    }
    @Then("user should be on the dashboard")
    public void user_should_be_on_the_dashboard() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
