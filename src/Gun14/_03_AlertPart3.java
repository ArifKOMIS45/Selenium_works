package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe2=driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe2.click();
        Bekle(2);

        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept();

        WebElement textActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue( textActual.getText().contains("ismet"));

        BekleVeKapat();
    }
}
