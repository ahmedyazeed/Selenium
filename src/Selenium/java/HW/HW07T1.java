package HW;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

/*http://35.175.58.98/synchronization-explicit-wait.php
click to open alert and handle it

click to change text and get the changed text

click to get hidden button click on it

click to get the checkbox selected and print if it is selected or not*/
public class HW07T1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertBtn.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        WebElement changeTextBtn = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeTextBtn.click();
        WebElement textElement = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        wait.until(ExpectedConditions.textToBePresentInElement(textElement,"Ssyntaxtechs"));
        String text=textElement.getText();
        System.out.println(text);

        WebElement displayBtn = driver.findElement(By.xpath("//button[@id='display_button']"));
        displayBtn.click();
        WebElement checkBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBtn.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        System.out.println("checkbox is selected : "+checkBox.isSelected());

    }}