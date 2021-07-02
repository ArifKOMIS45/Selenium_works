package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class senaryo3Kendim extends BaseStaticDriver {
    public static void main(String[] args) {

        Login();
        List<WebElement> addItems = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));

        for (WebElement e : addItems) {
            e.click();
        }

        WebElement chart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        chart.click();

        List<WebElement> removeItems = driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));

        for (WebElement e : removeItems) {
            e.click();
        }

        WebElement chartItems= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Assert.assertEquals("",chartItems.getText());

        System.out.println("done!!!");


BekleVeKapat();







    }

    public static void Login() {
        driver.get("https://www.saucedemo.com/");

        //lodin islemi
        WebElement usernamelogin = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernamelogin.sendKeys("standard_user");

        WebElement passwordlogin = driver.findElement(By.xpath("//input[@id='password']"));
        passwordlogin.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();


    }
}
