## Проект: Mobile Автоматизации тестирования Lamoda</a>

## :scroll: Содержание:

- [Технологии и инструменты](#hammer_and_wrench-технологии-и-инструменты)
- [Реализованные проверки](#memo-реализованные-проверки)
- [Сборка в Jenkins](#man_technologist-jenkins-job)
- [Запуск из терминала](#desktop_computer-Запуск-тестов-из-терминала)
- [Allure отчет](#chart_with_upwards_trend-отчет-в-allure-report)
- [Отчёт в Allure TestOps](#bar_chart-отчет-в-allure-testops)
- [Отчет в Telegram](#grapes-уведомление-в-telegram-при-помощи-бота)
- [Видео пример прохождения тестов](#film_strip-пример-видео-о-прохождении-тестов)

## :hammer_and_wrench: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://developer.android.com/studio"><img src="images/logo/AndroidStudio.svg" width="50" height="50"  alt="AndroidStudio"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://rest-assured.io"><img src="images/logo/RestAssured.svg" width="50" height="50"  alt="RestAssured"/></a>
<a href="https://appium.io"><img src="images/logo/Appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="https://www.browserstack.com"><img src="images/logo/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://telegram.org"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## :memo: Реализованные проверки

- :white_check_mark: Проверка вкладки premium.
- :white_check_mark: Проверка окна "оценки приложения".
- :white_check_mark: Проверка наличия полей регистрации.

## :man_technologist: Jenkins

<a target="_blank" href="https://jenkins.autotests.cloud/job/LamodaMobileTesting/">Сборка в Jenkins</a>
<p align="center">
<img src="images/screen/jenkins.png" alt="Jenkins"/>
</p>

### Параметры сборки в Jenkins:

* environment (Определят запуск локальный или удалённый)

### :desktop_computer: Запуск тестов из терминала

```bash
gradle clean lamodaTest
```

### :globe_with_meridians: Удаленный запуск:

```bash
clean 
lamodaTest
-Denvironment=${ENVIRONMENT}
```

## :chart_with_upwards_trend: Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/LamodaMobileTesting/allure/#">Allure report</a>



<p align="center">
<img title="Allure Overview Dashboard" src="images/screen/allureDAshboard.png">
<img title="Allure Overview Dashboard" src="images/screen/allureSuites.png">
</p>

## :bar_chart: Отчет в <a target="_blank" href="">Allure TestOps</a>



<p align="center">
<img title="Allure Test Ops Overview TaskList" src="images/screen/testOps.png">
<img title="Allure Test Ops TestCase" src="images/screen/testCase.png">
</p>

## :grapes: Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="">
</p>

## :film_strip: Пример видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/gif/lamodaMobile.gif" width="1080" height="700"  alt="video">
</p>