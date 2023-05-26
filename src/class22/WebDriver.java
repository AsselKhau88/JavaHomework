package class22;

public abstract class WebDriver {
  abstract void openBrowser();

    abstract void loadUrl(String url);

    abstract void performTesting();

    abstract  void closeBrowser();
}
class ChromeDriver extends WebDriver{
    @Override
    void openBrowser(){
        System.out.println("Opening Google Chrome");
    }
    void loadUrl(String url){
        System.out.println("Loading website on Google Chrome "+url);
    }
    void performTesting(){
        System.out.println("Testing the Webpage");
    }

    @Override
    void closeBrowser() {
        System.out.println("Closing the Webpage");
    }
}