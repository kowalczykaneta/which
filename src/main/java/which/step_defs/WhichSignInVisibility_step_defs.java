package which.step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import which.browser.Browser;
import which.pom.WhichTvPage;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class WhichSignInVisibility_step_defs {

    @Given("^I am on Which\\? television page$")
    public void i_am_on_Which_television_page () {
        WhichTvPage.load();
    }

    @Given("^Page loads$")
    public void page_loads () {
        WhichTvPage.maximize();
        WhichTvPage.isLoaded();
    }

    @Then("^I see sign up button in top navigation bar$")
    public void i_see_sign_up_button_in_top_navigation_bar () throws Throwable {
        WebElement top_bar = Browser.driver().findElement(By.className("global-navigation"));
        WebElement sign_up_in_top_bar = top_bar.findElement(By.linkText("Sign up"));
        System.out.println(sign_up_in_top_bar);
    }

    @Then("^I see sign up button in left menu$")
    public void i_see_sign_up_button_in_left_menu () throws Throwable {
        WebElement left_menu = Browser.driver().findElement(By.className("_1CoFa"));
        WebElement sing_up_in_left_menu = left_menu.findElement(By.linkText("Sign up now"));
        // would throw exception if it's not there
    }

    @When("^I can see log in button$")
    public void i_can_see_log_in_button () throws Throwable {
        List<WebElement> login = Browser.driver().findElements(By.partialLinkText("Log in"));
        boolean ispresent = login.size() != 0;
        assertTrue("When it fails means login button is not visible", ispresent);

    }

    @When("^I click best buy tick box$")
    public void i_click_best_buy_tick_box () throws Throwable {

        WebElement memberExclusiveBestBuy = Browser.driver().findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/form/aside/div[2]/div[4]/section/ul/li[1]/label/div"));
        memberExclusiveBestBuy.click();

    }

    @Then("^URL stays the same$")
    public void url_stays_the_same () throws Throwable {

        String URL = Browser.driver().getCurrentUrl();
        //When assertEquals fails it means best buy is active and anonymous customer is able to use options restricted to signed in customers
        Assert.assertEquals(URL, "http://www.which.co.uk/reviews/televisions");

    }

    @When("^I click log in option$")
    public void i_click_log_in_option () throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^It redirects me to log in page$")
    public void it_redirects_me_to_log_in_page () throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
