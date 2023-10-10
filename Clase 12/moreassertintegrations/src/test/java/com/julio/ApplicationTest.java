package com.julio;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private WebDriver driver;

    @BeforeEach
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }



    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void integradorp4ej1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal");
        SoftAssert miSoftAssert = new SoftAssert();
        String title= driver.getTitle();
        miSoftAssert.assertEquals("Wikip\u00E9dia, a enciclop\u00E9dia livre", title);   
        WebElement logo = driver.findElement(By.cssSelector("img.mw-logo-icon"));
        miSoftAssert.assertTrue(logo.isDisplayed());
        miSoftAssert.assertAll();
    }

    @Test
    void integradorp4ej2() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        SoftAssert miSoftAssert = new SoftAssert();
        WebElement buscador = driver.findElement(By.id("APjFqb"));
        buscador.sendKeys("Messi es una cabra?", Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement link = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".LC20lb.MBeuO.DKV0Md")));
        miSoftAssert.assertTrue(link.isDisplayed());
        link.click();
        miSoftAssert.assertAll();
    }

    @Test 
    void integradorp5ej1() {
        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);        
        SoftAssert miSoftAssert = new SoftAssert();
        driver.get("https://wikipedia.org");
        WebElement br = driver.findElement(By.id("js-link-box-pt"));
        br.click();
        String titleBr= driver.getTitle();
        System.out.println(titleBr);
        driver.navigate().back();
        WebElement italiano = driver.findElement(By.id("js-link-box-it"));
        italiano.click();
        String titleIt= driver.getTitle();
        System.out.println(titleIt);
        miSoftAssert.assertNotEquals(titleBr, titleIt);
        miSoftAssert.assertAll();*/

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://wikipedia.org");
        WebElement br = driver.findElement(By.id("js-link-box-pt"));
        br.click();
        String titleBr= driver.getTitle();
        System.out.println(titleBr);
        driver.navigate().back();
        WebElement italiano = driver.findElement(By.id("js-link-box-it"));
        italiano.click();
        String titleIt= driver.getTitle();
        System.out.println(titleIt);
        SoftAssert miSoftAssert = new SoftAssert();
        miSoftAssert.assertNotEquals(titleBr, titleIt);
        miSoftAssert.assertAll();
    }
        

        

    

}
