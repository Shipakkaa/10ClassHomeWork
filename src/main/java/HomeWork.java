import Builder.DriverSingleton;
import ProjectTestng.TestngProject;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    private static WebDriverWait wait;
    private static ChromeDriver driver;




    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        NgWebDriver ngWebDriver = new NgWebDriver(driver);
        ngWebDriver.waitForAngularRequestsToFinish();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    @Test
    public static void test1() throws InterruptedException {
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div/form/div[3]/input"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("hidden"))).click();
Thread.sleep(5000);
        String hidden = driver.findElement(By.cssSelector("#finish1 > h4")).getText();
        System.out.println(hidden);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("rendered"))).click();
      String hidden2 =   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish2 > h4"))).getText();
        System.out.println(hidden2);


    }
    @Test
    public static void test2(){
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
      WebElement firstName =  driver.findElement(ByAngular.model("firstName"));
      firstName.clear();
      firstName.sendKeys("Omer");
        Assert.assertEquals(firstName.getAttribute("value") , "Omer");

    }

    ////3 .It Used For Waiting Until The Page Will Load ..Because there are pages that take time to load




}
