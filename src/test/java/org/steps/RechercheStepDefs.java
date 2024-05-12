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
import org.pages.RecherchePage;
import org.pages.SeConnecterPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RechercheStepDefs {
    WebDriver driver;
    RecherchePage Recherche;
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
    @Given("Je suis sur le site")
    public void je_suis_sur_le_site() throws IOException {
        setUpDriver(); // Appel de la méthode pour initialiser le driver
        Recherche = new RecherchePage(driver);

    }
    @When ("Je clique sur icone recherche")
    public void je_clique_recherche() {
        Recherche.cliquerSurIconeRecherche();
    }
    @Then("Je clique sur la liste des choix")
    public void je_clique_recherche_des_choix() {
        Recherche.cliquerListeChoix();

    }
    @And("je clique sur le choix")
    public void je_clique_recherche_le_choix() {
        Recherche.CliquerChoix();
    }

    @And("Je saisis la localisation voulu")
    public void je_saisis_la_localisation_voulu() {
        Recherche.saisirLocalisation("Paris");

    }
    @And("je clique sur le bouton rechercher")
    public void je_clique_rechercher_rechercher() {
        Recherche.cliquerBtnRecherche();
    }
    @Then("je choisis l'annonce")
    public void je_choisis_l_annonce() {
        Recherche.cliquerResultat();
   }
    @After
    public void tearDown(){
        driver.quit();
    }
}
