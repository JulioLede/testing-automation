package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaHomePageTest {
    
    
    
    
    @Test
    public void navigateToWikipediaHomePage(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    WikipediaHomePage homePage = new WikipediaHomePage(driver); 
    homePage.navigateTo(); 
    assertEquals("Wikipedia", driver.getTitle());
   

    WikipediaHomePage wikihome = new WikipediaHomePage(driver);
    
    wikihome.escribirBucador("Buenos Aires");
    WikipediaBsAs wb = new WikipediaBsAs(driver);
    wb.seleccionarGeo();
    assertTrue(wb.getImagen().isDisplayed());
    driver.quit();
}
}



