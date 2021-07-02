package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkPartialText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenyum/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        // sadece a tag lerinde çalışır
        WebElement element = driver.findElement(By.partialLinkText("Passion"));
        System.out.println(element.getAttribute("href"));

        Thread.sleep(3000);
        driver.quit();
    }
}
