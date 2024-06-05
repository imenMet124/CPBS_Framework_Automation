package org.steps;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.CreerComptePage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreerCompteStepDefs{
   private  WebDriver driver;
    private CreerComptePage creerCompte;
    @Before
    private void setUpDriver() {

//        FileInputStream fis= new FileInputStream("C:\\CPBS_Framework_Automation\\src\\test\\resources\\configuration\\config.properties");
//         Properties p = new Properties();
//         p.load(fis);
//         String browser = p.getProperty("browser");
//         String chromeDriver = p.getProperty("chromeDriver");
//         String url= p.getProperty("url");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.paruvendu.fr/");
        js.executeScript("cmp_pv.cookie.saveConsent(true);");
        driver.manage().window().maximize();
    }
    @Given("Je suis sur la page d'accueil")
    public void je_suis_sur_la_page_dacceuil()  {

        setUpDriver(); // Appel de la méthode pour initialiser le driver
        creerCompte = new CreerComptePage(driver);
    }
   @When("Je clique sur licone Compte")
    public void je_clique_sur_l_icone_Compte() {
        creerCompte.cliquer_Sur_Icone_Compte();
    }
    @Then("Je clique sur inscrivez-vous gratuitement")
    public void Je_clique_sur_inscrivez_vous_gratuitement(){
        creerCompte.clickBoutonInscription();
    }
    @And ("Je saisis le mail du compte")
    public void je_saisis_le_mail_du_compte() {
        creerCompte.saisirMail("yas@gmail.com");
    }
    @And ("Je saisis le prenom")
    public void je_saisis_le_prenom() {
        creerCompte.saisirPrenom("imen");
    }
    @And ("Je saisis le nom")
    public void je_saisis_le_nom() {
        creerCompte.saisirNom("methni");
    }
    @And ("Je saisis la ville")
    public void je_saisis_la_ville() {
        creerCompte.saisirVille("Toulouse");
    }
    @And ("je clique sur le bouton meConnecter")
    public void je_clique_sur_le_bouton_meConnecter() {
        creerCompte.clickBoutonCreerCompte();

    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
