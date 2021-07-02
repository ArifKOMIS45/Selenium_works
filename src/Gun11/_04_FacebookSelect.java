package Gun11;

/*
   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_FacebookSelect extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        WebElement createNew= driver.findElement(By.cssSelector("[id^='u_0_2_'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createNew.click();

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Arif");

        WebElement lastName= driver.findElement(By.name("lastname"));
       lastName.sendKeys("Komis");

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("arifkomis@gmail.com");

        WebElement reg_email_confirmation= driver.findElement(By.name("reg_email_confirmation__"));
        reg_email_confirmation.sendKeys("arifkomis@gmail.com");

        WebElement regPassword= driver.findElement(By.name("reg_passwd__"));
        regPassword.sendKeys("arifkomis1976");


        WebElement birthDay=driver.findElement(By.id("day"));
        Select day=new Select(birthDay);
        day.selectByValue("21");

        WebElement birthmonth=driver.findElement(By.id("month"));
        Select month=new Select(birthmonth);
        month.selectByValue("3");

        WebElement birthYear=driver.findElement(By.id("year"));
        Select year=new Select(birthYear);
        year.selectByValue("1976");



    }
}
