package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();
       WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("Ahmedyazeed86");
        WebElement profileBox=driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("Ahmed Hassan");
        WebElement feedbackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("website isnt working");
//        feed back from raj
        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("website is working");
        WebElement email = driver.findElement(By.cssSelector("//input[@class='form-control' and @name='email']"));
        email.sendKeys("ahmedyazeed86@gmail.com");
        WebElement courseTopics = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");
        WebElement introToAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introToAdv.sendKeys("welcome");
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");
    }
}


