package mobile.page;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class LamodaAndroidTestPage {

    private final String skipButton = "org.wikipedia.alpha:id/fragment_onboarding_skip_button",
            nextButton = "org.wikipedia.alpha:id/fragment_onboarding_forward_button",
            doneButton = "org.wikipedia.alpha:id/fragment_onboarding_done_button",
            negativeButton = "org.wikipedia.alpha:id/negativeButton",
            inputField = "org.wikipedia.alpha:id/search_src_text",
            listOfResponse = "org.wikipedia.alpha:id/page_list_item_title",
            emptyTitle = "org.wikipedia.alpha:id/empty_title",
            primaryView = "org.wikipedia.alpha:id/primaryTextView",
            view = "android.view.View",
            searchPlaceHolder = "Search Wikipedia",
            saved = "Saved",
            emptyMessage = "No saved pages yet";


    public LamodaAndroidTestPage skipStartMenu() {


        // remote $(AppiumBy.id("com.lamoda.lite:id/title")).click();
        $(AppiumBy.id("com.lamoda.lite:id/buttonPrimary")).click();
        $(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button")).click();
        //remote $(AppiumBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
        $(AppiumBy.id("com.lamoda.lite:id/advantages_ok")).click();
        $(AppiumBy.id("com.lamoda.lite:id/closeButton")).click();

        return this;
    }


    public LamodaAndroidTestPage examinationTab() {
        $(AppiumBy.accessibilityId("Каталог")).click();
        $(AppiumBy.accessibilityId("Женщинам")).click();
        $(AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"Женщинам\"]/android.widget.TextView")).shouldHave(Condition.text("Женщинам"));

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
