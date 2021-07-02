package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        Action aksiyon= aksiyonlar.dragAndDrop(oslo, norvec).build();
        Bekle(3);
        aksiyon.perform();


        WebElement washington=driver.findElement(By.id("box3"));
        WebElement Us=driver.findElement(By.id("box103"));


        Action aksiyon2= aksiyonlar.dragAndDrop(washington,Us).build();
        Bekle(3);
        aksiyon2.perform();

        BekleVeKapat();
    }
}
