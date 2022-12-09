package mobile.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RatingAppTest extends TestBase{

    @Tag("lamoda")
    @DisplayName("Проверка окна \"оценки приложения\"")
    @Test
    void examinationTabMagazine() {
        step("Пропустить начальный экран", () ->
            ratingAppPage.skipStartMenu()
        );
        step("Нажать на вкладку  \"Профиль\"", () ->
            ratingAppPage.profileClick()
        );
        step("Нажать на вкладку  \"Оцените приложение\"", () ->
            ratingAppPage.rateApp()
        );
        step("Нажать на вкладку  \"Профиль\"", () ->
            ratingAppPage.checkRateApp()
        );
    }
}