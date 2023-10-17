package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03T2 {
    public static void main(String[] args) throws InterruptedException {
/*Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.
*/
      WebDriver driver=new ChromeDriver();
      driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
      driver.manage().window().maximize();

     WebElement femaleRadioBox= driver.findElement(By.xpath("//input[@value='gender-female']"));
     boolean femaleRadBoxIsDisplayed=femaleRadioBox.isDisplayed();
     if (femaleRadBoxIsDisplayed){
         System.out.println(" Female radio box is Displayed");
     }
     else {
         System.out.println(" Female radio box is Not Displayed");
     }
     WebElement showBtn=driver.findElement(By.cssSelector("button#toggleRadioButtons"));
     showBtn.click();
     Thread.sleep(1000);
    boolean secondChkFemaleRadBtn=femaleRadioBox.isDisplayed();
     if (secondChkFemaleRadBtn){
        System.out.println(" Female radio box is Displayed");
    }
     else {
        System.out.println(" Female radio box is Not Displayed");
    }
}}
