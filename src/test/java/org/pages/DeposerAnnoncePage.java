package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeposerAnnoncePage {
    WebDriver driver;
    @FindBy(xpath="//a[@title='Déposez vos annonces gratuites']")
    WebElement boutonAnnonce;
    @FindBy(xpath="//div[@class='select']")
    WebElement choix1;
    @FindBy(xpath="//li[@data-value='I']")
    WebElement choix2;
    @FindBy(xpath="//li[@data-value='IVH00000']")
    WebElement choix3;
    @FindBy(xpath="//div[@id='dprivate_ad']")
    WebElement btnParticulier;
    @FindBy(id="categorie")
    WebElement categ;
    @FindBy (id="titre")
    WebElement titre;
    @FindBy (id="descBien")
    WebElement desc;
    @FindBy(id="superficie")
    WebElement surface;
    @FindBy(id = "bloc_flagSurfaceCarrez_1")
    WebElement coche;
    @FindBy (id="codeNbPieces")
    WebElement NbPieces;
    @FindBy (id="anneeConstruction")
    WebElement anneeConstruction;
    @FindBy(xpath="//div[@id='bloc_investissement_1']")
    WebElement invest;
    public DeposerAnnoncePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void cliqueBtnAnnonce(){
        boutonAnnonce.click();
    }
    public void choisirAnnonce(){
        choix1.click();
        choix2.click();
        choix3.click();
    }
    public void personne() {
        btnParticulier.click();
    }
    public void selectCategorie(String type) {
            Select select = new Select(categ);
            select.selectByVisibleText(type);
    }
    public void saisirTitre(String arg1) {
        titre.sendKeys(arg1);
    }
    public void saisirDescrip(String arg1) {
        desc.sendKeys(arg1);
    }
    public void saisirSurface(String arg1) {
        surface.sendKeys(arg1);
    }
    public void cocherSurface() {
        coche.click();
    }
   public void selectNbPiece(String arg) {
        Select select = new Select(NbPieces);
        select.selectByVisibleText(arg);
    }
    public void saisirAnneeContruction(String arg1) {
        anneeConstruction.sendKeys(arg1);
    }
    public void checkinvest() {
        invest.click();
    }
}
