package OopProject;

//IMPLEMENTING THE DIAGRAM

public interface WebDriver {
 void open();
 void close();
 String getTitle(String name);
}

interface TakeScreenShot{
 void getScreenshot();
}


interface RemoteWebDriver extends WebDriver, TakeScreenShot{
 void navigate();
}


class SafariDriver implements RemoteWebDriver{
 @Override
 public void open() {
     System.out.println("Opened Safari browser");
 }
 @Override
 public void close() {
     System.out.println("Closed Safari browser");
 }
 @Override
 public String getTitle(String name) {
     return name;
 }

 @Override
 public void navigate() {
     System.out.println("Navigated to Safari browser");
 }

 @Override
 public void getScreenshot() {
     System.out.println("Took screenshot of Safari browser");
 }
}
class FirefoxDriver implements RemoteWebDriver{
 @Override
 public void open() {
     System.out.println("Opened Firefox browser");
 }

 @Override
 public void close() {
     System.out.println("Closed Firefox browser");
 }

 @Override
 public String getTitle(String name) {
     return name;
 }

 @Override
 public void navigate() {
     System.out.println("Navigated to Firefox browser");
 }

 @Override
 public void getScreenshot() {
     System.out.println("Took screenshot of Firefox browser");
 }
}
class ChromeDriver implements RemoteWebDriver{
 @Override
 public void open(){
     System.out.println("Opened Google Chrome browser");
 }
 @Override
 public void close(){
     System.out.println("Closed Google Chrome browser");
 }
 @Override
 public String getTitle(String name){
     return name;
 }
 @Override
 public void navigate(){
     System.out.println("Navigated to Google Chrome browser");
 }
 @Override
 public void getScreenshot(){
     System.out.println("Took screenshot of Google Chrome browser");
 }
}
