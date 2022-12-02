package mobile.page;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class LamodaAndroidTestPage {


    public LamodaAndroidTestPage skipStartMenu() {


        $(AppiumBy.id("com.lamoda.lite:id/title")).click();
        $(AppiumBy.id("com.lamoda.lite:id/buttonPrimary")).click();
        //local $(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.lamoda.lite:id/advantages_ok")).click();
        $(AppiumBy.id("com.lamoda.lite:id/closeButton")).click();

        return this;
    }


    public LamodaAndroidTestPage examinationTab() {
        $(AppiumBy.id("com.lamoda.lite:id/premiumLandingButton")).click();
        $(AppiumBy.id("com.lamoda.lite:id/premiumLandingButton")).shouldHave(Condition.text("Premium"));

        return this;
    }

    public LamodaAndroidTestPage profileClick() {
        $(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Профиль\"]/android.widget.FrameLayout")).click();

        return this;
    }

    public LamodaAndroidTestPage rateApp() {
        $(AppiumBy.id("com.lamoda.lite:id/rateAppLayout")).click();

        return this;
    }

    public LamodaAndroidTestPage examinationField() {
        $(AppiumBy.accessibilityId("Создать аккаунт")).click();
        $(AppiumBy.id("com.lamoda.lite:id/firstNameEditText")).shouldHave(Condition.text("Имя"));
        $(AppiumBy.id("com.lamoda.lite:id/emailEditText")).shouldHave(Condition.text("Электронная почта"));
        $(AppiumBy.id("com.lamoda.lite:id/phoneEditText")).shouldHave(Condition.text("Мобильный телефон"));
        $(AppiumBy.id("com.lamoda.lite:id/passwordEditText")).shouldHave(Condition.text("Пароль"));

        return this;
    }

    public LamodaAndroidTestPage examinationRateApp() {
        $(AppiumBy.id("com.lamoda.lite:id/titleTextView")).shouldHave(Condition.text("Оцените приложение"));

        return this;
    }

}
