package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement cookiesAccept=driver.findElement(By.cssSelector(".wt-btn.wt-btn--filled.wt-mb-xs-0"));
        cookiesAccept.click();  // button[class='wt-btn wt-btn--filled wt-mb-xs-0']

        WebElement mucevher=driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye=driver.findElement(By.id("side-nav-category-link-10873"));

        Action aksiyon=aksiyonlar.moveToElement(mucevher).build(); aksiyon.perform();
        Bekle(4);
        aksiyon=aksiyonlar.moveToElement(kolye).build(); aksiyon.perform();

        Bekle(5);
        BekleVeKapat();
    }
}
