package Gun14;
/*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clickMe1=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();
        Bekle(3);

        driver.switchTo().alert().accept(); // Alert kutucuğuna geçildi ve TAMAM butonuna basıldı.

        BekleVeKapat();
    }
}
