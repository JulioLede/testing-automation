package com.julio;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class WikipediaHomePageTest {
    WebDriver driver;


    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void navigateToWikipediaHomePage() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WikipediaHomePage homePage = new WikipediaHomePage(driver);
        homePage.navigateTo();
        assertEquals("Wikipedia", driver.getTitle());
        driver.quit();   
    }
}
