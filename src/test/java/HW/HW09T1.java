package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HW09T1 extends CommonMethods {
    /*HW1:
goto http://35.175.58.98/table-pagination-demo.php
print all the rows with remarks pass
remember to print rows from all pages of tables*/
    public static void main(String[] args) {
        String url="http://35.175.58.98/table-pagination-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
int counter=0;
        for (int j = 0; j <3; j++) {
            List<WebElement>  cells = driver.findElements(By.xpath("//table/tbody/tr/td[7]"));
            for (int i = 0; i < cells.size(); i++) {
                String currentCellText = cells.get(i).getText();
                if (currentCellText.equals("Pass")) {
                    counter++;
                    WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" +(i+1)+ "]"));
                    System.out.println(row.getText());

                }
            }
            WebElement nextBtn = driver.findElement(By.xpath("//a[@class='next_link']"));
            nextBtn.click();

        }
        System.out.println();
        System.out.println("This is an extra step just for me to know that the number of employees with remarks pass is "+counter);


            }

        }



