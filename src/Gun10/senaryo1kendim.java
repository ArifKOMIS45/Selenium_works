package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class senaryo1kendim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        //lodin islemi
        WebElement usernamelogin = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernamelogin.sendKeys("standard_user");

        WebElement passwordlogin = driver.findElement(By.xpath("//input[@id='password']"));
        passwordlogin.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement product : products) {
            System.out.println(product.getText());
        }
        BekleVeKapat();


    }

}
