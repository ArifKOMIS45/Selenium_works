package Gun18;

/*
    Senaryo
    1- https://www.yogaalliance.org/ sitesine gidiniz.
    2- Become a Member menüsünden  Teachers  a tıklatınız.
    3- Çıkan sayfanın title ının "Teachers | Yoga Alliance"  olup olmadığını assert ile kontrol ediniz.
 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.yogaalliance.org/");
        WebElement member= driver.findElement(By.cssSelector("a[href='https://www.yogaalliance.org/Designations/How_to_Join']"));
        Actions aksiyonlar=new Actions(driver);
        Bekle(2);
        Action aksiyon= aksiyonlar.moveToElement(member).build();aksiyon.perform();

        Bekle(2);
        WebElement teachers= driver.findElement(By.cssSelector("a[href='https://www.yogaalliance.org/Credentialing/Credentials_for_Teachers']"));
        Action aksiyon2= aksiyonlar.moveToElement(teachers).click(teachers).build();
        aksiyon2.perform();
        Bekle(2);
        Assert.assertEquals("Teachers | Yoga Alliance",driver.getTitle());

        BekleVeKapat();

    }
}
