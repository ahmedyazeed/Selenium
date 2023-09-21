package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        //        instance
        WebDriver driver =new ChromeDriver();
//        naviagte to the website
        driver.get("http://35.175.58.98/input-form-locator.php");
//        maximize the window
        driver.manage().window().maximize();

//        locate the WebElement first name
        WebElement firstName = driver.findElement(By.id("first_name"));
//        use send keys to send the data to WebElement
        firstName.sendKeys("Ahmed");

//        locate the WebElement last name
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Hassan");

        WebElement email= driver.findElement(By.className("form-control-01"));
        email.sendKeys("ahmedyazeed86@gmail.com");

        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();

        WebElement linkBtn=driver.findElement(By.linkText("Link"));
        linkBtn.click();

        WebElement clickHere=driver.findElement(By.partialLinkText("Here."));
        clickHere.click();

 /*       if clear() command not work , we will discuss in class why it might not work on some pages
                the alternative to clear is

        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);*/




    }
}
