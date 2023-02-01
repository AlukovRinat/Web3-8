package org.example.lesson5.lesson5_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class MobailVersionTest {

    private static WebDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @BeforeEach
    void getPage(){
        driver.get("https://www.goodfon.ru");
    }

    @Test
    void test() throws InterruptedException {

        WebElement webElement = driver.findElement(By.xpath("/html/body/div[2]/div[7]/div[1]/a[4]"));
        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[1]/span/span"));
        WebElement webElement3 = driver.findElement(By.xpath("/html/body/div[3]/form/div"));
        WebElement webElement4 = driver.findElement(By.xpath("/html/body/div[3]/form/button"));

        webElement.click();
        webElement2.click();
        webElement3.click();
        webElement3.sendKeys("BNW");
        webElement4.click();
    }



    @AfterAll
    static void close(){
        //driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
