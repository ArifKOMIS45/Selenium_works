package Gun12;
/*
Elemanları statüsü

isSelect();boolean:  checkbox, radiobutton
isEnabled();boolean
isDisplay();boolean

isEnabled()
Monday : true
Sunday : false

isSelect:
Tuesday : true
Friday  : false

isDisplay()
Monday : true
Sunday : true
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElamaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox"); // siteyi açtım

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected());
        Bekle(2);
        sali.click();
        System.out.println(sali.isSelected());

        BekleVeKapat();
    }
}















