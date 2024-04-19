package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeConnecterPage {
    WebDriver driver;
    @FindBy(linkText = "Compte")
    WebElement iconeCompte;
    @FindBy(linkText = "Connectez-vous")
    WebElement boutonConnectezVous;
    @FindBy(id = "identification_eMail")
    WebElement mail;
    @FindBy(linkText = "Continuer »")
    WebElement boutonContinue;
    @FindBy(id = "popinAuthPassword")
    WebElement motdepasse;
    @FindBy(id = "btnSubmitIdentificationCompte")
    WebElement boutonConnecter;

    public SeConnecterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void cliquerSurIconeCompte(){
        iconeCompte.click();
    }
    public void cliquerBoutonConnectezVous(){
        boutonConnectezVous.click();
    }
    public void saisirMail(String Mail){
        mail.sendKeys(Mail);

    }
    public void cliqueContinue(){
        boutonContinue.click();

    }

    public void saisirMDP(String mdp){
        motdepasse.sendKeys(mdp);
    }

    public void cliqueBoutonconnecter(){
        boutonConnecter.click();
    }



}
