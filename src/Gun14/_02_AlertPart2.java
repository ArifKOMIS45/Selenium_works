package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_AlertPart2  extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe2=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe2.click();
        Bekle(3);

        driver.switchTo().alert().dismiss(); // Cancel

        WebElement textActual=driver.findElement(By.id("confirm-demo"));
        Assert.assertEquals("You pressed Cancel!", textActual.getText());

//        BekleVeKapat();
    }
}
