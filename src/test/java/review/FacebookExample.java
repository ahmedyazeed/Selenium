package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        // goto facebook.com
        driver.get("https://www.facebook.com/");
//        maximize the window
        driver.manage().window().maximize();

//        find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        //        fill in the first name
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Ahmed");

    }
}
