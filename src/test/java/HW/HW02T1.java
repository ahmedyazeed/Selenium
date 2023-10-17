package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02T1 {

        public static void main(String[] args) {
//instance
            WebDriver driver = new ChromeDriver();
// goto facebook.com
            driver.get("http://35.175.58.98/Xpath.php");
//        maximize the window
            driver.manage().window().maximize();

            WebElement field1=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));
            field1.sendKeys("Field1HomeWork");

            WebElement field2=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
            field2.sendKeys("Field2HomeWork");





        }
    }

