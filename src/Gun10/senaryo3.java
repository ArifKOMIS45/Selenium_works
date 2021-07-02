package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class senaryo3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");

        login();
        List<WebElement> products=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement e:products) {
            e.click();
        }


        WebElement wagenButton= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        wagenButton.click();

        List<WebElement> productsRemove=driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
        for (WebElement e:productsRemove) {
            e.click();

        }

        String wagenButton1=driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
        String str="";

        Assert.assertEquals(wagenButton1,str);

        BekleVeKapat();





    }



    public static void login(){



        WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

       Bekle(2);

        WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        Bekle(2);



    }

 }


