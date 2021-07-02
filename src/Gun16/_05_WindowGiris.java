package Gun16;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : linkler) {
            link.click();
        }

        Set<String> windowIdler = driver.getWindowHandles();

        for (String id:windowIdler
             ) {
            System.out.println("id= "+id);
        }

        BekleVeKapat();
    }


}
//        id= CDwindow-AE17844470138625C169E7A99D1EA3EC
//        id= CDwindow-0673238D52DBA24D64DF46A3855E348A
//        id= CDwindow-14AC882ABE183F6D55720DB137EF5718