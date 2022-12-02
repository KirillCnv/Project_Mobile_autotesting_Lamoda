package mobile.tests;

import mobile.base.TestBase;
import mobile.page.LamodaAndroidTestPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("All")
@DisplayName("Тесты для приложения Lamoda")
public class LamodaTest extends TestBase {


    LamodaAndroidTestPage lamodaAndroidTestPage = new LamodaAndroidTestPage();

    @Tag("lamoda")
    @DisplayName("Проверка вкладки premium")
    @Test
    void examinationPremium() {
        step("Пропустить начальный экран", () -> {
            lamodaAndroidTestPage.skipStartMenu();
        });
        step("Проверить, что вкладка имеет название premium", () -> {
            lamodaAndroidTestPage.examinationTab();
        });
    }


    @Tag("lamoda")
    @DisplayName("Проверка окна \"оценки приложения\"")
    @Test
    void examinationTabMagazine() {
        step("Пропустить начальный экран", () -> {
            lamodaAndroidTestPage.skipStartMenu();
        });
        step("Нажать на вкладку  \"Профиль\"", () -> {
            lamodaAndroidTestPage.profileClick();
        });
        step("Нажать на вкладку  \"Оцените приложение\"", () -> {
            lamodaAndroidTestPage.rateApp();
        });
        step("Нажать на вкладку  \"Профиль\"", () -> {
            lamodaAndroidTestPage.examinationRateApp();
        });
    }

    @Tag("lamoda")
    @DisplayName("Проверка наличия полей регистрации")
    @Test
    void examinationFieldsRegistration() {
        step("Пропустить начальный экран", () -> {
            lamodaAndroidTestPage.skipStartMenu();
        });
        step("Нажать на вкладку  \"Профиль\"", () -> {
            lamodaAndroidTestPage.profileClick();
        });
        step("Нажать на вкладку  \"Создать аккаунт\" и проверить поля регистрации", () -> {
            lamodaAndroidTestPage.examinationField();
        });

    }


}


