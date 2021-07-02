package Gun18;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

public class _01_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        driver.manage().window().maximize();
        Bekle(3);
        Dimension yeniOlcu = new Dimension(400, 600);
        driver.manage().window().setSize(yeniOlcu);

        Bekle(1);

        Dimension suankiOlculer = driver.manage().window().getSize();
        System.out.println("suankiOlculer.width = " + suankiOlculer.width);
        System.out.println("suankiOlculer.width = " + suankiOlculer.height);

        BekleVeKapat();
    }
}
