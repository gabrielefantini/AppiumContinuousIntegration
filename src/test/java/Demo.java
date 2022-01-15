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

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Demo {

    AndroidDriver<AndroidElement> driver;

    @Test
    void insertNewNote() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        el3.sendKeys("New Note");
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_content"));
        el4.click();
        el4.sendKeys("New Note Content");
        MobileElement el5 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el5.click();

        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"))
                        .getText(),
                "New Note"
        );
        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_content"))
                        .getText(),
                "New Note Content"
        );
    }

    @Test
    void insertNewChecklist() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_checklist"));
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el4.click();
        el4.sendKeys("New Checklist");
        MobileElement el5 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
        el5.click();
        el5.sendKeys("New Checklist Item");
        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el6.click();

        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"))
                        .getText(),
                "New Checklist"
        );
        String noteContent = driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_content"))
                .getText();
        Assert.assertTrue(
                noteContent.contains("New itemNew Checklist Item")
        );
    }

    @Test
    void archiveNote() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        //Inserting new note
        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        el3.sendKeys("New Note");
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_content"));
        el4.click();
        el4.sendKeys("New Note Content");
        MobileElement el5 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el5.click();
        //Archiving the note
        //swipe left note to archive it
        int screenWidth = (int) driver.manage().window().getSize().width;
        int screenWidth90 = (int) (.9 * screenWidth);
        int screenWidth65 = (int) (.65 * screenWidth);
        int screenWidth10 = (int) (.1 * screenWidth);

        MobileElement newNote = driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"));

        TouchAction touchAction = new TouchAction(driver);
        int elementY = newNote.getLocation().getY();

        touchAction.press(PointOption.point(screenWidth90, elementY))
                .moveTo(PointOption.point(screenWidth65, elementY))
                .moveTo(PointOption.point(screenWidth10, elementY))
                .release()
                .perform();

        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el7.click();

        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"))
                        .getText(),
                "New Note"
        );
        Assert.assertTrue(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/archivedIcon"))
                        .isDisplayed());

    }

    @Test
    void searchNote() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        MobileElement el2 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        MobileElement el3 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        el3.sendKeys("X");
        MobileElement el4 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el4.click();
        MobileElement el5 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el5.click();
        MobileElement el6 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el6.click();
        MobileElement el7 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el7.click();
        MobileElement el8 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el8.sendKeys("Y");
        MobileElement el9 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el9.click();
        MobileElement el10 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el10.click();
        MobileElement el11 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el11.click();
        MobileElement el12 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el12.click();
        el12.sendKeys("Z");
        MobileElement el13 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el13.click();
        MobileElement el14 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("Search"));
        el14.click();
        MobileElement el15 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/search_plate"));
        el15.click();
        MobileElement el16 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/search_src_text"));
        el16.sendKeys("X");

        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));

        Assert.assertEquals(
                driver.findElement(
                        By.id("it.feio.android.omninotes.alpha:id/note_title")
                ).getText(),
                "X"
        );
    }

    @Test
    void insertNewNoteWithReminder() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        el3.sendKeys("New Note With Reminder");
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/datetime"));
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/buttonPositive"));
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el6.click();

        Assert.assertTrue(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/alarmIcon"))
                        .isDisplayed()
        );

        MobileElement el7 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el8.click();

        Assert.assertEquals(
                driver.findElement(
                        By.id("it.feio.android.omninotes.alpha:id/note_title")
                ).getText(),
                "New Note With Reminder"
        );
    }

    @Test
    void sortNotes() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el4.click();
        el4.sendKeys("Note 1");
        MobileElement el5 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el8.click();
        el8.sendKeys("Note 2");
        MobileElement el9 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el12.click();
        el12.sendKeys("Note 3");
        MobileElement el13 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Sort"));
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
        el15.click();

        Assert.assertEquals(
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"))
                        .getText(),
                "Note 3"
        );

    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}