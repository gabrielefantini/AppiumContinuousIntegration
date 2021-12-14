import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo {

    WebDriver driver;
    public static int screenNumber = 0;

    @Test
    void insertNewNote() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button")))
            .click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("it.feio.android.omninotes.alpha:id/fab_note"))))
            .click();
        screenshot();
        MobileElement el3 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/detail_title")));
        el3.click();
        el3.sendKeys("New Note");
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated((MobileBy.AccessibilityId("drawer open"))))
            .click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/note_title")));
        screenshot();
        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"))
                        .getText(),
                "New Note"
        );
    }
    @Test
    void archiveANote() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"))))
            .click();

        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("it.feio.android.omninotes.alpha:id/fab_note"))))
            .click();

        MobileElement el3 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/detail_title")));
        el3.click();
        el3.sendKeys("New Note");

        wait.until(ExpectedConditions.presenceOfElementLocated((MobileBy.AccessibilityId("drawer open"))))
            .click();

        //swipe left note to archive it
        int screenWidth = (int) driver.manage().window().getSize().width;
        int screenWidth90 = (int) (.9 * screenWidth);
        int screenWidth65 = (int) (.65 * screenWidth);
        int screenWidth10 = (int) (.1 * screenWidth);

        MobileElement newNote = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/note_title")));

        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        int elementY = newNote.getLocation().getY();

        touchAction.press(PointOption.point(screenWidth90, elementY))
                .moveTo(PointOption.point(screenWidth65, elementY))
                .moveTo(PointOption.point(screenWidth10, elementY))
                .release()
                .perform();

        MobileElement el6 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open")));
        el6.click();

        MobileElement el7 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout")));
        el7.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/note_title")));


        Assert.assertEquals(driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title")).getText(), "New Note");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    public void screenshot(){
        try {
            Robot r = new Robot();
            // It saves screenshot to desired path
            String path = "/screenshot/Screen"+ screenNumber + ".png";

            screenNumber++;

            // Used to get ScreenSize and capture image
            Rectangle capture =
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "png", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException ex) {
            System.out.println(ex);
        }
    }
}