package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_findingElemensByTag extends BaseStaticDriver {
    public static void main(String[] args) {
//baseStaticDriverin tum static kismi buraya gelmis oldu
        driver.get("http://www.practiceselenium.com");

        List<WebElement> liliste = driver.findElements(By.tagName("li"));// // tagname yani etiketi li olan bütün elemalar

        for (WebElement e : liliste) {
            System.out.println(e.getText());
        }

        BekleVeKapat();

//                <a href=""></a>
//                driver.findElements(By.tagName("a"));
//                getText()=""    bu kod ile interviewdw bos tagleri nasil bulurusunuz diye bir soru sorulmus
    }


}
