package Gun05.Proje1.Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenyum/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        WebElement fName = driver.findElement(By.id("userName"));
        fName.sendKeys("Automation");


        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("testing@gmail.com");

        WebElement currentAddressl = driver.findElement(By.id("currentAddress"));
        currentAddressl.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement checkName = driver.findElement(By.id("name"));
        String rcheckName = checkName.getText();
        Assert.assertEquals("Name:Automation", rcheckName);

        WebElement checkEmail = driver.findElement(By.id("email"));
        String rcheckEmail = checkEmail.getText();
        Assert.assertEquals("Email:testing@gmail.com", rcheckEmail);


        System.out.println("Done!!!");
        Thread.sleep(3000);
        driver.quit();

    }
}
