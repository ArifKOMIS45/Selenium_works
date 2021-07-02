package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo2Kendim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");


        WebElement logins = driver.findElement(By.xpath("//div[@id='login_credentials']"));
        String loginsText = logins.getText();
        String[] strlogs = loginsText.split("\n");

        WebElement passwordText = driver.findElement(By.xpath("//div[contains(@class,'login_password')]"));
        String realpassword = passwordText.getText().split("\n")[1];

        for (int i = 1; i < strlogs.length; i++) {
            WebElement usernamelogin = driver.findElement(By.xpath("//input[@id='user-name']"));
            usernamelogin.clear();
            usernamelogin.sendKeys(strlogs[i]);


            WebElement passwordlogin = driver.findElement(By.xpath("//input[@id='password']"));
            passwordlogin.clear();
            passwordlogin.sendKeys(realpassword);//"secret_sauce"


            WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
            login.click();


            try {
                WebElement btnproducts = driver.findElement(By.xpath("//span[@class='title']"));
                Assert.assertEquals("PRODUCTS", btnproducts.getText());
                driver.navigate().back();

            } catch (Exception exception) {
                WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
                System.out.println((strlogs[i] + " " + errorMessage.getText()));
                driver.navigate().refresh();

            }

        }

        BekleVeKapat();


    }
}
