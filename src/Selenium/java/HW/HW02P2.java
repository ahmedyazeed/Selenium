package HW;
/*goto https://demoqa.com/text-box
and use xpath to fill the form
and xumit it*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02P2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName= driver.findElement(By.xpath("//input[@autocomplete='off']"));
        fullName.sendKeys("Ahmed Hassan");
        WebElement email= driver.findElement(By.xpath("//input[@autocomplete='off' and @placeholder='name@example.com']"));
        email.sendKeys("Ahmedyazeed86@gmail.com");
        WebElement address= driver.findElement(By.xpath("//textarea[contains(@placeholder,'Address')]"));
        address.sendKeys("Falls Church, VA, USA");
        WebElement permanentAddress= driver.findElement(By.xpath("//textarea[starts-with(@id,'permanent')]"));
        permanentAddress.sendKeys("Cairo, Egypt");
        WebElement submitBtn= driver.findElement(By.xpath("//button[@id='submit']"));
        submitBtn.click();

    }
}

