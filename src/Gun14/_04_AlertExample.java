package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_AlertExample extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement submit=driver.findElement(By.cssSelector("input[name='submit']"));
        submit.click();
        Bekle(2);

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

       // BekleVeKapat();
    }
}