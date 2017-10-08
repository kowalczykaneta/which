package which.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    static{
        System.setProperty("webdriver.chromedriver", "C:\\Users\\Aneta\\IdeaProjects\\Which_test");
    }

    private static WebDriver driver = new ChromeDriver();

    public static WebDriver driver()
    {
        return driver;
    }

    public static void open(String url) {
        driver.get(url);
    }

    public static void close() {
        driver.close();
    }


}
