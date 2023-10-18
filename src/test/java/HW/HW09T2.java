package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class HW09T2 extends CommonMethods {
    /*HW2:
select the date from calendar "5th Dec 1998"

https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker
*/
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker ";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement iframe = driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(iframe);
        boolean notFound=true;
        WebElement calendarBox = driver.findElement(By.xpath("//input[@id='datepicker']"));
        calendarBox.click();

while (notFound){

        WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
        String currentYear = year.getText();

        WebElement calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String currentMonth = calendarMonth.getText();
        if (currentMonth.equals("December")&&currentYear.equals("1998")){
            WebElement day = driver.findElement(By.xpath("//a[text()='5']"));
            day.click();
            System.out.println("the current date is 5th Dec 1998");
            notFound=false;
        }
        else {WebElement prevBtn = driver.findElement(By.xpath("//span[text()='Prev']"));
            prevBtn.click();}

            }

        }}



