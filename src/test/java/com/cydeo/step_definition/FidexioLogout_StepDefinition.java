package com.cydeo.step_definition;

import com.cydeo.pages.FidexioLoginPage;
import com.cydeo.pages.FidexioLogoutPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FidexioLogout_StepDefinition {

    FidexioLogoutPage fidexioLogoutPage=new FidexioLogoutPage();
    FidexioLoginPage fidexioLoginPage = new FidexioLoginPage();
    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        Driver.getDriver().get("https://qa.fidexio.com/");
    }
    @When("user enters {string} as username")
    public void user_enters_as_username(String string) {
     fidexioLoginPage.email.sendKeys(string);
    }
    @When("enters {string} as password")
    public void enters_as_password(String string) {
       fidexioLoginPage.password.sendKeys(string);
    }
    @Then("user clicks to login button and should be on the home page")
    public void user_clicks_to_login_button_and_should_be_on_the_home_page() {
      fidexioLoginPage.logIn.click();
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user should see the log out option from the dropdowns by clicking the profile icon")
    public void user_should_see_the_log_out_option_from_the_dropdowns_by_clicking_the_profile_icon() {

        System.out.println("001");
        fidexioLogoutPage.profileIcon.click();
        System.out.println("002");
        fidexioLogoutPage.logOut.isDisplayed();
        System.out.println("003");
    }
    @Then("user should be able to click to the log out button and land back on the login page.")
    public void user_should_be_able_to_click_to_the_log_out_button_and_land_back_on_the_login_page() {
        fidexioLogoutPage.logOut.click();
        fidexioLogoutPage.logInPage.isDisplayed();
    }
    @Then("user clicks to login button and should be on the homepage")
    public void userClicksToLoginButtonAndShouldBeOnTheHomepage() {
         fidexioLoginPage.logIn.click();
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("user should see logut button the dropdowns by cliking the profile icon")
    public void userShouldSeeLogutButtonTheDropdownsByClikingTheProfileIcon() {
fidexioLogoutPage.profileIcon.click();
fidexioLogoutPage.logOut.isDisplayed();
    }

    @Then("user should be able to click to logout button and land back on the login page")
    public void userShouldBeAbleToClickToLogoutButtonAndLandBackOnTheLoginPage() {

        fidexioLogoutPage.logOut.click();
        fidexioLogoutPage.logInPage.isDisplayed();
    }



    @And("user navigate back and takes expiremessage")
    public void userNavigateBackAndTakesExpiremessage() {
        Driver.getDriver().navigate().back();
        fidexioLogoutPage.expireMessage.isDisplayed();


    }
}
