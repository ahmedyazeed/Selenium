package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass extends CommonMethods {
    public static void main(String[] args) {

        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action=new Actions(driver);
        action.moveToElement(hover).perform();
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));
        //action.dragAndDrop(draggable,dropLocation).perform();

        //Whenever we are chaining more than 1 method in action class we have to use .build() and by
        // the end of any action .perform();

        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();
           /*
        So basically, the build() method in Selenium is used to create a composite action that
         contains all the actions gathered which are ready to be performed.
         The perform() method is used to execute the chain of actions
         which are built using the Action build method
        */
    }
}
