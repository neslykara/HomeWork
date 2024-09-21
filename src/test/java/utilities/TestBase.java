package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public abstract class TestBase
{
    public WebDriver driver;

    @Before
    public void setUp() throws Exception
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws Exception
    {
        //driver.quit();
    }

    //HARD WAIT
    public void wait(int second)
    {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Select VisibleText
    public  void selectVisible(WebElement ddm,String option)
    {
        Select select=new Select(ddm);
        select.selectByVisibleText(option);
    }

    //Select Index DDM
    public void selectIndex(WebElement ddm,int index)
    {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //Window Handles
    public void window(int index)
    {
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }


    //Iframe index
    public void frameIndex(int index)
    {
        driver.switchTo().frame(index);
    }
}
