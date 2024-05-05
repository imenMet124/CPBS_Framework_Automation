package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class CreerComptePage {
    WebDriver driver;
    @FindBy(xpath = "//a[@title='Se connecter']")
    WebElement iconeCompte;
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
    @FindBy(id = "ui-id-280")
    WebElement valeurVille2;
    @FindBy(id = "btnSubmitCreaCompte")
    WebElement boutonCreerCompte;
    public CreerComptePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
     public void cliquer_Sur_Icone_Compte(){
         iconeCompte.click();
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
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         By listeDeroulante = By.id("ui-id-1"); // Changer en ID correct si nécessaire
         wait.until(ExpectedConditions.visibilityOfElementLocated(listeDeroulante));

         List<WebElement> options = driver.findElements(By.cssSelector("#ui-id-1 li"));
         for (WebElement option : options) {
             if (option.getText().equals(Ville)) {
                 option.click();
                 break;
             }
         }
     }
     public void clickBoutonCreerCompte(){
        boutonCreerCompte.click();
     }
}
