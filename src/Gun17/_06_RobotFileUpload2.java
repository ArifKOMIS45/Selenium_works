package Gun17;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_RobotFileUpload2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/upload/");
        WebElement input = driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\chem\\Desktop\\ornek.txt");

        WebElement submit=driver.findElement(By.id("submitbutton"));
        submit.click();

        BekleVeKapat();
    }
}
