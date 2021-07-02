package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        Actions aksiyonlar=new Actions(driver);

        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
        Action aksiyon = aksiyonlar.moveToElement(doubleClickButton).doubleClick().build();
        aksiyon.perform();

        Bekle(3);
        BekleVeKapat();
    }
}
