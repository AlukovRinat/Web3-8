package org.example.lesson6.lesson6_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.sql.DriverManager.getDriver;

public class AdminPage {
    @FindBy(xpath = "//*[@id=\"loginLogin\"]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"loginPass\"]")
    private WebElement password;

     @FindBy(xpath = "//*[@id=\"loginButton\"]")
    private WebElement submit;


    public AdminPage(WebDriver driver){

        super();
    }

    public void loginIn(){
        this.submit.click();
    }

    public AdminPage setLogin(String login){
        this.login.sendKeys("himep75632@gmail.com");
        return this;
    }

    public AdminPage setPassword(String password){
        this.password.click();
         return this;
    }

    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login,login)
                .sendKeys("himep75632@gmail.com")
                .click(this.password)
                .sendKeys("homework3")
                .click(this.submit)
                .build()
                .perform();
}

    private WebDriver getDriver() {
        return null;
    }
