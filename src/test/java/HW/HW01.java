package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement userName=driver.findElement(By.name("username"));

        userName.sendKeys("Admin");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginBtn=driver.findElement(By.tagName("button"));
        loginBtn.click();



    }
}
