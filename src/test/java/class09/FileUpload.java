package class09;

import org.openqa.selenium.*;
import utils.CommonMethods;

import java.io.File;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/upload-image.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        find the upload element
        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='image-file']"));
//        make sure to change the path
        fileUpload.sendKeys("C:\\Users\\ahmed\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-07-22 122153.png");

    }
}