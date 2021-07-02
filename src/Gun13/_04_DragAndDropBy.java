package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonlar=new Actions(driver);

        WebElement solSurgu=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
        Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu, 100-1, 0).build(); // aksiyonu hazırla

        Bekle(3);
        aksiyon.perform();

        Bekle(3);
        BekleVeKapat();
    }
}
