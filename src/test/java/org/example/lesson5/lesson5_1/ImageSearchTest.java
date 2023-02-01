package org.example.lesson5.lesson5_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageSearchTest {
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
        driver.get("https://www.goodfon.ru/auth/");

        WebElement webElement1 = driver.findElement(By.id("eac-5874"));
        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/form/button"));

        try {
            WebElement webElementError = driver.findElement(By.name("error"));
        } catch (NoSuchElementException e){
            System.out.println(e.getSupportUrl());
        }

        List<WebElement> webElements = driver.findElements(By.name("error"));
        if(webElements.size()>1){
            //todo
        }

        webElement1.click();
        webElement1.sendKeys("Audi");
        webElement2.click();




        //Thread.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();
    }
}