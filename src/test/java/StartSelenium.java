import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preconditions(){
        wd = new ChromeDriver();
    }

    @Test
    public void startGoogle(){
        wd.get("https://www.google.co.il/");
     //   wd.navigate().to("https://www.google.co.il/");
    }

    @AfterMethod
    public void tearDown(){
        //wd.close();
        wd.quit();
    }
}
