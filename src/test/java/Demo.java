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

    /*@Test
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
    }*/

    /*
    @Test
    void archiveANote() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"))))
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
        screenshot();
        MobileElement el6 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open")));
        el6.click();
        screenshot();
        MobileElement el7 = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout")));
        el7.click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/note_title")));
        screenshot();
        Assert.assertEquals(driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title")).getText(), "New Note");
    }*/

    @Test
    void longTestRun() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/fab_checklist"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/detail_title")));
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        screenshot();
        el3.sendKeys("New CheckList");
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")));
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
        el4.click();
        screenshot();
        el4.sendKeys("CheckList Item 1");
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")));
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText"));
        el5.click();
        screenshot();
        el5.sendKeys("CheckList Item 2");
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/reminder_layout"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/buttonPositive"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/fab_note"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/detail_title")));
        screenshot();
        MobileElement el11 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el11.click();
        screenshot();
        el11.sendKeys("New Note");
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("it.feio.android.omninotes.alpha:id/detail_content")));
        MobileElement el12 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_content"));
        screenshot();
        el12.click();
        screenshot();
        el12.sendKeys("New Note Content");
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Sort"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("More options"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("More options"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive")))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.CheckBox"))).click();
        screenshot();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("drawer open"))).click();
        screenshot();
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
            String path = System.getProperty("user.dir") + "/screenshot/Screen"+ screenNumber + ".png";
            File myObj = new File(path);

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            screenNumber++;

            // Used to get ScreenSize and capture image
            Rectangle capture =
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "png", myObj);
            System.out.println("Screenshot saved");
        }
        catch (AWTException | IOException ex) {
            System.out.println(ex);
        }
    }
}