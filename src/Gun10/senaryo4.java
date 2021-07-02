package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class senaryo4 extends BaseStaticDriver {
    public static void main(String[] args) {
        login();

        List<WebElement> elementList=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        ArrayList<String> elements=new ArrayList<>();

        for (WebElement e:elementList) {

            elements.add(e.getText());

        }
        List<WebElement> products=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement e:products) {
            e.click();

        }


        WebElement wagenButton= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        wagenButton.click();



        List<WebElement> SepetelementList=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        ArrayList<String> Sepetelements=new ArrayList<>();

        for (WebElement e:SepetelementList) {

            Sepetelements.add(e.getText());

        }

        for (int i = 0; i <elements.size() ; i++) {
            Assert.assertEquals("Ürünler eşit değil", elements.get(i), Sepetelements.get(i));

        }


       BekleVeKapat();


    }

    public static void login() {
        driver.navigate().to("https://www.saucedemo.com/");

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

