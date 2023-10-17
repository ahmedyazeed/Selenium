package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

/*
HW1:
goto http://35.175.58.98/table-pagination-demo.php
print all the rows with remarks pass
remember to print rows from all pages of tables */
public class HW08T1 extends CommonMethods {
    public static void main(String[] args) {
        String path="http://35.175.58.98/table-pagination-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(path,browser);
       List <WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));

        for (WebElement cell : table) {
            String text = cell.getText();
            Dimension cellPosition = cell.getSize();
            if (text.equals("Pass")) {
                WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + cellPosition + "]"));
                System.out.println(row.getText());
            }
        }
        }


    }

