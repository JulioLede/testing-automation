package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaBsAs extends WikipediaHomePage{

    public WikipediaBsAs(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);  
    }
    @FindBy(css="[href='#Geografía']")
    private WebElement geografia;
    @FindBy(css="img[alt=\"Buenos Aires ubicada en Argentina\"]")
    private WebElement imagen;
    public void seleccionarGeo(){
    
    this.geografia.click();

    }
    public WebElement getImagen() {
        return imagen;
    }
    public void setImagen(WebElement imagen) {
        this.imagen = imagen;
    }



}
