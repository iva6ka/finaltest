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
    String actionType = "touch";

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
       Boolean buttonState = getElementState("//*[@id='start_activation']");
        Assert.assertEquals("Assert textboxsame aster reload after reload", false , buttonState);

       //Assert.assertEquals("text", testbox);

    }

    @When("^Click on btn$")
    public void clickOnBtn() throws Exception {
        driver.findElement(By.xpath("//*[@id='continue_button']")).click();
        getElementText(12);
        getElementText("as");

    }

    @Then("^Click Next$")
    public void clickNext() {
        driver.findElement(By.xpath("//*[@id='text_input']")).sendKeys("09125600511");
    }

    public Boolean getElementState(String elemntXPath){
     Boolean buttonState = driver.findElement(By.xpath(elemntXPath)).isEnabled();

     return buttonState;
    }

    public String getElementText(String elementXpath) {
                /*
                 */
        return null;
    }

    public String getElementText(String ID, String is2){

        return null;
    }

    public Boolean isTouchDevice(String deviceName){
        Boolean isDeviceTouch = true;
        return isDeviceTouch;
    }

    public void setDeviceActionType(final Boolean isDeviceTouch){
        Runnable sleepingRunner = () -> {isDeviceTouch = "touch"; isDeviceTouch = "click"; };
    }

}
