package Calisma;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class youTubeGununSorusu extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://www.youtube.com/");

        WebElement search = driver.findElement(By.id("search"));
        search.sendKeys("Yemek");
        Bekle(2);

        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);



        int a = 20;
        for (int i = 0; i < a; i++) {
            Bekle(1);
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("window.scrollBy(0,3000)");
            Bekle(2);
            List<WebElement> liste = driver.findElements(By.cssSelector("[class='style-scope ytd-item-section-renderer']"));
            if (liste.size() > 100){ break;}
            System.out.println(liste.size());
        }

        Bekle(4);
        BekleVeKapat();

    }
}
