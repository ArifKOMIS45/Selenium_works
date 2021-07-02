package Gun16;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _06_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        String anasayfaId = driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : linkler) {
            link.click();
        }

        Set<String> windowIdler = driver.getWindowHandles();//acik sayfalarin tum idleri alindi

        for (String id : windowIdler) {
            if (id.equals(anasayfaId)) continue;//anasayfayi atladik
            //String islemlerde
            //equals-->degerleri karsilastiriyor
            //== hafizadaki yerlere karsilastiriyor

            System.out.println("id= " + id);
            driver.switchTo().window(id);

            System.out.println("driver.getTitle() = " + driver.getTitle());

        }

        BekleVeKapat();

        //output
        /* id= CDwindow-26B9F0FD4FAAC5DEC6243DDE6993F7A2
            driver.getTitle() = NAACP Legal Defense and Educational Fund, Inc.
            id= CDwindow-7C4C342FA23F8E00C1C9677B6DB28248
            driver.getTitle() = Donate to the Equal Justice Initiative
        */


    }
}
