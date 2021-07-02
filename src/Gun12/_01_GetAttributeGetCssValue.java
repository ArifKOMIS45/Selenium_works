package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));

        //tag in içdeki keylerin değerlerini almamızı sağlar
        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));
        System.out.println(inputValEnter.getAttribute("class"));

        // Elemeanın CSS yani ekran gözüken tüm özelliklerini; font renk vs ulaşmamızı sağlar
        System.out.println(inputValEnter.getCssValue("color"));
        System.out.println(inputValEnter.getCssValue("font-size"));
        System.out.println(inputValEnter.getCssValue("background"));

        BekleVeKapat();
    }
}
