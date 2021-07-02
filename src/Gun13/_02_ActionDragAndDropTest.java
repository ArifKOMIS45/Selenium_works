package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class _02_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement btnBank=driver.findElement(By.id("credit2"));
        WebElement kutuBank=driver.findElement(By.id("bank"));

        Action aksiyon=aksiyonlar.dragAndDrop(btnBank, kutuBank).build();
        Bekle(2);
        aksiyon.perform();


        Bekle(2);
        //WebElement kutuIci=driver.findElement(By.cssSelector(" #bank > li"));
        Assert.assertTrue(kutuBank.getText().equals(btnBank.getText())  );


        System.out.println(kutuBank.getText());
        System.out.println(btnBank.getText());
        BekleVeKapat();
    }
}
