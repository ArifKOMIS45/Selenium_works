package Gun17;


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //hangi elemana kadar scroll yapilacaksa o eleman bulunur
        WebElement element= driver.findElement(By.cssSelector("a[class='massive-button']"));
        js.executeScript("arguments[0].scrollIntoView()", element);

        //argumenst[0] virgulden sonraki ilk elemen gozukene kadar scroll yap

        Bekle(2);
        js.executeScript("arguments[0].click()",element);//bu elemana click yapar


        BekleVeKapat();
    }
}
