package com.julio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


class ApplicationTest {

    WebDriver driver = null;

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void integradora1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("textarea#APjFqb"));
    }

    @Test
    void integradora2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        driver.findElement(By.cssSelector("span.flex-1")).click();
    }
    
    @Test
    void integradora3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com");
        driver.findElement(By.cssSelector("a[data-testid=signupButton]"));
    }

    @Test
    void integradora4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.findElement(By.cssSelector("a.font-sans[data-tracking-control-name=homepage-basic_forgot_password]"));

    }

    @Test
    void integradora5() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://medium.com");
        driver.findElement(By.cssSelector("div.pw-trending-post")).click();
    }

    @Test
    void integradora6() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com");
        driver.findElement(By.cssSelector("button.flex--item6")).click();
        driver.findElement(By.cssSelector("a.js-gps-track")).click();//no encuentra el contact us
    }

    @Test
    void integradora7() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //no va a funcionar, pide verificacion de no bot
    }

    @Test
    void integradora8() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.findElement(By.cssSelector("yt-formatted-string[id=video-title]")).click();
    }




    

}
