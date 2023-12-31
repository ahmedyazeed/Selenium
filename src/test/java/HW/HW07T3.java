package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

/*
goto http://35.175.58.98/table-pagination-demo.php

print the rows that have status  "in progress"

no use of contains method allowed
*/
public class HW07T3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/table-search-filter-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        List<WebElement> tableRows = driver.findElements(By.xpath("//table/tbody/tr"));
        for (WebElement tableRow : tableRows) {
            List<WebElement> tableCells = tableRow.findElements(By.xpath("td"));

            for (WebElement tableCell : tableCells) {
                String textCell = tableCell.getText();
                if (textCell.equals("in progress")) {
                    System.out.println(tableRow.getText());

                }
            }
        }}}