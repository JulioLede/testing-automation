package com.julio;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;


class ApplicationTest {

    WebDriver driver = null;

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }



    @Test
    void integradorp1ej1() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement buscargoogle = driver.findElement(By.name("btnK"));
        assertFalse(!buscargoogle.isEnabled());
        driver.quit();
    }

    @Test
    void integradorp1ej2() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement checkbox = driver.findElement(By.id("my-check-2"));
        assertFalse(checkbox.isSelected());
        driver.quit();
    }

    @Test
    void integradorp1ej3() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org");
        SoftAssert misoftAssert = new SoftAssert();
        misoftAssert.assertEquals("Wikipedia", driver.getTitle());
        List<WebElement> images = driver.findElements(By.cssSelector("image#mi-imagen"));
        misoftAssert.assertFalse(images.size() > 0);
        misoftAssert.assertAll();
        driver.quit();
    }

    @Test
    void integradorp2ej1() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/?setlang=es");
        SoftAssert misoftAssert = new SoftAssert();
        WebElement barrabusqueda = driver.findElement(By.id("sb_form_q"));
        misoftAssert.assertTrue(barrabusqueda.isDisplayed());
        List<WebElement> sugerencias = driver.findElements(By.className("sa_tm_mainText"));
        misoftAssert.assertTrue(sugerencias.isEmpty());
        //misoftAssert.assertFalse(sugerencias.isDisplayed());
        misoftAssert.assertAll();
        driver.quit();        
    }

    @Test
    void integradorp2ej2() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.mozilla.org/es-AR/firefox/new/");
        SoftAssert misSoftAssert = new SoftAssert();
        WebElement logotipo = driver.findElement(By.className("c-navigation-logo-image"));
        misSoftAssert.assertTrue(logotipo.isDisplayed());
        WebElement technology = null;
        try { 
            technology = driver.findElement(By.linkText("Technology"));
            
        } catch (NoSuchElementException e) {
            System.out.println("ERROR: No existe el elemento Techonology" +e.getMessage());            
        }
        misSoftAssert.assertNull(technology);
        misSoftAssert.assertAll();
        driver.quit();

    }

    @Test
    void integradorp3 () {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/about/careers");
        SoftAssert miSoftAssert = new SoftAssert();
        WebElement softwaredeveloper = null;
        try {
            softwaredeveloper = driver.findElement(By.linkText("Software Developer"));
        } catch (NoSuchElementException e) {
            System.out.println("ERROR: no hay puestos de software developer disponibles"+e.getMessage());
        }
        WebElement pasteleroprofesional = null;
        try {
            pasteleroprofesional = driver.findElement(By.linkText("Pastelero Profesional"));
        } catch (NoSuchElementException e) {
            System.out.println("ERROR: no hay puestos de pastelero profesional disponibles"+e.getMessage());
        }
        miSoftAssert.assertNull(softwaredeveloper);
        miSoftAssert.assertNull(pasteleroprofesional);
        miSoftAssert.assertAll();
        driver.quit();
    }

/*private static WebDriver driver;

  @BeforeAll
  static void beforeAll() {
    WebDriverManager.chromedriver().setup();
    // EdgeDriverManager.edgedriver().setup();
    // FirefoxDriverManager.firefoxdriver().setup();
  }

  @BeforeEach
  void beforeEach() {
    driver = new ChromeDriver();
    // driver = new EdgeDriver();
    // driver = new FirefoxDriver();
  }

  @AfterEach
  void afterEach() {
    // Cerrar el navegador al final de cada prueba
    if (driver != null) {
      driver.quit();
    }
  }*/



}
