package Gun18;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
   Senaryo :
        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
        2- Login işlemini yapınız.
        3- Welcome yazan sağ üst tarafta kullanıcı adının geçip geçmediğini kontrol ediniz.
        4- Eğer Kullanıcı adınız gözükmüyorsa , ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.
 */


public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get(" https://opensource-demo.orangehrmlive.com/");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");


        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();

        List<WebElement> hataMesaji=driver.findElements(By.id("spanMessage"));
        if (hataMesaji.size()==0)//login olabilmis
        {
            System.out.println("Login oldum:Cunku sayfada bu hata mesaji bulunamadi");
        }
        else
        {//hata olmus
            System.out.println("Login olamadi:cunki hala ayni sayfadayim.");
        }
        //ekran kaydini alalim
        TakesScreenshot ts= (TakesScreenshot) driver;//1. asamada ekran goruntusunu olan degiskenizimiz tanimladik
        File ekranDosyasi=ts.getScreenshotAs(OutputType.FILE);//2. asamada alinacak ekran dosyasinin tipi secilerek hafizada tutuluyor

        //FileUtils.copyFile(ekranDosyasi,new File("ekran goruntuleri/Orange/LoginKontrol"+zamanBilgisi+".png"));

        // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
        // jpg,bmp,gif .. olabilir.

        // odev buradaki dosya adini bagli hale getiriniz ki hep ustune kaydetmesin

        BekleVeKapat();
    }
}
