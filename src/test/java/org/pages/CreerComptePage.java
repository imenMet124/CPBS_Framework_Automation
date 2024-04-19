package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreerComptePage {
    WebDriver driver;

    @FindBy(linkText = "Compte")
    WebElement iconCompte;

    @FindBy(linkText = "Inscrivez-vous gratuitement")
    WebElement boutonInscription;

    @FindBy(id = "eMail")
    WebElement mail;

    @FindBy(id = "prenom")
    WebElement prenom;

    @FindBy(id = "nom")
    WebElement nom;

    @FindBy(id = "ville")
    WebElement ville;

    @FindBy(id = "btnSubmitCreaCompte")
    WebElement boutonCreerCompte;

    public CreerComptePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
     public void cliquerSurIconeCompte(){
         iconCompte.click();
     }
     public void clickBoutonInscription(){
        boutonInscription.click();
     }
     public void saisirMail(String Mail){
        mail.sendKeys(Mail);
     }
     public void saisirPrenom(String Prenom){
        prenom.sendKeys(Prenom);
     }
     public void saisirNom(String Nom){
        nom.sendKeys(Nom);
     }
     public void saisirVille(String Ville){
        ville.sendKeys(Ville);
     }
     public void clickBoutonCreerCompte(){
        boutonCreerCompte.click();
     }
}
