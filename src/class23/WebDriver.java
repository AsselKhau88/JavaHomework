package class23;
/*
Create a WebDriver Interface that will have the
following unimplemented behaviour: openBrowser(),
closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface:
ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window large");
    }

    @Override
    public void findElement() {
        System.out.println("Find");
    }
}

class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("openinig");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding");
    }
}
