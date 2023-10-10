package com.example;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WikipediaHomePage {
    private WebDriver driver;
    @FindBy(id="searchInput")
    private WebElement searchInput;
    
    public WikipediaHomePage(WebDriver driver){
        this.driver = driver; 
        PageFactory.initElements(driver,this);  
    } 
    
    public void navigateTo(){
         driver.get("https://www.wikipedia.org"); 
    } 
    public void escribirBucador( String t){
    this.searchInput.sendKeys(t);
    searchInput.submit();
    }
    

    
}

