package Gun05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_sendKeys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        WebElement element = driver.findElement(By.linkText("Check Out"));
        element.click();//clickledik

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("arifkomis@gmail.com");//bilgi gonderdik

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Arif");

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("kim demis olmaz diye");

        WebElement btn = driver.findElement(By.className("btn-primary"));
        btn.click();

        WebElement menu = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuTex = menu.getText();//kontrol ettik
        Assert.assertEquals("Menu", menuTex);

        String url = driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?", url);


        Thread.sleep(3000);
        driver.quit();

    }
}




