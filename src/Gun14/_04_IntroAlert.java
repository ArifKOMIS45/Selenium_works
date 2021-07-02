package Gun14;


import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _04_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/delete_customer.php");
        

        WebElement submit= driver.findElement(By.name("submit"));
        submit.click();
        Bekle(3);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Bekle(3);

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();



        BekleVeKapat();




    }
}
