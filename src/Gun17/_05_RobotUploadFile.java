package Gun17;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _05_RobotUploadFile extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        WebElement upload = driver.findElement(By.id("file_wraper0"));
        upload.click();

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\chem\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        // Verilen stringi clipboard a set ediyor.

        Robot rbt = new Robot();

        Bekle(2);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Bekle(2);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        Bekle(2);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submit=driver.findElement(By.id("submitbutton"));
        submit.click();

        BekleVeKapat();

    }
}
