package SetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static AndroidDriver Capabilities() throws InterruptedException {
        // Define the directory containing your APK file
        File appDir = new File("src");
        
        // Specify the APK file to be tested
        File app = new File(appDir, "app-arm64-v8a-release-5.apk");
        
        // Initialize DesiredCapabilities for Appium session
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // Set device name (could be any name)
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "hala");

        // Set path to the APK file
        desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        // Specify the automation name (uiautomator2 for Android)
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        AndroidDriver driver = null;
        
        try {
            // Initialize AndroidDriver with Appium server URL and desired capabilities
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            
            // Sleep for 5 seconds (not recommended for actual tests, used here for demonstration)
            Thread.sleep(5000);
       
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        
        // Return the initialized AndroidDriver instance
        return driver;
    }
}
