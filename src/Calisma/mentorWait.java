package Calisma;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mentorWait extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement box = driver.findElement(By.cssSelector("input[type='checkbox']"));
        box.click();

        WebElement remove = driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
        remove.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement x = wait.until(ExpectedConditions.elementToBeClickable(remove));

        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
        BekleVeKapat();

    }
}
