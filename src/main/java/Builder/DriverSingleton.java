package Builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", Constant.CHROMEDRIVER_PATH);
            driver = new ChromeDriver();

        }

        return driver;
    }
    public static void getPomProjectURL(){
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }
    public static void getChallangeURL(){
        driver.get("https://www.google.com");

    }
}
