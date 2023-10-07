package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

//        find the dropdown
        WebElement dd = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        create an object of the select class
        Select sel =new Select(dd);

        //Select
        sel.selectByVisibleText("Texas");

        sel.selectByValue("Florida");

        Thread.sleep(3000);
        //deselect
        sel.deselectByVisibleText("Texas");

//          check wether the dropdown is multiselect or not
        System.out.println( sel.isMultiple());

    }
}


