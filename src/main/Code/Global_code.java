package Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by himanshu on 06/22/2017.
 */
public class Global_code {
    public WebDriver driver;


    public WebDriver webdriver_code() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver_win32new\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        return driver;
    }

}
