package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;



public class MyStepdefs {

    AndroidDriver driver;

    @cucumber.api.java.Before
    public void launch () throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "LGUS992ab417a3a");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "no.buypass.mobile.android.mid2");
        capabilities.setCapability("appActivity", ".main.view.activity.SplashActivity");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);


    }

    @Given("^Open the app$")
    public void openTheApp() throws Exception {
       String testbox = driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='fragment_container']]/*[@class='android.widget.TextView'])[2]")).getText();
       Assert.assertEquals("Assert textboxsame aster reload after reload", "test" , testbox);

       //Assert.assertEquals("text", testbox);

    }

    @When("^Click on btn$")
    public void clickOnBtn() throws Exception {
        driver.findElement(By.xpath("//*[@id='continue_button']")).click();

    }

    @Then("^Click Next$")
    public void clickNext() {
        driver.findElement(By.xpath("//*[@id='text_input']")).sendKeys("09125600511");
    }
}
