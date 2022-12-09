package mobile.page;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class RatingAppPage {

    public RatingAppPage skipStartMenu() {

        $(AppiumBy.id("com.lamoda.lite:id/title")).click();
        $(AppiumBy.id("com.lamoda.lite:id/buttonPrimary")).click();
        //local $(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.lamoda.lite:id/advantages_ok")).click();
        $(AppiumBy.id("com.lamoda.lite:id/closeButton")).click();

        return this;
    }

    public RatingAppPage profileClick() {
        $(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Профиль\"]/android.widget.FrameLayout")).click();

        return this;
    }

    public RatingAppPage rateApp() {
        $(AppiumBy.id("com.lamoda.lite:id/rateAppLayout")).click();

        return this;
    }
    public RatingAppPage checkRateApp() {
        $(AppiumBy.id("com.lamoda.lite:id/titleTextView")).shouldHave(Condition.text("Оцените приложение"));

        return this;
    }
}