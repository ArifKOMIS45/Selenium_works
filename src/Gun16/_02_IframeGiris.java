package Gun16;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_IframeGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);//index e gore bulma(1. yontem)
        //driver.switchTo().frame("frame1");//id veya name ile bulunabilir(2. yontem)

//        WebElement elementFrame1= driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(elementFrame1);//bu sekilde sayfaya gecebilir(3. yontem)



        WebElement input= driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Turkiye");


        BekleVeKapat();







    }
}
