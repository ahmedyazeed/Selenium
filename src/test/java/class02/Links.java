package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
       List<WebElement> links= driver.findElements(By.tagName("a"));

       for (WebElement link:links){
          String nameOfLink=link.getText();
           System.out.println(nameOfLink);
           String linkVal=link.getAttribute("href");
           System.out.println(linkVal);

            /*       if clear() command not work , we will discuss in class why it might not work on some pages
                the alternative to clear is

        userName.sendKeys(Keys.CONTROL + "a");
        userName.sendKeys(Keys.DELETE);*/

       }

    }
}
