package class02;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsExamples {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.id("txtUsername"));
        Thread.sleep(2000);
        userName.sendKeys("abracadabra");
        Thread.sleep(2000);
        userName.clear();
        Thread.sleep(2000);
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginBtn=driver.findElement(By.className("button"));

        loginBtn.click();
        //to get the text welcome admin and print on the console
        WebElement welcomeMsg=driver.findElement(By.linkText("Welcome Admin"));
        String msg=welcomeMsg.getText();
        System.out.println("the message is "+msg);








        /*WebDriver driver =new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Ahmed");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Hassan");
        WebElement email= driver.findElement(By.className("form-control-01"));
        email.sendKeys("ahmedyazeed86@gmail.com");
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();
        WebElement linkBtn=driver.findElement(By.linkText("Link"));
        linkBtn.click();
        WebElement clickHere=driver.findElement(By.partialLinkText("Here."));
        clickHere.click();*/




    }
}
