package which.pom;

import which.browser.Browser;

import static junit.framework.Assert.assertTrue;

public class WhichTvPage {

    private static String title = "Television reviews - Which?";

    public static void load () {
        Browser.open("http://www.which.co.uk/reviews/televisions");
    }

    public static void isLoaded () {
        assertTrue(Browser.driver().getTitle().equals(title));
    }

    public static void maximize () {
        Browser.driver().manage().window().maximize();
    }

}
