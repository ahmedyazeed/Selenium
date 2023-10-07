package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW05T2 {
    /*HW2:
goto gmail.com
click on help
click on privacy
click on terms
switch the focus on terms page and get the title and print on screen
then switch the focus back to the gmail page
and print the title of the main page on screen*/
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        termsBtn.click();
        /*switch the focus on terms page and get the title and print on screen
then switch the focus back to the gmail page
and print the title of the main page on screen*/
        String gmailWindowHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for ( String handle: allHandles){
            driver.switchTo().window(handle);
            String currentTitle = driver.getTitle();
            if (currentTitle.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                break;

            }
        }System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(gmailWindowHandle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}
