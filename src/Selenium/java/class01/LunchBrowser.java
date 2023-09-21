package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //        declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();

//       use the driver.get() method
        driver.get("https://www.google.com");
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
       String currentUrl= driver.getCurrentUrl();
        System.out.println("the current url is: "+currentUrl);
        String title=driver.getTitle();
        System.out.println("the title of the page is: "+title);
        Thread.sleep(2000);
        driver.quit();
    }
}
