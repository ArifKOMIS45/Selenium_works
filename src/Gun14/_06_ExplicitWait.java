package Gun14;
/*
    İnterview Sorusu :  Implicit ve Explicit

    Implicitliy : Bütün elemanlar için geçerli,Bir kere tanımlanır.
    Explicit    : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur

    Her ikisi tanımlı ise : önce Implicit kullanılır, ve üzerine Explicit in süresi eklenerek
                                  toplam hata sınır süresi ortaya çıkmış olur.

    ExpectedConditions
        .titleIs -> title bu olana kadar bekle
                                     .titleContains -> title ın da bu kelime geçene kadar bekle
                                     .urlToBe -> url bu olana kadar bekle
                                     .urlContains -> url de bu kelime geçene kadar bekle
                                     .visibilityOfElementLocated -> eleman var ve gözükür olana kadar bekle
                                     .visibilityOfTheElement -> eleman gözükene kadar bekle
                                     .InvisibilityOfTheElement -> eleman kaybolana kadar bekle
                                     .elementToBeClickable -> eleman tıklanabilir olana kadra bekle
                                     .elementToBeSelected -> eleman seçilebilir olana kadra bekle
                                     .textToBe -> elemanda verilen txt gözükene kadar bekle.
                                     .alertIsPresent()  -> alert çıkana kadar bekle.
                                     .visibilityOfAllElementsLocatedBy -> locator ile bütün elemanlari gözükene kadar bekle
                                     .visibilityOfAllElements -> Verilen elemanların listesindeki tüm elemanlar gözrünür olana kadar bekle
                                     .numberOfElementsToBe  -> verilen locatora sahip elemanların sayısı bu olana kadar bekle
                                     .numberOfElementsToBeLessThan -> verilen locatora sahip elemanların sayısı verilenden az olana kadar bekle
                                     .numberOfElementsToBeMoreThan -> verilen locatora sahip elemanların sayısı verilenden fazla olana kadar bekle



 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _06_ExplicitWait extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        button.click();

        //WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        WebDriverWait wait=new WebDriverWait(driver, 60);
        WebElement webDriverText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        // Bu locaterdaki eleman , html içinde hem bulup hem de gözükene kadar bekle.


        BekleVeKapat();
    }
}