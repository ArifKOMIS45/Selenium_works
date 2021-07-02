package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenyum/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        // sadece a tag lerinde çalışır
        WebElement element = driver.findElement(By.linkText("Check Out"));
        System.out.println(element.getAttribute("data-title"));
        System.out.println(element.getAttribute("data-url"));


        Thread.sleep(3000);
        driver.quit();


    }
}
