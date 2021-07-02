package Gun07.selector2;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class xpatOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        //lodin islemi
        WebElement usernamelogin = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernamelogin.sendKeys("standard_user");

        WebElement passwordlogin = driver.findElement(By.xpath("//input[@id='password']"));
        passwordlogin.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        //birinci urun ekleme
        WebElement sauceLab = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        sauceLab.click();

        WebElement addsouceto = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addsouceto.click();

        WebElement backToProducts = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();

        //ikici urun ekleme
        WebElement sauceLabsBoltTShirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        sauceLabsBoltTShirt.click();

        WebElement addsauceLabsBoltTShirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addsauceLabsBoltTShirt.click();

        //sepete tiklama tiklama
         WebElement chart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        chart.click();

        //checkout
        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();

        WebElement checkName = driver.findElement(By.xpath("//input[@id='first-name']"));
        checkName.sendKeys("Arif");

        WebElement checkSurname = driver.findElement(By.xpath("//input[@id='last-name']"));
        checkSurname.sendKeys("Kaya");

        WebElement checkPostcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        checkPostcode.sendKeys("776678");

        WebElement clickContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        clickContinue.click();

        //hesap ozeti kontrolu
//        WebElement totalmoney=driver.findElement(By.xpath("//div[@class='summary_total_label']"));
//        String total= totalmoney.getText();
//        Assert.assertEquals("Total: $49.66",total);
//        System.out.println("done!!!");
//
//        BekleVeKapat();
        double itemsExpextedPrices =0;
        List<WebElement> item1Prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement e:item1Prices) {

             itemsExpextedPrices +=Double.parseDouble(e.getText().replaceAll("[^0-9.]",""));
        }
       WebElement itemTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double itemTotalPrice=Double.parseDouble(itemTotal.getText().replaceAll("[^0-9.]",""));

        Assert.assertEquals(itemsExpextedPrices, itemTotalPrice, 0.0);
        

BekleVeKapat();



    }
}
