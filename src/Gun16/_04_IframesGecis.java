package Gun16;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_IframesGecis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        //1. frame gec ve yaziyi yaz
        driver.switchTo().frame("frame1");
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Turkiye");


        driver.switchTo().frame("frame3");// iframe3==>iframe1 icindeki iframe
        WebElement clickButton= driver.findElement(By.id("a"));
        clickButton.click();

        driver.switchTo().defaultContent();//bir kerede ana dizine variyor //home
        //driver.switchTo().parentFrame();//iki tane kullanilirsa ancak esas dizine cikiyor//back demek
        //driver.switchTo().parentFrame();

        driver.switchTo().frame("frame2");
        WebElement eanimal=driver.findElement(By.id("animals"));
        Select animal = new Select(eanimal);
        animal.selectByIndex(3);


        BekleVeKapat();


    }
}
