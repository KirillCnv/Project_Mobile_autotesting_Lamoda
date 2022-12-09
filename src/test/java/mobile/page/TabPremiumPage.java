package mobile.page;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class TabPremiumPage {

    public TabPremiumPage skipStartMenu() {

        $(AppiumBy.id("com.lamoda.lite:id/title")).click();
        $(AppiumBy.id("com.lamoda.lite:id/buttonPrimary")).click();
        //local $(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.lamoda.lite:id/advantages_ok")).click();
        $(AppiumBy.id("com.lamoda.lite:id/closeButton")).click();

        return this;
    }

    public TabPremiumPage examinationTab() {
        $(AppiumBy.id("com.lamoda.lite:id/premiumLandingButton")).click();
        $(AppiumBy.id("com.lamoda.lite:id/premiumLandingButton")).shouldHave(Condition.text("Premium"));

        return this;
    }
}