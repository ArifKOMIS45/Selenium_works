package Gun14;
/*
    Selenium Bekletme Konusu
    Thread.Sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

    Implicitly Wait :
    Tüm sayfadaki elemanlar için bir bekleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
    Bütüm elemanlar için geçerli.NoSuchElement hatası nı vermek için verilen süre kadar,  eleman bulunana kadar bekler.

      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);


    pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class _05_WaitsGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        WebElement button=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        button.click();

        //Bekle(30);
        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        BekleVeKapat();
    }
}
