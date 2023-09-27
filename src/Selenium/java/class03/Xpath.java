package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

        public static void main(String[] args) {
//instance
            WebDriver driver = new ChromeDriver();
// goto facebook.com
            driver.get("http://35.175.58.98/Xpath.php");
//        maximize the window
            driver.manage().window().maximize();
           WebElement textBox1= driver.findElement(By.xpath("//input[@id='title']"));
           textBox1.sendKeys("ahmedyazeed86");
           WebElement displayName= driver.findElement(By.xpath("//input[@name='title']"));
           displayName.sendKeys("Ahmed Hassan");
           WebElement securityQuestionBox= driver.findElement(By.xpath("//input[contains(@name,'security')]"));
            securityQuestionBox.sendKeys("what is the color of the sun? White");
           WebElement theMagicalText= driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
            System.out.println(theMagicalText.getText());
            WebElement apiSettingsBox= driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
            apiSettingsBox.sendKeys("abracadabra");

            WebElement email1=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
            email1.sendKeys("hello@gmail.com");

            WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
            email2.sendKeys("canicomein@gmail.com");

            WebElement email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
            email3.sendKeys("welomce@gmail.com");
            WebElement field1=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
            field1.sendKeys("cat");

            WebElement field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
            field2.sendKeys("caterpillar");





        }
    }

