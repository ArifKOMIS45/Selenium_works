package Gun16;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IframesGecis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        //1. frame gec ve yaziyi yaz
        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Turkiye");

        //ayni siradaki diger frame gecis icin mutlaka geri donulmeli
        driver.switchTo().defaultContent();

        //2. frame gec oradaki 3.elemani sec
        driver.switchTo().frame(1);
        //driver.switchTo().parentFrame();//buda olabilir

        WebElement eanimal=driver.findElement(By.id("animals"));
        Select animal = new Select(eanimal);
        animal.selectByIndex(2);


        BekleVeKapat();


    }
}
