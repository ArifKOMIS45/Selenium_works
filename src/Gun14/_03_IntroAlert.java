package Gun14;

/*interview sorusu ..Alertleri nasil kullaniriz....driver.switch().alert() bununl kullaniriz
komutlari:
accept -->Ok tamam butonuna basmamizi sagliyor
dismiss:cancel


*/

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _03_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        

        WebElement clickMe3= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe3.click();
        driver.switchTo().alert().sendKeys("Arif");
        Bekle(3);

        driver.switchTo().alert().accept();

        WebElement textActual= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(textActual.getText().contains("Arif"));

        BekleVeKapat();




    }
}
