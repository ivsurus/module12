package test.nativeapk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public abstract class NativeApkBaseTest {
	
	protected WebDriver driver;
	
	  @BeforeMethod
	    public void setUp() throws MalformedURLException{
	        //Set up desired capabilities and pass the Android app-activity
	        //and app-package to Appium
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("BROWSER_NAME", "Android");
	        capabilities.setCapability("VERSION", "8.1.0");
	        capabilities.setCapability("deviceName","Emulator");
	        capabilities.setCapability("platformName","Android");
	        // This package name of your app (you can get it from apk info app)
	        capabilities.setCapability("appPackage", "com.android.calculator2");
	        // This is Launcher activity of your app (you can get it from apk info app)
	        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
	        //Create RemoteWebDriver instance and connect to the Appium server
	        //It will launch the Calculator App in Android Device using the configurations
	        //specified in Desired Capabilities
	        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    }	

}
