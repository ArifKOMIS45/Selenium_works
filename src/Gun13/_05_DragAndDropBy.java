package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonlar=new Actions(driver);

        WebElement surguCubugu=driver.findElement(By.id("slider-range"));
        WebElement solSurgu=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
        WebElement sagSurgu=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
        Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu, -100, 0).build(); aksiyon.perform();
        Action aksiyon2=aksiyonlar.dragAndDropBy(sagSurgu, 200, 0).build(); aksiyon2.perform();

        double cubukGenislik= surguCubugu.getSize().width;
        System.out.println("cubukGenislik = " + cubukGenislik);

        double surguOrani=  cubukGenislik/500;  // her bir dolar için kaç birim surgu gidiyor. 500 dolar için 502

        // 200 -400 arası yapmak için.
        Bekle(4);
        Action aksiyonSol = aksiyonlar.dragAndDropBy(solSurgu, (int)(200*surguOrani), 0).build();aksiyonSol.perform();
        Action aksiyonSag = aksiyonlar.dragAndDropBy(sagSurgu, (int)(-100*surguOrani), 0).build();aksiyonSag.perform();
        Bekle(2);

        Bekle(3);
        BekleVeKapat();
    }
}