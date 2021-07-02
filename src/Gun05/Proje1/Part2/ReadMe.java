package Gun05.Proje1.Part2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

        6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        WebElement btn = driver.findElement(By.id("log-in"));
        btn.click();

        WebElement yazi = driver.findElement(By.id("time"));
        String read = yazi.getText();
        Assert.assertEquals("Your nearest branch closes in: 30m 5s", read);

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.applitools.com/app.html", url);

        System.out.println("done!!!");
        Thread.sleep(3000);
        driver.quit();

    }
}
