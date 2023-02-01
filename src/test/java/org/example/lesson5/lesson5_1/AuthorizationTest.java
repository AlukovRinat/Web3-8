package org.example.lesson5.lesson5_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
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

        WebElement webElement1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/a/i"));
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"loginLogin\"]"));
        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"loginPass\"]"));
        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));


        webElement1.click();
        webElement2.sendKeys("himep75632@gmail.co");
        webElement3.sendKeys("homework3");
        webElement4.click();



        //Thread.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();
    }
}
