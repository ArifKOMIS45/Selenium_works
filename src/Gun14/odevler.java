package Gun14;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class odevler extends BaseStaticDriver {
    public static void main(String[] args) {
//        1
//        driver.get("https://testpages.herokuapp.com/styled/index.html");
//        WebElement alert = driver.findElement(By.cssSelector("a[id='alerttest']"));
//        alert.click();
//        System.out.println(driver.getCurrentUrl());
//
//        2
//        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//        WebElement alert = driver.findElement(By.cssSelector("a[id='alerttest']"));
//        alert.click();
//        System.out.println(driver.getCurrentUrl());
//        driver.navigate().back();
//        System.out.println(driver.getCurrentUrl());
//        WebElement basicAjax = driver.findElement(By.id("basicajax"));
//        basicAjax.click();
//        System.out.println(driver.getCurrentUrl());
//        BekleVeKapat();
//
//        3
//        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//        WebElement findBy = driver.findElement(By.id("findby"));
//        findBy.click();
//        WebElement fiftthElemenet = driver.findElement(By.xpath("//div[@class='specialDiv']/p[5]"));
//        System.out.println(fiftthElemenet.getText());
//
//        4
//        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//        WebElement search = driver.findElement(By.id("search"));
//        search.click();
//        WebElement title = driver.findElement(By.xpath("//h1[text()='The \"Selenium Simplified\" Search Engine']"));
//        System.out.println(title.getText());
//        WebElement search2 = driver.findElement(By.cssSelector("input[type='submit']"));
//        search2.click();
//        System.out.println(driver.getCurrentUrl());
//
//        BekleVeKapat();
//
//        5
//        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//        WebElement calculate = driver.findElement(By.id("calculate"));
//        calculate.click();
//        WebElement number1 = driver.findElement(By.id("number1"));
//        number1.sendKeys("12");
//        WebElement number2 = driver.findElement(By.id("number2"));
//        number2.sendKeys("36");
//        WebElement calculate2 = driver.findElement(By.id("calculate"));
//        calculate2.click();
//        WebElement answer = driver.findElement(By.id("answer"));
//        System.out.println(answer.getText());
//
//        6
//        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//        WebElement fakealerttest = driver.findElement(By.id("fakealerttest"));
//        fakealerttest.click();
//        Bekle(1);
//        WebElement fakealert = driver.findElement(By.id("fakealert"));
//        fakealert.click();
//        Bekle(1);
//        WebElement dialogBox = driver.findElement(By.id("dialog-ok"));
//        dialogBox.click();
//        7
//        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//        WebElement fakealerttest = driver.findElement(By.id("fakealerttest"));
//        fakealerttest.click();
//        Bekle(1);
//        WebElement modalDialog = driver.findElement(By.id("modaldialog"));
//        modalDialog.click();
//        Bekle(1);
//        WebElement dialogBox = driver.findElement(By.id("dialog-ok"));
//        dialogBox.click();
//
//        8
//        driver.navigate().to("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
//        WebElement btnSuccess = driver.findElement(By.id("normal-btn-success"));
//        btnSuccess.click();
//        WebElement close = driver.findElement(By.cssSelector("button[class='close']"));
//        close.click();
//        BekleVeKapat();
//        9
//        driver.navigate().to("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
//        WebElement btnSuccess = driver.findElement(By.id("normal-btn-success"));
//        btnSuccess.click();
//        WebElement close = driver.findElement(By.cssSelector("button[class='close']"));
//        close.click();
//        BekleVeKapat();
//        10
//        driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
//        WebElement checkAll = driver.findElement(By.id("check1"));
//        checkAll.click();
//        Bekle(1);
//        System.out.println(checkAll.getAttribute("value"));
//        BekleVeKapat();
//
//        11
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
//        12
//        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
//        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
//        inputForm.click();
//        WebElement ajaxForm = driver.findElement(By.xpath("//li[@style='display: list-item;'] /a[text()='Ajax Form Submit']"));
//        ajaxForm.click();
//
//        WebElement name = driver.findElement(By.id("title"));
//        name.sendKeys("Arif");
//        WebElement comment = driver.findElement(By.id("description"));
//        comment.sendKeys("Hayat paylasinca guzel");
//
//        WebElement submit= driver.findElement(By.id("btn-submit"));
//        submit.click();
//
//        WebElement submitControl= driver.findElement(By.id("submit-control"));
//        System.out.println(submitControl.getText());
//
//        13
//
//        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
//        WebElement listBox = driver.findElement(By.xpath("//a[text()='List Box']"));
//        listBox.click();
//
//        WebElement boostTrap = driver.findElement(By.xpath("//li[@style='display: list-item;']/a[text()='Bootstrap List Box']"));
//        boostTrap.click();
//        Bekle(1);
//        WebElement dualList = driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
//        dualList.click();
//        Bekle(1);
//        WebElement rightButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-sm move-right']"));
//        rightButton.click();
//        Bekle(1);
//        WebElement dapibus = driver.findElement(By.xpath("//*[text()='Dapibus ac facilisis in']"));
//        dapibus.click();
//        Bekle(1);
//        rightButton.click();
//        Bekle(1);
//        List<WebElement> activeItems = driver.findElements(By.cssSelector("li[class='list-group-item active']"));
//        for (WebElement e:activeItems) {e.click();}
//        Bekle(1);
//        WebElement crasHusto = driver.findElement(By.xpath("//*[text()='Cras justo odio']"));
//        crasHusto.click();
//        Bekle(1);
//        WebElement leftButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-sm move-left']"));
//        leftButton.click();
//        Bekle(1);
//        WebElement morbi = driver.findElement(By.xpath("//div[@class='dual-list list-right col-md-5'] //li[text()='Morbi leo risus']"));
//        morbi.click();
//        Bekle(1);
//        leftButton.click();
//        15
//        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
//
//        WebElement a=driver.findElement(By.id("sum1"));
//        a.sendKeys("12");
//
//        WebElement b=driver.findElement(By.id("sum2"));
//        b.sendKeys("24");
//
//        WebElement total= driver.findElement(By.xpath("//*[text()='Get Total']"));
//        total.click();
//
//        WebElement check= driver.findElement(By.id("displayvalue"));
//        System.out.println(check.getText());




    }
}
