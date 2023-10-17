package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03T1 {
    public static void main(String[] args) throws InterruptedException {
/*Navigate to http://35.175.58.98/basic-checkbox-demo.php.
Check the if Checkbox1 is enabled
If Checkbox1 is disabled:
Click on the "enable checkboxes" button.
Verify that Checkbox1 is now enabled.
Click on Checkbox1.
Confirm that Checkbox1 is selected.
*/
      WebDriver driver=new ChromeDriver();
      driver.get("http://35.175.58.98/basic-checkbox-demo.php");
      driver.manage().window().maximize();

      WebElement checkBox1=driver.findElement(By.xpath("//input[@value='Checkbox-1']"));
      boolean checkBox1isEnabled=checkBox1.isEnabled();
      if(checkBox1isEnabled){
          System.out.println("checkBox 1 is Enabled");
      }
      else {
          System.out.println("checkBox 1 is Not Enabled");
      }

      WebElement enableChkBoxesBtn= driver.findElement(By.cssSelector("button#enabledcheckbox"));
      enableChkBoxesBtn.click();
        boolean secondTestCheckBox1isEnabled=checkBox1.isEnabled();

      if(secondTestCheckBox1isEnabled){
            System.out.println("checkBox 1 is Enabled");
        }
        else {
            System.out.println("checkBox 1 is Not Enabled");
        }
        checkBox1.click();
        boolean checkBox1isSelected=checkBox1.isSelected();
        if (checkBox1isSelected){System.out.println("checkBox 1 is Selected");}
        else {System.out.println("checkBox 1 is Not Selected");}


    }
}
