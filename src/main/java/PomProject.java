import Builder.DriverSingleton;
import ProjectTestng.TestngProject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PomProject {
    @BeforeClass

    public static void beforeAll(){
        DriverSingleton.getDriverInstance();
        DriverSingleton.getPomProjectURL();

    }

    @Test
    public static void test1() throws Exception {
        TestngProject.sevenKey();
        TestngProject.sixKey();
        TestngProject.calculateAndAssert();


    }
}
