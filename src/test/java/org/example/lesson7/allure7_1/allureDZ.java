package org.example.lesson7.allure7_1;

import io.qameta.allure.*;
import org.example.lesson6.bbc.AbstractTest;
import org.example.lesson7.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Story("Юзер стори")
public class  MyShowTest extends allureDZ {


        @Test
        @DisplayName("Пустой скрипт")
         @Link("http://google.com")
        @Issue("https://www.goodfon.ru/")
        @TmsLink("")
        @Severity(SeverityLevel.MINOR)
        void testTrue(){
            Assertions.assertTrue(true);
        }

        @Test
        @DisplayName("Сделай скрин")
        @Description("Тест создает скрин")
        @Link("http://google.com")
        @Issue("https://www.goodfon.ru/")
        @Severity(SeverityLevel.BLOCKER)
        void testFalse() throws InterruptedException, IOException {
            Thread.sleep(2000);
            File file = MyUtils.makeScreenshot(getWebDriver(),"failure- org.example.bbc.MyShowTest.testFalse" + System.currentTimeMillis() + ".png");
            saveScreenshot(Files.readAllBytes(file.toPath()));
            Assertions.assertTrue(true);
        }

        private void saveScreenshot(byte[] readAllBytes) {
        }



}
