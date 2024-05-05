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

public class SeConnecterStepDefs {
    WebDriver driver;
    SeConnecterPage seConnecter;
    @Before
    private void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.paruvendu.fr/");
        js.executeScript("cmp_pv.cookie.saveConsent(true);");
        driver.manage().window().maximize();
    }
    @Given("Je suis sur la page accueil du site web")
    public void je_suis_sur_la_page_dacceuil() {
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
    @Then("Je saisis le mail")
    public void je_saisis_le_mail() {
        seConnecter.saisirMail("methniimen@gmail.com");
    }
    @Then("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() {
        seConnecter.cliqueContinue();
    }
    @Then("Je saisis le mot de passe")
    public void je_saisis_le_mot_de_passe() {
        seConnecter.saisirMDP("imen@BAC2021");
    }
    @Then("je clique sur le bouton Me connecter")
    public void je_clique_sur_le_bouton_me_connecter() {
        seConnecter.cliqueBoutonconnecter();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
