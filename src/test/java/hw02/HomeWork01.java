package hw02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class HomeWork01 extends TestBase

{
    //https://testcenter.techproeducation.com/index.php?page=dropdown sayfasına gidelim
    //programming languages ddm den istediğiniz 4 seçeneği seçiniz
    //sadece seçili olan option'ları yani seçenekleri yazdıralim
    //Seçeneklerden 4 tane seçtiğimizi doğrulayalım
    //Seçtiğimiz seçeneklerden ilkini yazdıralım, ilk seçeneğin Java olduğunu doğrulayalım
    //Seçtiğimiz seçeneklerin hepsini kaldıralim
    //visibleText olarak seçim yapacağımız bir method oluşturup programming languages ddm den bir seçenek seçelim


    @Test
    public void test01()
    {
        //https://testcenter.techproeducation.com/index.php?page=dropdown sayfasına gidelim
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //programming languages ddm den istediğiniz 4 seçeneği seçiniz
        WebElement programmingBox= driver.findElement(By.xpath("//select[@name='Languages']"));
        Select selectProgramming=new Select(programmingBox);

        selectProgramming.selectByIndex(0);
        selectProgramming.selectByIndex(1);
        selectProgramming.selectByIndex(2);
        selectProgramming.selectByIndex(3);


        //sadece seçili olan option'ları yani seçenekleri yazdıralim
        List<WebElement> seciliProgramlar=selectProgramming.getAllSelectedOptions();
        seciliProgramlar.forEach(t-> System.out.println(t.getText()));

        //Seçeneklerden 4 tane seçtiğimizi doğrulayalım
       int secenekSayisi= seciliProgramlar.size();
        System.out.println("secenekSayisi = " + secenekSayisi);

        //Seçtiğimiz seçeneklerden ilkini yazdıralım, ilk seçeneğin Java olduğunu doğrulayalım
        System.out.println("ilk seçili program:"+selectProgramming.getFirstSelectedOption().getText());
        Assert.assertEquals("Java",selectProgramming.getFirstSelectedOption().getText());

        //Seçtiğimiz seçeneklerin hepsini kaldıralim
        //visibleText olarak seçim yapacağımız bir method oluşturup programming languages ddm den bir seçenek seçelim

    }
}
