package mobile.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class FieldsRegistrationTest extends TestBase{

    @Tag("lamoda")
    @DisplayName("Проверка наличия полей регистрации")
    @Test
    void checkFieldsRegistration() {
        step("Пропустить начальный экран", () ->
            fieldsRegistrationPage.skipStartMenu()
        );
        step("Нажать на вкладку  \"Профиль\"", () ->
            fieldsRegistrationPage.profileClick()
        );
        step("Нажать на вкладку  \"Создать аккаунт\" и проверить поля регистрации", () ->
            fieldsRegistrationPage.checkFields()
        );
    }
}