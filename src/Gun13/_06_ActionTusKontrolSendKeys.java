package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionTusKontrolSendKeys  extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar=new Actions(driver);

        WebElement txtBox=driver.findElement(By.id("autoCompleteSingleInput"));

        Action aksiyon=aksiyonlar
                .moveToElement(txtBox) // inputa gidildi.
                .click() // içine tıklandı.
                .keyDown(Keys.SHIFT) // büyük harf için önce SHIFT tuşuna basıldı.
                .sendKeys("a") // a tuşuna basığımızda shift basılı olduğundan büyük yazdı
                .keyUp(Keys.SHIFT) // büyük harf için bastığımız tuş kontrolünü geri aldık
                .sendKeys("hmet") // kalanını küçük harf yazdı.
                .build();

        Bekle(2);
        aksiyon.perform();

        BekleVeKapat();
    }
}
