package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
Bu siteye gidiniz.  [https://www.seleniumeasy.com/test/basic-first-form-demo.html]
        (https://www.seleniumeasy.com/test/basic-first-form-demo.html)
        Input forms'a tıklayınız.
        Ajax from Submit'e tıklayınız.
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        Yazıyı yazdırınız.
 */

public class _07_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("ismet");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        WebElement mesaj=driver.findElement(By.id("submit-control"));

        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

        Assert.assertEquals("Form submited Successfully!", mesaj.getText());

    }
}
