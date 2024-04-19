package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    WebDriver driver;

    @FindBy(linkText = "Déposer une annonce gratuite")
    WebElement BoutonDeposerAnnonce;
    @FindBy(linkText = "Compte")
    WebElement BoutonCompte;


    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void ClickPourDeposer(){
        BoutonDeposerAnnonce.click();
    }
    public void ClickPourCompte(){
        BoutonCompte.click();
    }
}
