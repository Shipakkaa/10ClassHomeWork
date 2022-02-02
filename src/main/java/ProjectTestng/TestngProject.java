package ProjectTestng;


import Builder.BasePage;
import Builder.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestngProject extends BasePage {


    public static void sevenKey (){
        WebElement seven = DriverSingleton.getDriverInstance().findElement(By.id("seven"));
        int height = seven.getSize().height;
        int width = seven.getSize().width;
        System.out.println(height + width);
    }
     public static void sixKey(){
        DriverSingleton.getDriverInstance().findElement(By.id("six")).isDisplayed();
    }
    public static void calculateAndAssert() throws Exception {
        int num = 20;
String numm = Integer.toString(num);
        clickElement(By.id("five"));
        clickElement(By.id("multiply"));
        clickElement(By.id("four"));
clickElement(By.id("equal"));
WebElement checkNum = DriverSingleton.getDriverInstance().findElement(By.id("screen"));
String number = checkNum.getText();
        Assert.assertEquals(number , numm );


    }


}
