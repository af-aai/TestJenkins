package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class normal {

    public static WebDriver driver =new ChromeDriver();

    @Test
    public void testJenkins() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://localhost:8080/job/Test_generalapp/build?token=elyarabdullah");
    }
}
