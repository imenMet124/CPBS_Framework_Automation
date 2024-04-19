package org.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.pages.SeConnecterPage;

import java.util.concurrent.TimeUnit;

public class SeConnecterStepDefs {

    WebDriver driver;
    SeConnecterPage seConnecter;


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.paruvendu.fr/");
    }

    @Given("Je suis sur la page accueil du site web")
    public void je_suis_sur_la_page_accueil_du_site_web() {
        setUp();
    }

    @When("Je clique sur icone Compte")
    public void je_clique_sur_icone_compte() {
        seConnecter = new SeConnecterPage(driver);
        seConnecter.cliquerSurIconeCompte();
    }

    @Then("Je clique sur connectez-vous")
    public void je_clique_sur_connectez_vous() {
        seConnecter.cliquerBoutonConnectezVous();
    }

    @Then("Je saisis le mail")
    public void je_saisis_le_mail() {
        seConnecter.saisirMail("le@mail.com");
    }

    @Then("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() {
        seConnecter.cliqueContinue();
    }

    @Then("Je saisis le mot de passe")
    public void je_saisis_le_mot_de_passe() {
        seConnecter.saisirMDP("mot de passe");
    }

    @Then("je clique sur le bouton Me connecter")
    public void je_clique_sur_le_bouton_me_connecter() {
        seConnecter.cliqueBoutonconnecter();
    }

    @Then("J'accede à mon profile")
    public void j_accede_à_mon_profile() {
    }

    @After
    public void tearDown(){driver.quit();}

}
