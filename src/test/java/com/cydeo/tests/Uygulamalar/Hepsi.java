package com.cydeo.tests.Uygulamalar;

import org.testng.annotations.Test;

public class Hepsi {
    @Test
    public void uygulamlar() {
        //1- Internet sitesi Açma
        //Driver.getDriver().get(".......");

        //2-Cookieleri kabul etme
        //WebElement cookies = Driver.getDriver().findElement(By.xpath(".........."));
        //cookies.click();

        //3-olduğun sayfayı kapatmak
        // Driver.closeDriver();

        //4-çalıtığın tüm sayfaları kapatmak
        //driver.quit();


        //5-Title (başlık) onaylama
        //1. yol String title = driver.getTitle();
        // System.out.println("Title of the page: "+ title);
        //if(title.equals("...."){
        // System.out.println("test passed");
        //}else{
       // System.out.println("test failed");
        //2. yol String title = Driver.getDriver().getTitle();

        //6-Sayfayı tam sayfa yapma
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //7-konumlandırmak
        //WebElement element = Driver.getDriver().findElement(By....".....");

        //8- boşlıuğa bir şeyler yazmzak
       // ....... .sendKeys("....." + Keys.Enter);

        //9-Checkbox'ı locate etme
        //WebElement checkbox= Driver.getDriver().findElement(By.id(""));
        //checkbox.isSelected - .isEnabled //burada bir de "+soutv" yapıyorsun
        //checkbox.click();
        //checkbox.getAttribute("checked") = sayfada tıklanıp tıklanmadığını kontrol ederken kullanabılırsın

        //10-radioButton
        //burada "value" ya da "id"  farklı oluyor
        //WebElement ...btn= Driver.findElement(By...("..."));
        //...btn.click();
        //...btn.isSelected + soutv
        //

        //11-findElements()
        //ortak Attribute bul! "name", "type"
        //List<WebElement> allColors = Driver.findElement(By.name("color"));
        //allColors.size(). +soutv
        //for(WebElement eachColors: allColors){
        //sout ("Current radiobutton is "+eachColor.getAttribute("id"));
        //sout ("Is it enabled? "+eachColor.isEnabled());
        //sout ("Is it selected "+eachColor.isSelected());
        //}

        //12-Dropdown
        //WebElement dropDownElement = Driver.findElement(By.id("..."));
        //Select selectObj = new Select(dropDownElement);
        //selectObj.selectByIndex(2); /Index 0'dan başlıyor buna dikkat
        // selectObj.selectByValue("..");
        //selectObj.selectByVisibleText("......");
        //Verify=
        //String expectedOpt = "....";
        //String actualOpt = selectObj.getFirstSelectedOption().getText();
        //if(actualOpt.equals(expectedOpt){
        //sout ("Option ... selection passed");
        //}else{
        //sout ("Option ... selection failed")
        //}

        //13- Multiple Dropdown Selection
        //WebElement multiItemDrop = Driver.findElement(By.name("..."));
        //Select multiItemSelect = new Select (multiItemDrop);
        //multiItemSelect.isMultiple().+soutv;
        //multiItemSelect.selectByIndex(.);
        //multiItemSelect.selectByValue("..");
        //multiItemSelect.selectByVisibleText(".....");
        //multiItemSelect.deselectByIndex();
        //multiItemSelect.deselectByValue("..");
        //multiItemSelect.deselectByVisible("....");
        //multiItemSelect.deselectAll();

        //14-HTML Dropdown without SelectTag
        // WebElement dropdownLink = Driver.findElement(By...("..."));
        //dropdownLink.click();
        //WebElement item....= Driver.findElement(By....("..."));
        //item...click();

        //15-TestNG
        //@Test ve Assert. bu sayede artık "main" kullanmıyoruz






    }
}
