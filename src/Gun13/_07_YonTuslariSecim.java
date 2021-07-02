package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_YonTuslariSecim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar=new Actions(driver);

        WebElement txtBox=driver.findElement(By.id("autoCompleteMultipleInput"));

        Action aksiyon=aksiyonlar
                .moveToElement(txtBox)
                .click()
                .sendKeys("b").build();
        aksiyon.perform();

        Bekle(2);

        aksiyon=aksiyonlar.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();

        Bekle(3);
        BekleVeKapat();
    }
}
