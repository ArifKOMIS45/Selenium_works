package Gun14;

/*interview sorusu ..Alertleri nasil kullaniriz....driver.switch().alert() bununl kullaniriz
komutlari:
accept -->Ok tamam butonuna basmamizi sagliyor
dismiss:cancel


*/

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _02_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        


        WebElement clickMe2= driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe2.click();
        Bekle(3);

        driver.switchTo().alert().dismiss();//alert kutucuguna gecildi ve cancel butonuna basildi

        BekleVeKapat();




    }
}
