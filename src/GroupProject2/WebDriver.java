package GroupProject2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{
    public void open(){

    }
   public void close(){

    }
   public String getTitle(){
        return getTitle();
    }
   public void getScreenshot(){

    }
    public void navigate(){

    }

}
class FirefoxDriver implements RemoteWebDriver{

    public void open(){

    }
    public void close(){

    }
    public String getTitle(){
        return getTitle();
    }
    public void getScreenshot(){

    }
    public void navigate(){

    }

}

class SafariDriver implements RemoteWebDriver{
    public void open(){

    }
    public void close(){

    }
    public String getTitle(){
        return getTitle();
    }
    public void getScreenshot(){

    }
    public void navigate(){

    }

}


