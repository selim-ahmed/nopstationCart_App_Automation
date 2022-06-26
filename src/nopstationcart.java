import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.net.URL;

public class nopstationcart{


    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName",  "android");
        dc.setCapability("appPackage",  "com.nopstation.nopcommerce.nopstationcart");
        dc.setCapability("appActivity",  "com.bs.ecommerce.main.SplashScreenActivity");


        //AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub",dc));
        AndroidDriver ad = new AndroidDriver(new URL("127.0.0.1:4723/wd/hub/"), dc);


        MobileElement el1 = (MobileElement) ad.findElementByAccessibilityId("NopStation Cart");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[5]");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[13]");
        el4.click();
        MobileElement el5 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]/android.widget.TextView[3]");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
        el6.click();
        MobileElement el7 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RatingBar");
        el7.click();
        MobileElement el8 = (MobileElement) ad.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[10]");
        el8.click();
        el8.click();
        MobileElement el9 = (MobileElement) ad.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[10]");
        el9.click();
        MobileElement el10 = (MobileElement) ad.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[5]");
        el10.click();
        MobileElement el11 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RatingBar");
        el11.click();
        MobileElement el12 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup");
        el12.click();
        MobileElement el13 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout");
        el13.click();
        MobileElement el14 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
        el14.sendKeys("selim");
        MobileElement el15 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
        el15.sendKeys("ahmed");
        MobileElement el16 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
        el16.sendKeys("ahmed@gmail.com");
        MobileElement el17 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName");
        el17.sendKeys("abc Ltd.");
        MobileElement el18 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etCity");
        el18.sendKeys("Dhaka");
        MobileElement el19 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
        el19.sendKeys("12/2, Bashundhara, Dhaka");
        MobileElement el20 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etZipCode");
        el20.sendKeys("1205");
        MobileElement el21 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etPhone");
        el21.sendKeys("01717151512");
        MobileElement el22 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
        el22.click();
        MobileElement el23 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2");
        el23.sendKeys("12/2, Baridhara");
        MobileElement el24 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
        el24.click();
        MobileElement el25 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
        el25.sendKeys("Dhaka, Bangladesh");
        MobileElement el26 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner");
        el26.click();
        MobileElement el27 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]");
        el27.click();
        MobileElement el28 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el28.click();
        MobileElement el29 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
        el29.click();
        MobileElement el30 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup");
        el30.click();
        MobileElement el31 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView[1]");
        el31.click();
        MobileElement el32 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RatingBar");
        el32.click();
        MobileElement el33 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button");
        el33.click();
        MobileElement el34 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup");
        el34.click();
        MobileElement el35 = (MobileElement) ad.findElementById("com.nopstation.nopcommerce.nopstationcart:id/md_button_negative");
        el35.click();

        Assert.assertEquals(ad.findElementById("ccom.nopstation.nopcommerce.nopstationcart:id/md_text_message").getText(),"Your order has been successfully processed");


    }


}
