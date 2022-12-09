package mobile.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Тестирование приложения Lamoda")
@Story("Тестирование приложения")
@Owner("KirillCnv")
@Severity(SeverityLevel.CRITICAL)

public class TabPremiumTest extends TestBase{

    @Tag("lamoda")
    @DisplayName("Проверка вкладки premium")
    @Test
    void examinationPremium() {
        step("Пропустить начальный экран", () ->
            tabPremiumPage.skipStartMenu()
        );
        step("Проверить, что вкладка имеет название premium", () ->
            tabPremiumPage.examinationTab()
        );
    }
}