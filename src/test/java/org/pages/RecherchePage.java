package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RecherchePage {

    WebDriver driver;
    @FindBy(xpath = "//a[@title='Recherche']")
    WebElement iconeRecherche;
    @FindBy(id ="selectCategorie")
    WebElement listeChoix;
    @FindBy(xpath = "//li[@data-value='BEV00000']")
    WebElement choix;
    @FindBy(id = "loc_libelle")
    WebElement localisation;
   @FindBy(id="ui-id-508")
   WebElement choixLocal;
    @FindBy(xpath="//button[@type='submit']")
    WebElement btnRechercher;
    @FindBy(xpath = "//a[@title='Braderie APF France handicap Vitré (35)']")
    WebElement resultat;

    public RecherchePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void cliquerSurIconeRecherche(){
        iconeRecherche.click();
    }
    public void cliquerListeChoix(){
        listeChoix.click();
    }
    public void CliquerChoix(){
        choix.click();
    }
    public void saisirLocalisation(String Local) {
        localisation.sendKeys(Local);
    }
    public void cliquerBtnRecherche(){
        btnRechercher.click();
    }
    public void cliquerResultat(){
        resultat.click();
    }
}
