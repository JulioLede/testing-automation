package com.julio;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ApplicationTest {

    WebDriver driver = null;

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void driverManagerChrome () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        int botones=driver.findElements(By.className("vector-dropdown-checkbox")).size();
        System.out.println(botones);
        Assertions.assertEquals(botones, 5);
    }

    @Test
    void practicaclassname2 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thisisfeliznavidad.com/productos/invader-sweater/");
        int imagenes=driver.findElements(By.className("js-product-slide-img")).size();
        System.out.println(imagenes);
    }

    @Test
    void practicaclassname3 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thisisfeliznavidad.com/por-producto/retro-sweaters/");
        int productos=driver.findElements(By.className("js-item-image")).size();
        System.out.println(productos);
        int starwars=driver.findElements(By.partialLinkText("Star")).size();
        System.out.println(starwars);

    }

    @Test
    void practicatagname () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wizardingworld.com");
        int jerarquia2=driver.findElements(By.tagName("h2")).size();
        System.out.println(jerarquia2);
        driver.close();

    }

    @Test
    void practicatagname2 () {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver(); 
       driver.get("https://www.wizardingworld.com");
       driver.findElement(By.id("wizarding_world_login")).click();
       driver.close();
    }

    @Test
    void practicatagname3 () {
       WebDriverManager.operadriver().setup();
       WebDriver driver = new OperaDriver(); 
       driver.get("https://www.infobae.com");
       int imagenes=driver.findElements(By.tagName("img")).size();
       System.out.println(imagenes);
       driver.manage().window().maximize();
       driver.findElement(By.id("hamburger-icon")).click();
    }

    @Test
    void TestLocatorsIII() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://outlook.live.com/owa/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("i0116")).sendKeys("");
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(2000);
        WebElement casilla = driver.findElement(By.id("i0118"));
        casilla.sendKeys("");
        casilla.submit();
        driver.findElement(By.id("idBtn_Back")).click();
    }

    @Test
    public void navegandoWiki() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement buscador1=driver.findElement(By.id("searchInput"));
        buscador1.sendKeys("Litio");
        buscador1.submit();
        driver.close();
        
    }
}
