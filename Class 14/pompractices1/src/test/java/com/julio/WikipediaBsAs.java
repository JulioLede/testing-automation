package com.julio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WikipediaBsAs extends WikipediaHomePage {
    
    public WikipediaBsAs (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this); 
    }
    
}
