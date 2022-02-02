package Challange;

import Builder.DriverSingleton;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class ClassChallange {
    public static void TabTest () throws InterruptedException {
        ((JavascriptExecutor) DriverSingleton.getDriverInstance()).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(DriverSingleton.getDriverInstance().getWindowHandles());
        DriverSingleton.getDriverInstance().switchTo().window(tabs.get(1));
     DriverSingleton.getDriverInstance().navigate().to("https://www.youtube.com");

        ((JavascriptExecutor) DriverSingleton.getDriverInstance()).executeScript("window.open()");
        ArrayList<String> tabss = new ArrayList<String>(DriverSingleton.getDriverInstance().getWindowHandles());
        DriverSingleton.getDriverInstance().switchTo().window(tabs.get(1));
        Thread.sleep(5000);
       DriverSingleton.getDriverInstance().switchTo().window(tabss.get(2));

        DriverSingleton.getDriverInstance().navigate().to("https://translate.google.com");


    }
}
