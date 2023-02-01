package org.example.lesson5.lesson5_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
public class SearchTest {
    static WebDriver driver;

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

        WebElement webElement = driver.findElement(By.id("eac-5960"));
        webElement.click();
        webElement.sendKeys("Mersedes-Benz");
        webElement.submit();
        Assertions.assertEquals("Найдено обоев",driver.getTitle(),"По вашему запросу ничего нет");
    }



  //  @AfterAll
    static void close(){
        driver.quit();
    }

}
