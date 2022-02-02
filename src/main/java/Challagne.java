import Builder.DriverSingleton;
import Challange.ClassChallange;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Challagne {

    @BeforeClass
    public static void beforeAlll(){
        DriverSingleton.getDriverInstance();
        DriverSingleton.getChallangeURL();
    }
    @Test
    public static void TabTest() throws InterruptedException {
        ClassChallange.TabTest();
    }
}
