package ex_01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab_01_TestSelenium {

        @Test
        public void test_VerifyVWOLogin(){
            // Write the code which will execute the perform the ui interactions
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://app.vwo.com");
            System.out.println(driver.getTitle());
        }
}
