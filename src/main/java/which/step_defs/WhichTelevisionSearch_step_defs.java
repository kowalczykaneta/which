package which.step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import which.browser.Browser;
import which.pom.WhichTvPage;

import java.util.List;

public class WhichTelevisionSearch_step_defs {

    private String number_of_results_left;

    @When("^I select \"([^\"]*)\"$")
    public void i_select (String screen_size) throws Throwable {

        List<WebElement> screen_sizes_elements = Browser.driver().findElements(By.className("_3F1dv"));

        for (WebElement screen_sizes_element : screen_sizes_elements) {

            boolean screen_size_matches = screen_sizes_element.getText().contains(screen_size);
            if (screen_size_matches) {
                number_of_results_left = screen_sizes_element.findElement(By.className("_1QnaN"))
                        .getText()
                        .replace("(", "")
                        .replace(")", "");

                screen_sizes_element.click();
            }
        }

    }

    @Then("^I see the same number of the results displayed$")
    public void i_see_the_same_number_of_the_results_displayed () throws Throwable {

        List<WebElement> results_displayed = Browser.driver().findElements(By.className("_36ILa"));

        WebElement number_of_results = results_displayed.get(results_displayed.size() - 1);

        Assert.assertEquals(number_of_results.getText(), number_of_results_left);
    }

}
