package TestJenkins.stepdefinitions;

import TestJenkins.utilities.DriverUtil;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before
    public static void setup() {

        driver = DriverUtil.setup();

    }
//    @After
//    public static void close() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

