package com.julio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
class ApplicationTest {

    WebDriver driver = null;

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void fluentwait1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class)
        .withMessage("Elemento no encontrado");
        WebElement element = wait.until(new Function<WebDriver,WebElement>() { 
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector(".central-featured-logo"));
            }            
        });
        driver.close();            
    };

    @Test void fluentwait2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://unsplash.com/es");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class)
        .withMessage("Elemento no encontrado");
        WebElement element = wait.until(new Function<WebDriver,WebElement>() { 
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("div[data-test=masonry-grid-count-three]"));
            }            
        });
        driver.close();
    }

    @Test void fluentwait3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo/topics/cyx5krnw38vt");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class)
        .withMessage("Elemento no encontrado");
        WebElement element = wait.until(new Function<WebDriver,WebElement>() { 
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("header[role=banner]"));
            }            
        });
    }

    @Test void fluentwait4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cnnespanol.cnn.com");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class)
        .withMessage("Elemento no encontrado");
        List<WebElement> elements = wait.until(new Function<WebDriver,List<WebElement>>() { 
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(By.cssSelector("div.mod"));
            }            
        });
    }


}

