package review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTag {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        //        click on the dropdown
        WebElement DD = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        DD.click();

//        get all the options
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

//        select peru
        for(WebElement option :options){
            String textOfElement = option.getText();
            if(textOfElement.equals("Peru")){
                option.click();
                break;
            }
        }
    }
}