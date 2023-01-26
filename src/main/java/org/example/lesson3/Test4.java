package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) {

/*                System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver"
        );*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"0\"]/div[1]/textarea"));

        try {
            WebElement webElementError = driver.findElement(By.name("error"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getSupportUrl());
        }

        List<WebElement> webElements = driver.findElements(By.name("error"));
        if (webElements.size() > 1) {
            //todo
        }

        webElement1.click(); //commed
        webElement1.sendKeys("Lorem Ipsum");


        //Thread.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();
    }
}