package com.project.pom;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

    private WebDriver driver;

    public base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\java\\recursos\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By localizador) {
        return driver.findElement(localizador);
    }

    public List<WebElement> findElements(By localizador) {
        return driver.findElements(localizador);

    }

    public String getText(By localizador) {
        return driver.findElement(localizador).getText();
    }

    public void clickon(By localizador) {
        driver.findElement(localizador).click();
    }

    public Boolean isDisplayed(By Localizador) {
        try {
            return driver.findElement(Localizador).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String actualUrl() {
        return driver.getCurrentUrl();

    }

    public void visit(String url) {
        driver.get(url);

    }
}
