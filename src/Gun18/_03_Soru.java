package Gun18;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testsheepnz.github.io/BasicCalculator.html");
        for (int i = 0; i < 5; i++) {
            Bekle(2);
            int n1 = (int) (Math.random() * 100 + 1);
            WebElement number1 = driver.findElement(By.id("number1Field"));
            number1.sendKeys(String.valueOf(n1));
            int n2 = (int) (Math.random() * 100 + 1);
            WebElement number2 = driver.findElement(By.id("number2Field"));
            number2.sendKeys(String.valueOf(n2));

            WebElement selectOperationDropdown = driver.findElement(By.id("selectOperationDropdown"));
            Select operation = new Select(selectOperationDropdown);

            int sonuc = 0;
            for (WebElement islem : operation.getOptions()) {
                islem.click();
               Bekle(2);
               if (!islem.getText().equals("Concatenate")){
               WebElement integerOnly=driver.findElement(By.id("integerSelect"));
                integerOnly.click();
               }
                Bekle(2);
                WebElement calculate = driver.findElement(By.id("calculateButton"));
                calculate.click();
                Bekle(2);
                switch (islem.getText()) {

                    case "Add":
                        sonuc = n1 + n2;
                        Assert.assertEquals(sonuc, Integer.parseInt(driver.findElement(By.id("numberAnswerField")).getAttribute("value")));
                        break;

                    case "Subtract":
                        sonuc = n1 - n2;
                        Assert.assertEquals(sonuc, Integer.parseInt(driver.findElement(By.id("numberAnswerField")).getAttribute("value")));
                        break;

                    case "Multiply":
                        sonuc = n1 * n2;
                        Assert.assertEquals(sonuc, Integer.parseInt(driver.findElement(By.id("numberAnswerField")).getAttribute("value")));
                        break;

                    case "Divide":
                        sonuc = n1 / n2;
                        Assert.assertEquals(sonuc, Integer.parseInt(driver.findElement(By.id("numberAnswerField")).getAttribute("value")));
                        break;

                    case "Concatenate":
                        sonuc = Integer.parseInt(String.valueOf(n1) + String.valueOf(n2));
                        Assert.assertEquals(String.valueOf(sonuc), driver.findElement(By.id("numberAnswerField")).getAttribute("value"));
                        break;
                }
                Bekle(2);
                WebElement clear = driver.findElement(By.id("clearButton"));
                clear.click();
            }Bekle(2);
            driver.navigate().refresh();


        }


    }
}
