package Gun16;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _07_ClosingWindows extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        String anasayfaId = driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : linkler) {
            link.click();
        }

        Set<String> windowIdler = driver.getWindowHandles();//acik sayfalarin tum idleri alindi

        for (String id : windowIdler) {
            if (id.equals(anasayfaId)) continue;
            System.out.println("id= " + id);
            driver.switchTo().window(id);
            Bekle(2);
            driver.close();

        }


        // driver en son yukarıdaki kapatılan sayfaya switch olmuştu onu gösteriyordu,
        // eğer alttaki anasayfaya switch eden set eden komut olmasa idi, driver kapatılan sayfayı gösterdiğinden
        // hata verecekti.Bu yüzden en son stiwch işlemini yaparak driver ı ana sayfaya set(switch) ettik

        driver.switchTo().window(anasayfaId);
        System.out.println("driver.getTitle() = " + driver.getTitle());



        BekleVeKapat();


    }
}
