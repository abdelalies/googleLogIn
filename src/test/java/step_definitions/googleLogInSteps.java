package step_definitions;

import Pages.googleLogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.PropertiesReader;
import utilities.driver;

public class googleLogInSteps {

    googleLogInPage googleLogin = new googleLogInPage();

    @Given("I'm on google homepage")
    public void i_m_on_google_homepage() {
        driver.getDriver().get(PropertiesReader.getProperty("googleurl"));
        Assert.assertTrue(googleLogin.googleImg.isDisplayed());

    }
    @Given("the signin button is displayed")
    public void the_signin_button_is_displayed() {
        Assert.assertTrue(googleLogin.signInbtn.isDisplayed());


    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        googleLogin.signInbtn.click();


    }
    @Then("I should be directed to the login page")
    public void i_should_be_directed_to_the_login_page() {
        Assert.assertTrue(googleLogin.emailBox.isDisplayed());
    }



}
