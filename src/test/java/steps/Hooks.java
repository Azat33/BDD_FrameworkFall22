package steps;

import driverManager.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before hook started:");
    }

    @After
    public void tearDown(Scenario scenario){
        try {
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }
        }catch (WebDriverException noSupportScreenshot) {
            System.err.println(noSupportScreenshot.getMessage());
        }
        Driver.closeDriver();
    }
}
