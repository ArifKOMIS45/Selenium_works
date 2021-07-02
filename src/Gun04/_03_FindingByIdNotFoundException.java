package Gun04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/selenyum/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        try {

            WebElement eleman = driver.findElement(By.id("bulamadığında ne olacak"));
            System.out.println(eleman.getText());
        } catch (Exception ex) {
            System.out.println("eleman bulunamadı");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
