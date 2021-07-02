package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class denme extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        //lodin islemi
//        WebElement usernamelogin = driver.findElement(By.xpath("//input[@id='user-name']"));
//        usernamelogin.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//div[contains(@class,'login_password')]"));
//        WebElement passwordlogin = driver.findElement(By.xpath("//input[@id='password']"));
//        passwordlogin.sendKeys(password);
//
//        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
//        login.click();


        List<String> mnm=new ArrayList<>();
        mnm.add(password.getText().split("\n")[1]);
       mnm.forEach(System.out::println);
        driver.quit();


    }
}
