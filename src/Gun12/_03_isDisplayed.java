package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        Bekle(2);
        WebElement cookiesAccept=driver.findElement(By.cssSelector("button[title='Accept All']"));
        cookiesAccept.click();

        Bekle(2);
        WebElement btnYeniHesap=driver.findElement(By.cssSelector("a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        btnYeniHesap.click();

        WebElement firstName=driver.findElement(By.name("firstname")); // adını girdik
        firstName.sendKeys("ismet");

        Bekle(2);
        WebElement lastName=driver.findElement(By.name("lastname")); // soyadını girdik
        lastName.sendKeys("temur");

        WebElement email=driver.findElement(By.name("reg_email__")); // email girdik
        WebElement email2=driver.findElement(By.name("reg_email_confirmation__")); // 2.email girdik
        System.out.println(email2.isDisplayed()); // false;

        email.sendKeys("ismet@hotmail.com");
        Bekle(2);
        System.out.println(email2.isDisplayed()); // true;
        email2.sendKeys("ismet@hotmail.com");

        BekleVeKapat();
    }
}
