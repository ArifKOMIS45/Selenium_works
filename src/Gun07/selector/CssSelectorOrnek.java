package Gun07.selector;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business = driver.findElement(By.cssSelector("input[id$='4586_0']"));
        business.click();

        WebElement discoveXYZ = driver.findElement(By.cssSelector("select[id$='4588']"));
        discoveXYZ.click();


        WebElement online = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        online.click();


        WebElement everyDay = driver.findElement(By.cssSelector("input[id$='89585_0']"));
        everyDay.click();


        WebElement good = driver.findElement(By.cssSelector("input[id$='4589_0']"));
        good.click();


        WebElement usingXYZ = driver.findElement(By.cssSelector("select[id$='4597']"));
        usingXYZ.click();

        WebElement secenek3 = driver.findElement(By.cssSelector("select[id$='4597'] > :nth-child(4)"));
        secenek3.click();


        good.click();//mouse baska bir yere gitmesi icin ekranda yaptigimiz tam gorunsun diye
        Bekle(4);
        BekleVeKapat();

    }


}
