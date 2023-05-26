package GroupProject2;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver[] webDrivers = {new ChromeDriver(),
                new FirefoxDriver(),
                new SafariDriver()};

        for (WebDriver w : webDrivers) {
            w.close();
            w.open();
            w.getTitle();




        }
    }
}