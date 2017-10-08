# which
To run tests you need to have Java, [maven](https://maven.apache.org/), chrome and [chrome driver](https://sites.google.com/a/chromium.org/chromedriver/) for your operating system.
You need to change `System.setProperty("webdriver.chromedriver", "C:\\Users\\Aneta\\IdeaProjects\\Which_test");` line in Browser.java to point to the chrome driver.

Then you can run `mvn test` from project directory.
