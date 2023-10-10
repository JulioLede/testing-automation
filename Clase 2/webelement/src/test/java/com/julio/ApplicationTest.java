package com.julio;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;



class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
//por id o classname
    @Test
    void driverManagerChrome () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.className("cdx-text-input__input"));
        search.sendKeys("Egg");
    }

    @Test
    void driverManagerChrome2 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar");
        WebElement search2 = driver.findElement(By.id("cb1-edit"));
        search2.sendKeys("camara sony");
    }

    @Test
    void driverManagerChrome3 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://best.aliexpress.com");
        WebElement search3 = driver.findElement(By.id("search-key"));
        search3.sendKeys("rollo film");       
    }

    @Test
    void driverManagerChrome4 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rateyourmusic.com");
        driver.manage().window().maximize();
        WebElement search4 = driver.findElement(By.id("ui_search_input_main_search"));
        search4.sendKeys("Deftones");
    }

    @Test
    void driverManagerChrome5 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flickr.com");
        driver.manage().window().maximize();
        WebElement search5 = driver.findElement(By.id("search-field"));
        search5.sendKeys("Fujifilm");
    }

    @Test
    void driverManagerChrome6 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();
        driver.findElement(By.name("search")).click();
        //WebElement search6 = driver.findElement(By.name("search")).click(); <--esto no sé por qué no funca
    }

    @Test
    void driverManagerChrome7 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/The_Holy_Girl");
        driver.findElement(By.name("Toggle the table of contents")).click();
    }


//por linktext o partiallinktext
    @Test
    void driverManagerChrome8 (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.linkText("View source")).click();;
    }

//ejercicio integrador
    @Test
    void driverManagerChrome9 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Richard_I_of_England");
        driver.findElement(By.id("toc-See_also-sublist"));
        driver.get("https://en.wikipedia.org/wiki/Philip_II_of_France");
        driver.findElement(By.linkText("House of Plantagenet")).click();
        driver.close();
    }
    
}
