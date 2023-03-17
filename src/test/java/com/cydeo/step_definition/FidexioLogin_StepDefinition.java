package com.cydeo.step_definition;

import com.cydeo.pages.FidexioLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FidexioLogin_StepDefinition {


    FidexioLoginPage fidexioLoginPage = new FidexioLoginPage();


    @Given("user is on fidexio login page")
    public void user_is_on_fidexio_login_page() {
       Driver.getDriver().get("https://qa.fidexio.com/");
    }

    @When("user enter salesmanager username {string}")
    public void userEnterSalesmanagerUsername(String string) {
        fidexioLoginPage.email.sendKeys(string);
    }

    @And("user enter salesmanager password {string}")
    public void userEnterSalesmanagerPassword(String string) {
        fidexioLoginPage.password.sendKeys(string);
    }

    @When("click Log in button")
    public void click_log_in_button() {
       fidexioLoginPage.logIn.click();
    }

    @Then("user\\(salesmanager) should be on the dashboard")
    public void userSalesmanagerShouldBeOnTheDashboard() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user enters {string} as username in  Email field")
    public void userEntersAsUsernameInEmailField(String string) {
        fidexioLoginPage.email.sendKeys(string);
    }

    @And("{string} as password in Password field")
    public void asPasswordInPasswordField(String string) {
        fidexioLoginPage.password.sendKeys(string);
    }

    @Then("user should be on the dashboard")
    public void userShouldBeOnTheDashboard() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String email, String password) {
        fidexioLoginPage.email.sendKeys(email);
        fidexioLoginPage.password.sendKeys(password);
    }
        @Then("{string} should be displayed")
       public void shouldBeDisplayed(String arg0) {

        fidexioLoginPage.wrongMessage.getText();
    }
    @When("user enter {string} or {string}")
    public void userEnterOr(String email, String password) {
        fidexioLoginPage.email.sendKeys(email);
        fidexioLoginPage.password.sendKeys(password);
        
    }

    @Then("User should see the password displayed in bullet signs")
    public void user_should_see_the_password_displayed_in_bullet_signs() {

        String type = fidexioLoginPage.password.getAttribute("type");
        Assert.assertEquals(type, "password");
    }

    @When("user enter {string} into the email field")
    public void userEnterIntoTheEmailField(String string) {
        fidexioLoginPage.email.sendKeys(string);
    }

    @And("user enter {string} into the password field")
    public void userEnterIntoThePasswordField(String string) {
        fidexioLoginPage.password.sendKeys(string);
    }

    @When("user enter {string} key of the keyboard")
    public void user_enter_key_of_the_keyboard(String string) {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
    }
    @Then("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user click {string} link")
    public void userClickLink(String arg0) {
    }

    @Then("user on the {string} page")
    public void userOnThePage(String arg0) {
    }


    @When("user enters only an {string} or {string}")
    public void user_enters_only_an_or(String email, String password) {
        fidexioLoginPage.email.sendKeys(email);
        fidexioLoginPage.password.sendKeys(password);
    }

    @Then("user should see warning message to fill empty fields when trying to log in")
    public void userShouldSeeWarningMessageToFillEmptyFieldsWhenTryingToLogIn() throws InterruptedException {
        System.out.println(fidexioLoginPage.password.getAttribute("value"));
       // fidexioLoginPage.logIn.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        if (fidexioLoginPage.password.getAttribute("value").isEmpty()){
            System.out.println("hello1");
            Assert.assertEquals("Please fill in this field.",fidexioLoginPage.password.getAttribute("validationMessage"));
        }
        if (fidexioLoginPage.email.getAttribute("value").isEmpty()){
            System.out.println("hello2");
            Assert.assertEquals("Please fill in this field.",fidexioLoginPage.email.getAttribute("validationMessage"));
        }
    }

}


