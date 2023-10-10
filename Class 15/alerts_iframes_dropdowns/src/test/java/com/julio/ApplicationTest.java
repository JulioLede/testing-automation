package com.julio;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void alerta() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("/html/body/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Manu Ginobili");
        alert.accept();
        //driver.quit();
    }

    @Test
    void iframe() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
        driver.switchTo().frame("iframeResult");
        WebElement h1Element = driver.findElement(By.tagName("h1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].innerText = '¡Hola Mundo!'", h1Element);
        driver.switchTo().defaultContent();

    }

    @Test
    void iframe2() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.quackit.com/html/codes/html_iframe_example.cfm");
        driver.switchTo().frame("siteurl");
        WebElement pElement = driver.findElement(By.tagName("p"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].innerText = 'Texto modificado con Selenium'", pElement);


    }
}

