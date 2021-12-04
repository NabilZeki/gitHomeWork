package OopProject;


//IMPLEMENTING THE DIAGRAM

public class WebDriverTester {

  public static void main(String[] args) {

      ChromeDriver chromeDriver = new ChromeDriver();
      chromeDriver.open();
      chromeDriver.navigate();
      System.out.println("Title is : "+chromeDriver.getTitle("Google Chrome"));
      chromeDriver.getScreenshot();
      chromeDriver.close();

      System.out.println("______________________________________________");

      FirefoxDriver firefoxDriver = new FirefoxDriver();
      firefoxDriver.open();
      firefoxDriver.navigate();
      System.out.println("Title is : "+firefoxDriver.getTitle("Firefox"));
      firefoxDriver.getScreenshot();
      firefoxDriver.close();

      System.out.println("______________________________________________");

      SafariDriver safariDriver = new SafariDriver();
      safariDriver.open();
      safariDriver.navigate();
      System.out.println("Title is : "+safariDriver.getTitle("Safari"));
      safariDriver.getScreenshot();
      safariDriver.close();

  }
}
