package Gun16;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Çıkan alerte accept yapınız.

     wait.until(ExpectedConditions.alertIsPresent());
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsunS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsunS6.click();
        WebElement addChart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addChart.click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
        BekleVeKapat();


    }

}
