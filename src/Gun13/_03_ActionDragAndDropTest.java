package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement sales=driver.findElement(By.id("credit1"));
        WebElement account=driver.findElement(By.id("loan"));

        //Drag drop un bir diğer yöntemi
        Action aksiyon= aksiyonlar.clickAndHold(sales).moveToElement(account).release().build();
        Bekle(2);
        aksiyon.perform();

        BekleVeKapat();
    }
}
