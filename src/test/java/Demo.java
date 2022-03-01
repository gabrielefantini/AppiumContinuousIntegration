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
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
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

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static int screenNumber = 0;

    //Inserimento nota testuale
    /*@Test
    void insertNewNote() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        screenshot();
        el3.sendKeys("New Note");
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_content"));
        el4.click();
        screenshot();
        el4.sendKeys("New Note Content");
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el5.click();
        screenshot();

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
    */
    //Inserimento lista di controllo
    @Test
    void insertNewChecklist() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_checklist"));
        el3.click();
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el4.click();
        screenshot();
        el4.sendKeys("New Checklist");
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
        el5.click();
        screenshot();
        el5.sendKeys("New Checklist Item");
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el6.click();
        screenshot();
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
    //Archiviazione nota testuale
    /*@Test
    void archiveNote() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        //Inserting new note
        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        screenshot();
        el3.sendKeys("New Note");
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_content"));
        el4.click();
        screenshot();
        el4.sendKeys("New Note Content");
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el5.click();
        screenshot();
        //Archiving the note
        //swipe left note to archive it
        int screenWidth = (int) driver.manage().window().getSize().width;
        int screenWidth90 = (int) (.9 * screenWidth);
        int screenWidth65 = (int) (.65 * screenWidth);
        int screenWidth10 = (int) (.1 * screenWidth);
        screenshot();
        MobileElement newNote = driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"));

        TouchAction touchAction = new TouchAction(driver);
        int elementY = newNote.getLocation().getY();

        touchAction.press(PointOption.point(screenWidth90, elementY))
                .moveTo(PointOption.point(screenWidth65, elementY))
                .moveTo(PointOption.point(screenWidth10, elementY))
                .release()
                .perform();
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el6.click();
        screenshot();
        MobileElement el7 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el7.click();
        screenshot();

        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title"))
                        .getText(),
                "New Note"
        );
        Assert.assertTrue(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/archivedIcon"))
                        .isDisplayed());

    }*/
    //Cerca tra le note
    /*@Test
    void searchNote() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el1 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        screenshot();
        el3.sendKeys("X");
        screenshot();
        MobileElement el4 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el4.click();
        screenshot();
        MobileElement el5 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el5.click();
        screenshot();
        MobileElement el6 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el6.click();
        screenshot();
        MobileElement el7 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el7.click();
        screenshot();
        MobileElement el8 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el8.sendKeys("Y");
        screenshot();
        MobileElement el9 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el9.click();
        screenshot();
        MobileElement el10 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el10.click();
        screenshot();
        MobileElement el11 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el11.click();
        screenshot();
        MobileElement el12 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el12.click();
        screenshot();
        el12.sendKeys("Z");
        screenshot();
        MobileElement el13 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el13.click();
        screenshot();
        MobileElement el14 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("Search"));
        el14.click();
        screenshot();
        MobileElement el15 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/search_plate"));
        el15.click();
        screenshot();
        MobileElement el16 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/search_src_text"));
        el16.sendKeys("X");
        screenshot();

        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        screenshot();
        Assert.assertEquals(
                driver.findElement(
                        By.id("it.feio.android.omninotes.alpha:id/note_title")
                ).getText(),
                "X"
        );
    }
    */
    //Inserimento nota testuale con promemoria
   /* @Test
    void insertNewNoteWithReminder() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        screenshot();
        el3.sendKeys("New Note With Reminder");
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/datetime"));
        el4.click();
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/buttonPositive"));
        el5.click();
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el6.click();
        screenshot();

        Assert.assertTrue(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/alarmIcon"))
                        .isDisplayed()
        );

        MobileElement el7 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el7.click();
        screenshot();
        MobileElement el8 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el8.click();
        screenshot();

        Assert.assertEquals(
                driver.findElement(
                        By.id("it.feio.android.omninotes.alpha:id/note_title")
                ).getText(),
                "New Note With Reminder"
        );
    }*/
    //Ordinamento note
    /*@Test
    void sortNotes() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el3.click();
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el4.click();
        screenshot();
        el4.sendKeys("Note 1");
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el5.click();
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el6.click();
        screenshot();
        MobileElement el7 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el7.click();
        screenshot();
        MobileElement el8 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el8.click();
        screenshot();
        el8.sendKeys("Note 2");
        screenshot();
        MobileElement el9 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el9.click();
        screenshot();
        MobileElement el10 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el10.click();
        screenshot();
        MobileElement el11 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el11.click();
        screenshot();
        MobileElement el12 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el12.click();
        screenshot();
        el12.sendKeys("Note 3");
        screenshot();
        MobileElement el13 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el13.click();
        screenshot();
        MobileElement el14 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Sort"));
        el14.click();
        screenshot();
        MobileElement el15 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
        el15.click();
        screenshot();

        Assert.assertEquals(
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"))
                        .getText(),
                "Note 3"
        );

    }*/
    //Aggiunta Nuova Categoria
    /*@Test
    void insertNewCategory() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Category"));
        el3.click();
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive"));
        el4.click();
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/category_title"));
        el5.click();
        screenshot();
        el5.sendKeys("New Category");
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/color_chooser"));
        el6.click();
        screenshot();
        MobileElement el7 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[6]"));
        el7.click();
        screenshot();
        MobileElement el8 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive"));
        el8.click();
        screenshot();
        MobileElement el9 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/save"));
        el9.click();
        screenshot();
        MobileElement el10 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el10.click();
        screenshot();
        el10.sendKeys("New Note");
        screenshot();
        MobileElement el11 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el11.click();
        screenshot();
        MobileElement el12 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el12.click();
        screenshot();

        Assert.assertEquals(
                driver.findElement(By.id("it.feio.android.omninotes.alpha:id/count"))
                        .getText(),
                "1"
        );

    }
    */
    //Eliminazione Nuova Categoria
   /* @Test
    void deleteCategory() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el1 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Category"));
        el3.click();
        screenshot();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive"));
        el4.click();
        screenshot();
        MobileElement el5 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/category_title"));
        el5.click();
        screenshot();
        el5.sendKeys("New Category");
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/color_chooser"));
        el6.click();
        screenshot();
        MobileElement el7 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[6]"));
        el7.click();
        screenshot();
        MobileElement el8 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive"));
        el8.click();
        screenshot();
        MobileElement el9 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/save"));
        el9.click();
        screenshot();
        MobileElement el10 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el10.click();
        screenshot();
        el10.sendKeys("New Note");
        screenshot();
        MobileElement el11 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el11.click();
        screenshot();
        MobileElement el12 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("drawer open"));
        el12.click();
        screenshot();

        MobileElement el13 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]"));
        AndroidTouchAction action = new AndroidTouchAction (driver);
        action.longPress(LongPressOptions.longPressOptions()
                        .withElement (ElementOption.element (el13)))
                .perform ();
        screenshot();
        MobileElement el14 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/delete"));
        el14.click();
        screenshot();
        MobileElement el15 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive"));
        el15.click();
        screenshot();

        Assert.assertEquals(driver.findElements(By.xpath("//*[contains(@text, 'New Category')]")).size(), 0);
    }*/

    //Eliminazione Note e svuotamento cestino
    /*@Test
    void deleteNoteAndEmptyTrash() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        screenshot();
        MobileElement el1 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_expand_menu_button"));
        el1.click();
        screenshot();
        MobileElement el2 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/fab_note"));
        el2.click();
        screenshot();
        MobileElement el3 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/detail_title"));
        el3.click();
        screenshot();
        el3.sendKeys("New Note");
        screenshot();
        MobileElement el4 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el4.click();
        screenshot();
        MobileElement el5 = (MobileElement) driver
                .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout"));
        el5.click();
        screenshot();
        MobileElement el6 = (MobileElement) driver.findElement(MobileBy.AccessibilityId("More options"));
        el6.click();
        screenshot();
        MobileElement el7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout"));
        el7.click();
        screenshot();
        MobileElement el8 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el8.click();
        screenshot();
        MobileElement el9 = (MobileElement) driver
                .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        el9.click();
        screenshot();
        Assert.assertEquals(driver.findElement(By.id("it.feio.android.omninotes.alpha:id/note_title")).getText(), "New Note");
        screenshot();
        MobileElement el10 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("More options"));
        el10.click();
        screenshot();
        MobileElement el12 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
        el12.click();
        screenshot();
        MobileElement el13 = (MobileElement) driver.findElement(By.id("it.feio.android.omninotes.alpha:id/md_buttonDefaultPositive"));
        el13.click();
        screenshot();

        Assert.assertEquals(driver.findElements(By.id("it.feio.android.omninotes.alpha:id/note_title")).size(), 0);
    }*/
    //Navigazione sezione Impostazioni
   /* @Test
    void infoMenu() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el1.click();

        MobileElement el2 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/settings"));
        el2.click();

        int screenH = (int) driver.manage().window().getSize().height;
        int screenW = (int) driver.manage().window().getSize().width/2;
        TouchAction touchAction = new TouchAction(driver);

        touchAction.press(PointOption.point(screenW, (int) (screenH * 0.9)))
                .moveTo(PointOption.point(screenW, (int) (screenH * 0.7)))
                .moveTo(PointOption.point(screenW, (int) (screenH * 0.3)))
                .release()
                .perform();

        MobileElement el3 = (MobileElement) driver
                .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[13]"));
        el3.click();

        Assert.assertEquals(
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).getText(),
                "Info"
        );
    }*/
    //Navigazione sezione Impostazioni
    /*
    @Test
    void infoMenu() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName" , "Android");
        caps.setCapability("deviceName" , "Android Emulator");
        caps.setCapability("app" , System.getProperty("user.dir")+"/apps/OmniNotes-alphaDebug-6.1.0.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver
                .findElement(MobileBy.AccessibilityId("drawer open"));
        el1.click();

        MobileElement el2 = (MobileElement) driver
                .findElement(By.id("it.feio.android.omninotes.alpha:id/settings"));
        el2.click();

        int screenH = (int) driver.manage().window().getSize().height;
        int screenW = (int) driver.manage().window().getSize().width/2;
        TouchAction touchAction = new TouchAction(driver);

        touchAction.press(PointOption.point(screenW, (int) (screenH * 0.9)))
                .moveTo(PointOption.point(screenW, (int) (screenH * 0.7)))
                .moveTo(PointOption.point(screenW, (int) (screenH * 0.3)))
                .release()
                .perform();

        MobileElement el3 = (MobileElement) driver
                .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[13]"));
        el3.click();

        Assert.assertEquals(
                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).getText(),
                "Info"
        );
    }
    */

    public void screenshot() throws InterruptedException {
        Thread.sleep(4000);
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