package Calisma;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class FrameWindowWaitOdevler extends BaseStaticDriver {
    public static void main(String[] args) {
//        1
//        driver.get("http://demo.guru99.com/test/guru99home/");
//        Bekle(1);
//        driver.switchTo().frame("a077aa5e");
//        WebElement img = driver.findElement(By.xpath("//*[@src='Jmeter720.png']/.."));
//        img.click();
//        for (String winHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(winHandle); }
//
//        WebElement phyton = driver.findElement(By.xpath("(//a[@href='/python-tutorials.html'])[2]"));
//        phyton.click();
//        for (String winHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(winHandle); }
//        Assert.assertEquals("https://www.guru99.com/python-tutorials.html", driver.getCurrentUrl());
//        System.out.println("Done!!!");
//        BekleVeKapat();
//        2
//        driver.get("https://chercher.tech/practice/frames");
//        driver.switchTo().frame("iamframe");
//
//        WebElement topic = driver.findElement(By.cssSelector("input[type='text']"));
//        topic.sendKeys("Hayat kisa");
//        Bekle(1);
//        driver.switchTo().frame("frame3");
//        WebElement checkBox = driver.findElement(By.id("a"));
//        checkBox.click();
//        Bekle(1);
//        driver.switchTo().defaultContent();
//        Bekle(1);
//        driver.switchTo().frame("frame2");
//        WebElement animals = driver.findElement(By.id("animals"));
//        animals.click();
//        Bekle(1);
//        Select animal = new Select(animals);
//        animal.selectByIndex(2);
//        BekleVeKapat();
//        3
//        driver.get("https://chercher.tech/practice/frames");
//        driver.switchTo().frame("iamframe");
//
//        WebElement topic = driver.findElement(By.cssSelector("input[type='text']"));
//        topic.sendKeys("Bu da gecer ya HU");
//        Bekle(1);
//        driver.switchTo().frame("frame3");
//        WebElement checkBox = driver.findElement(By.id("a"));
//        checkBox.click();
//        Bekle(1);
//        driver.switchTo().defaultContent();
//        Bekle(1);
//        driver.switchTo().frame("frame2");
//        WebElement animals = driver.findElement(By.id("animals"));
//        animals.click();
//        Bekle(1);
//        Select animal = new Select(animals);
//        animal.selectByIndex(3);
//        BekleVeKapat();
//        4
//        driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//        int wednesday = 0;
//        int dongu = 0;
//        do {
//            WebElement select = driver.findElement(By.id("select-demo"));
//            select.click();
//            Bekle(1);
//            List<WebElement> days = driver.findElements(By.cssSelector("select[id='select-demo'] >option"));
//
//            days.get((int) (Math.random() * 7 + 1)).click();
//
//            WebElement secilen = driver.findElement(By.cssSelector("p[class='selected-value']"));
//
//            if (secilen.getText().equals("Day selected :- Wednesday")) {
//                wednesday++;
//            }
//            dongu++;
//            driver.navigate().refresh();
//            Bekle(2);
//        } while (wednesday < 5);
//        System.out.println("Dongu sayisi= " + dongu);
//        System.out.println("Wednesday bulma sayisi= " + wednesday);
//        BekleVeKapat();
//
//        5
//        driver.navigate().to("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
//        WebElement downloadBtn = driver.findElement(By.id("downloadButton"));
//        downloadBtn.click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement webDriverText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
//        Bekle(1);
//        WebElement complete = driver.findElement(By.xpath("//button[text()='Close']"));
//        complete.click();
//        BekleVeKapat();
//
//        6
//        driver.navigate().to("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
//        WebElement downloadBtn = driver.findElement(By.id("cricle-btn"));
//        downloadBtn.click();
//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        WebElement webDriverText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='100%']")));
//        BekleVeKapat();
//
//        7
//        driver.get("https://business.twitter.com/en/solutions-new.html");
//        String title1 = driver.getTitle();
//        System.out.println("title1 = " + title1);
//        Bekle(1);
//        WebElement accept = driver.findElement(By.xpath("//button[text()='Accept']"));
//        accept.click();
//
//        Bekle(1);
//        WebElement developer = driver.findElement(By.cssSelector("[title='Developer blog']"));
//        developer.click();
//        Bekle(1);
//
//        Set<String> windowIdler = driver.getWindowHandles();
//        for (String id : windowIdler) {
//            driver.switchTo().window(id);
//        }
//        Bekle(1);
//        String title2 = driver.getTitle();
//        System.out.println("title2 = " + title2);
//
//        driver.close();
//
//        Set<String> windowIdler2 = driver.getWindowHandles();
//        for (String id : windowIdler2) {
//            driver.switchTo().window(id);
//        }
//        Bekle(1);
//
//        String title3 = driver.getTitle();
//        System.out.println("title3 = " + title3);
//
//        Assert.assertEquals(title1, title3);
//        Assert.assertNotEquals(title1, title2);
//        BekleVeKapat();
//
//        8
//        driver.get("https://business.twitter.com/en/solutions-new.html");
//        String title1 = driver.getTitle();
//        System.out.println("title1 = " + title1);
//        Bekle(1);
//        WebElement accept = driver.findElement(By.xpath("//button[text()='Accept']"));
//        accept.click();
//
//        Bekle(1);
//        WebElement developer = driver.findElement(By.cssSelector("[title='Developer blog']"));
//        developer.click();
//        Bekle(1);
//
//        Set<String> windowIdler = driver.getWindowHandles();
//        for (String id : windowIdler) {
//            driver.switchTo().window(id);
//        }
//        Bekle(1);
//        String title2 = driver.getTitle();
//        System.out.println("title2 = " + title2);
//
//        driver.close();
//
//        Set<String> windowIdler2 = driver.getWindowHandles();
//        for (String id : windowIdler2) {
//            driver.switchTo().window(id);
//        }
//        Bekle(1);
//
//        String title3 = driver.getTitle();
//        System.out.println("title3 = " + title3);
//
//        Assert.assertEquals(title1, title3);
//        Assert.assertNotEquals(title1, title2);
//        BekleVeKapat();
//        9
//        driver.get("https://www.naukri.com/");
//        String anasayfaId = driver.getWindowHandle();
//        System.out.println("anasayfaId = " + anasayfaId);
//        System.out.println("driver.getTitle() = " + driver.getTitle());
//        Bekle(1);
//        Set<String> windowIdler = driver.getWindowHandles();
//        for (String id : windowIdler) {
//            if (id.equals(anasayfaId)) continue;
//            driver.switchTo().window(id).close(); }
//        Bekle(1);
//        driver.switchTo().window(anasayfaId);
//        Bekle(3);
//        WebElement services = driver.findElement(By.cssSelector("a[href='https://resume.naukri.com/resume-services?fftid=100001&id=']"));
//        services.click();
//        Bekle(2);
//        Set<String> windowIdler4 = driver.getWindowHandles();
//        for (String id : windowIdler4) {
//            driver.switchTo().window(id);
//            System.out.println("id = " + id);  }
//        Bekle(2);
//        String sayfa2Id = driver.getWindowHandle();
//        System.out.println("driver.getTitle() = " + driver.getTitle());
//        System.out.println("sayfa2Id = " + sayfa2Id);
//        Bekle(1);
//        driver.switchTo().window(sayfa2Id);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Bekle(3);
//
//        js.executeScript("window.scrollBy(0,1000)");
//
//        Bekle(2);
//        WebElement lookingForPromotion = driver.findElement(By.cssSelector("a[href='/articles/how-to-get-a-promotion/?fftid=homepage_desk_rev']"));
//        lookingForPromotion.click();
//        Bekle(3);
//
//        Set<String> windowIdler3 = driver.getWindowHandles();
//        for (String id : windowIdler3) {
//            driver.switchTo().window(id); }
//        String sayfa3Id = driver.getWindowHandle();
//
//        Set<String> windowIdler2 = driver.getWindowHandles();
//        for (String id : windowIdler2) {
//            if (id.equals(sayfa3Id)) continue;
//            driver.switchTo().window(id).close();
//        }
//        Bekle(1);
//        driver.switchTo().window(sayfa3Id);
//
//
//        String url1 = driver.getCurrentUrl();
//        System.out.println("url1 = " + url1);
//        Assert.assertEquals("https://resume.naukri.com/articles/how-to-get-a-promotion/?fftid=homepage_desk_rev", url1);
//        10
//        driver.get("http://the-internet.herokuapp.com/windows");
//        Bekle(1);
//        String url1=driver.getCurrentUrl();
//        System.out.println("url1 = " + url1);
//        String anaSayfa= driver.getWindowHandle();
//
//        WebElement clickHere=driver.findElement(By.cssSelector("a[href='/windows/new']"));
//        clickHere.click();
//        Set<String> windowIdler = driver.getWindowHandles();
//        for (String id : windowIdler) {
//            driver.switchTo().window(id); }
//
//        String yeniSayfa= driver.getWindowHandle();
//        Bekle(1);
//
//        String url2=driver.getCurrentUrl();
//        System.out.println("url2 = " + url2);
//
//        Set<String> windowIdler2 = driver.getWindowHandles();
//        for (String id : windowIdler) {
//            if (id.equals(anaSayfa)) continue;
//            driver.switchTo().window(id).close();
//        }
//Bekle(2);
//        driver.switchTo().window(anaSayfa);
//        Bekle(2);
//
//        String url3=driver.getCurrentUrl();
//        System.out.println("url3 = " + url3);
//        Assert.assertEquals(url1,url3);
//
//        BekleVeKapat();


    }


}
