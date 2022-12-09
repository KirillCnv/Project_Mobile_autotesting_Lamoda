package mobile.page;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class FieldsRegistrationPage {

    public FieldsRegistrationPage skipStartMenu() {


        $(AppiumBy.id("com.lamoda.lite:id/title")).click();
        $(AppiumBy.id("com.lamoda.lite:id/buttonPrimary")).click();
        //local $(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.lamoda.lite:id/advantages_ok")).click();
        $(AppiumBy.id("com.lamoda.lite:id/closeButton")).click();

        return this;
    }

    public FieldsRegistrationPage profileClick() {
        $(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Профиль\"]/android.widget.FrameLayout")).click();

        return this;
    }

    public FieldsRegistrationPage checkFields() {
        $(AppiumBy.accessibilityId("Создать аккаунт")).click();
        $(AppiumBy.id("com.lamoda.lite:id/firstNameEditText")).shouldHave(Condition.text("Имя"));
        $(AppiumBy.id("com.lamoda.lite:id/emailEditText")).shouldHave(Condition.text("Электронная почта"));
        $(AppiumBy.id("com.lamoda.lite:id/phoneEditText")).shouldHave(Condition.text("Мобильный телефон"));
        $(AppiumBy.id("com.lamoda.lite:id/passwordEditText")).shouldHave(Condition.text("Пароль"));

        return this;
    }
}