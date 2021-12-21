package TestJenkins.stepdefinitions;

import TestJenkins.utilities.DriverUtil;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class normal {

    @Given("user go to jenkins remote activate page")
    public void user_go_to_jenkins_remote_activate_page() throws InterruptedException {

        Thread.sleep(5000);
        Hooks.driver.get("https://www.google.com/");

    }
}
