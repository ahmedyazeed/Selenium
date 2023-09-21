package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {

    public static void main(String[] args) {
        //        instance
        WebDriver driver =new ChromeDriver();
//        naviagte to the website
        driver.get("https://www.facebook.com");
//        maximize the window
        driver.manage().window().maximize();

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("Ahmedyazeed86@gmail.com");

        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("1234");

        WebElement loginBtn= driver.findElement(By.name("login"));
        loginBtn.click();

         /*       if clear() command not work , we will discuss in class why it might not work on some pages
                the alternative to clear is

        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);*/





    }
}
