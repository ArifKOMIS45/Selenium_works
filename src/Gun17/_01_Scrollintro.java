package Gun17;
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        //Javascript komutlarini calistirmak icin js tanimlandi
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,3000)");
        //Javascript komutu internetten bulunarak
        //"window.scroolBy(0,3000)" windowu kodlanir
        //burada sayfa 3000 kaydirilir
        Bekle(2);
        js.executeScript("window.scrollBy(0,-3000)");
        BekleVeKapat();


    }
}
