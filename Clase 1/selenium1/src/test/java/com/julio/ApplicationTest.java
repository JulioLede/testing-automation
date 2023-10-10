package com.julio;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;



class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void driverManagerChrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://chat.openai.com");
        Dimension originalSize = driver.manage().window().getSize();
        
        driver.manage().window().setSize(originalSize);    
        driver.manage().window().setPosition(new Point(320, 230));
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().setSize(originalSize);
        driver.close();
    }

}
