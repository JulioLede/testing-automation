package com.julio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WikipediaHomePage {
    private WebDriver driver;

    public WikipediaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateTo() {
        driver.get("https://www.wikipedia.org");
        
    }

}
