package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW05T1 {
    public static void main(String[] args) throws InterruptedException {
/*click the checkbox
then select the  babycat
then enter topic name
all of this must be done in the same order*/
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame("dropdownIframe");

        WebElement DD = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(DD);
        select.selectByVisibleText("Baby Cat");

    }}