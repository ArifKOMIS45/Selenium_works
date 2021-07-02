package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo2 extends BaseStaticDriver {
    public static void main(String[] args) {

            driver.navigate().to("https://www.saucedemo.com/");

            String userlist = driver.findElement(By.xpath("//div[@class='login_credentials']")).getText();

            String[] userDizi = userlist.split("\n");

            String passwordText = "secret_sauce";

            for (int i = 1; i < userDizi.length; i++) {
                WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
                username.sendKeys(userDizi[i]);

                WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
                passwordInput.sendKeys(passwordText);

                WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
                login.click();

                try {
                    WebElement correction = driver.findElement(By.xpath("//span[@class='title']"));
                    Assert.assertEquals("PRODUCTS", correction.getText());
                    driver.navigate().back();
                } catch (Exception e) {
                    WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
                    System.out.println(userDizi[i] + " " + errorMessage.getText());
                    driver.navigate().refresh();
                }
            }


            BekleVeKapat();


        }
}
