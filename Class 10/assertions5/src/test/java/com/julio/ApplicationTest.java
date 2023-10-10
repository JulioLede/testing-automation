package com.julio;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {
    
    WebDriver driver = null;

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
//Ejercicio 1: Verificar que la página de inicio de Google esté cargada
    @Test
    void practicaasserttrue1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().contains("Google"));
        WebElement campoBusqueda = driver.findElement(By.name("q"));
        assertTrue(campoBusqueda.isDisplayed());
        driver.close();            
    }

    @Test
    void driverManagerFirefox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().contains("Google"));
        WebElement campoBusqueda = driver.findElement(By.name("q"));
        assertTrue(campoBusqueda.isDisplayed());
        driver.close();  
    }
//Ejercicio 2: Verificar que un producto esté disponible en Amazon.
    @Test
    void practicaasserttrue2() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/-/es/Voigtlander-soporte-Nokton-40-mm-F1-2-Asf\u00E9rico/dp/B077PQ3D8W/ref=sr_1_2?keywords=voigtlander+fuji&qid=1692229674&sprefix=voigtlander+%2Caps%2C291&sr=8-2");
        WebElement disponiblidad = driver.findElement(By.id("availability"));

        System.out.println(disponiblidad.getText());
        assertTrue(disponiblidad.isDisplayed());
        driver.quit();
    }

    //Ejercicio 3: Verificar que un enlace a "Contacto" exista en un sitio web de ejemplo.
    @Test
    void practicaasserttrue3() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        WebElement contacto = driver.findElement(By.linkText("Contacto"));
        assertTrue(contacto.isEnabled());
        driver.quit();        
    }

//Verificar que el botón de búsqueda está deshabilitado en Google sin texto en la barra de búsqueda
    @Test
    void practicaassertfalse1() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement buscargoogle = driver.findElement(By.name("btnK"));
        assertFalse(buscargoogle.isEnabled());
    }

}


