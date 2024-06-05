package org.steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.CreerComptePage;
import org.pages.SeConnecterPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeConnecterStepDefs {
    WebDriver driver;
    SeConnecterPage seConnecter;
    @Before
    private void setUpDriver() throws IOException {
//        FileInputStream fis= new FileInputStream("C:\\CPBS_Framework_Automation\\src\\test\\resources\\configuration\\config.properties");
//        Properties p = new Properties();
//        p.load(fis);
//        String browser = p.getProperty("browser");
//        String chromeDriver = p.getProperty("chromeDriver");
//        String url= p.getProperty("url");

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.paruvendu.fr/");
        js.executeScript("cmp_pv.cookie.saveConsent(true);");
        driver.manage().window().maximize();
    }
    @Given("Je suis sur la page accueil du site web")
    public void je_suis_sur_la_page_dacceuil() throws IOException {
        setUpDriver(); // Appel de la méthode pour initialiser le driver
        seConnecter = new SeConnecterPage(driver);
    }
    @When("Je clique sur icone Compte")
    public void je_clique_sur_icone_compte() {
        seConnecter.cliquerSurIconeCompte();
    }
    @Then("Je clique sur connectez-vous")
    public void je_clique_sur_connectez_vous() {
        seConnecter.cliquerBoutonConnectezVous();
    }
    @And("Je saisis le mail")
    public void je_saisis_le_mail() {
        seConnecter.saisirMail("methniimen@gmail.com");
    }
    @And("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() {
        seConnecter.cliqueContinue();
    }
    @And("Je saisis le mot de passe")
    public void je_saisis_le_mot_de_passe() {
        seConnecter.saisirMDP("imen@BAC2021");
    }
    @And("je clique sur le bouton Me connecter")
    public void je_clique_sur_le_bouton_me_connecter() {
        seConnecter.cliqueBoutonconnecter();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
