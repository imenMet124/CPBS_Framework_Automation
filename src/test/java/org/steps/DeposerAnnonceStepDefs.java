package org.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.DeposerAnnoncePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DeposerAnnonceStepDefs {
     WebDriver driver;
    DeposerAnnoncePage Deposer_Annonce ;

@Before
private void setUpDriver() throws IOException {
    FileInputStream fis= new FileInputStream("C:\\CPBS_Framework_Automation\\src\\test\\resources\\configuration\\config.properties");
    Properties p = new Properties();
    p.load(fis);
    String browser = p.getProperty("browser");
    String chromeDriver = p.getProperty("chromeDriver");
    String url= p.getProperty("url");

    System.setProperty(browser, chromeDriver);
    driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get(url);
    js.executeScript("cmp_pv.cookie.saveConsent(true);");
    driver.manage().window().maximize();
}
    @Given("Je suis sur la page d'accueil du site web")
    public void je_suis_sur_la_page_du_site_web() throws IOException {
        setUpDriver(); // Appel de la méthode pour initialiser le driver
        Deposer_Annonce = new DeposerAnnoncePage(driver);
    }
    @When("Je clique sur Déposer une annonce gratuite")
    public void je_cliqueur_une_annonce_gratuite() {
        Deposer_Annonce.cliqueBtnAnnonce();
    }
    @And ("Je clique sur Choisir une catégorie")
    public void Je_clique_sur_Choisir_une_catégorie(){
        Deposer_Annonce.choisirAnnonce();
    }
    @And ("Je suis Particulier")
    public void Je_suis_particulier() {
        Deposer_Annonce.personne();
    }
    @And ("Je choisis le type Appartement")
    public void Je_choisis_le_type_Appartement() {
        Deposer_Annonce.selectCategorie("Appartement");
    }
    @And("Je saisis le titre Un appartement en bon état")
    public void JeSaisisLeTitreUnAppartementEnBon() {
        Deposer_Annonce.saisirTitre("Un appartement en bon état");
    }
    @And("Je saisis la description Un appartement en bon état")
    public void JeSaisisLaDescriptionUnAppartementEnBon() {
        Deposer_Annonce.saisirDescrip("Un appartement en bon état");
    }
    @And("Je saisis la surface 200")
    public void JeSaisisLaSurface(){
        Deposer_Annonce.saisirSurface("200");
    }
    @And("Je coche la case Surface Loi Carrez")
    public void JeCocheLaCaseSurfaceLoiCarrez() {
        Deposer_Annonce.cocherSurface();
    }
   @And("Je saisis le nombre de pièces 3")
    public void JeSaisisLeNombreDePieces3() {
        Deposer_Annonce.selectNbPiece("3");
    }
    @And ("je saisis l'annee de construction")
            public void JeSaisisLLaAnneeDeConstruction() {
        Deposer_Annonce.saisirAnneeContruction("2020");
    }
    @And("je coche la case d'investissement")
    public void jeCocheLaCaseDInvestissement() {
        Deposer_Annonce.checkinvest();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}