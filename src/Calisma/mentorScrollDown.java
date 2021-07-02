package Calisma;
/*
    https://demo.opencart.com/ websitesine git.
    Iphone'u görene kadar scroll down yap.
    Iphone'un altındaki compare buttonuna tıkla.
    Tekrar scroll down yapıp Macbook'un altındaki compare buttonuna tıkla.
    Yeşil bardaki product comparison'a tıkla.
    iki ürünü de Cart'a ekle.
    Yeşil bardaki shopping cart'a tıkla.
    Estimate Shipping n Taxes barına tıkla.
    formu doldur.
    Get Quotes buttonuna tıkla.
    Flat Rate seç.
    Apply Shipping buttonuna tıkla.
    Success mesajını konsola yazdır.
    Aşağı scroll yaptırıp Checkout buttonuna tıkla.
    Kırmızı bardaki error mesajını konsola yazdır.

    */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class mentorScrollDown extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.opencart.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();

        Bekle(2);
        js.executeScript("window.scrollBy(0,600)");

        driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
        Bekle(2);
        driver.findElement(By.cssSelector("a[href='https://demo.opencart.com/index.php?route=product/compare']")).click();

        List<WebElement> addChart = driver.findElements(By.cssSelector("input[value='Add to Cart']"));
        for (WebElement a : addChart) {
            a.click();
        }
        Bekle(2);
        driver.findElement(By.xpath("(//a[@href='https://demo.opencart.com/index.php?route=checkout/cart'])[3]")).click();

        driver.findElement(By.cssSelector("a[href='#collapse-shipping']")).click();
        js.executeScript("window.scrollBy(0,400)");

        Select ulke=new Select(driver.findElement(By.id("input-country")));
        ulke.selectByValue("215");

        Select sehir=new Select(driver.findElement(By.id("input-zone")));
        ulke.selectByValue("3370");

        driver.findElement(By.id("input-postcode")).sendKeys("45700");

        driver.findElement(By.id("button-quote")).click();

        driver.findElement(By.name("shipping_method")).click();
        Bekle(1);
        driver.findElement(By.id("button-shipping")).click();
        Bekle(1);

        Assert.assertEquals(" Success: Your shipping estimate has been applied!",driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());






         BekleVeKapat();
    }
}
