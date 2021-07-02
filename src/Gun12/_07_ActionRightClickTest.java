package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionRightClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        Actions aksiyonlar=new Actions(driver);

        WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
        Action aksiyon = aksiyonlar.moveToElement(rightClickBtn).contextClick().build(); // context :sağ clik
        aksiyon.perform();

        Bekle(3);
        BekleVeKapat();
    }
}
