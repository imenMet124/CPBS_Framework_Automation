package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeposerAnnoncePage {
    WebDriver driver;

    @FindBy(xpath="//div[@class='select']")
    WebElement s1_1;

    @FindBy(xpath="//li[@data-value='I']")
    WebElement s1_2;
    @FindBy(xpath="//li[@data-value='IVH00000']")
    WebElement s1_3;

    @FindBy(xpath="//div[@id='dprivate_ad']")
    WebElement btnParticulier;

    @FindBy(id="categorie")
    WebElement categ;

    @FindBy (id="titre")
    WebElement titre;
    @FindBy (id="descBien")
    WebElement desc;
    @FindBy (id="superficie")
    WebElement superficie;

    @FindBy(xpath="//div[@id='bloc_flagSurfaceCarrez_1']")
    WebElement surface;

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
    public void choisirAnnonce(){
        s1_1.click();
        s1_2.click();
        s1_3.click();

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
    public void selectNbPiece(String arg) {
        Select select = new Select(NbPieces);
        select.selectByVisibleText(arg);
    }
    public void saisirAnneeContruction(String arg1) {
        anneeConstruction.sendKeys(arg1);
    }
    public void checkInvest() {
        invest.click();
    }

}
