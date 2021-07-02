package Gun04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) throws InterruptedException {

        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        System.setProperty("webdriver.chrome.driver", "C:/selenyum/Driver/chromedriver.exe");

        // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım: driver
        WebDriver driver = new ChromeDriver();

        // siteyi açtım
        driver.get("https://www.techno.study/");


        Thread.sleep(3000);
        driver.quit();

    }
}