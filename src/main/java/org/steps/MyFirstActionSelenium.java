package org.steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MyFirstActionSelenium {
    WebDriver driver;
    ExtentTest extentTest;
    ExtentReports extentReports;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        // Initialisation de ExtentReports avec ExtentSparkReporter
        ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(spark);
    }

    @Given("Je suis sur la page d'accueil du site web")
    public void je_suis_sur_la_page_d_accueil_du_site_web() {
        driver.get("https://www.paruvendu.fr/");
        extentTest.log(Status.INFO, "Je suis sur la page d'accueil du site web");
    }

    @When("Je clique sur {string}")
    public void je_clique_sur(String linkText) {
        driver.findElement(By.partialLinkText(linkText)).click();
        extentTest.log(Status.INFO, "Je clique sur '" + linkText + "'");
    }

    @And("Je choisis l'option {string}")
    public void je_choisis_l_option(String option) {
        driver.findElement(By.xpath("//div[@class='select']"))
                .click();
        driver.findElement(By.xpath("//li[@data-value='I']"))
                .click();
        driver.findElement(By.xpath("//li[@data-value='IVH00000']"))
                .click();
        extentTest.log(Status.INFO, "Je choisis l'option '" + option + "'");
    }

    @And("Je suis {string}")
    public void je_suis(String role) {
        driver.findElement(By.xpath("//div[@id='dprivate_ad']"))
                .click();
        extentTest.log(Status.INFO, "Je suis '" + role + "'");
    }

    @And("Je choisis le type {string}")
    public void je_choisis_le_type(String type) {
        Select select = new Select(driver.findElement(By.id("categorie")));
        select.selectByVisibleText(type);
        extentTest.log(Status.INFO, "Je choisis le type '" + type + "'");
    }

    @And("Je saisis le titre {string}")
    public void je_saisis_le_titre(String title) {
        driver.findElement(By.id("titre"))
                .sendKeys(title);
        extentTest.log(Status.INFO, "Je saisis le titre '" + title + "'");
    }

    @And("Je saisis la description {string}")
    public void je_saisis_la_description(String description) {
        driver.findElement(By.id("descBien"))
                .sendKeys(description);
        extentTest.log(Status.INFO, "Je saisis la description '" + description + "'");
    }

    @And("Je saisis la surface {string}")
    public void je_saisis_la_surface(String surface) {
        driver.findElement(By.id("superficie"))
                .sendKeys(surface);
        extentTest.log(Status.INFO, "Je saisis la surface '" + surface + "'");
    }

    @And("Je coche la case {string}")
    public void je_coche_la_case(String checkbox) {
        driver.findElement(By.xpath("//div[@id='bloc_flagSurfaceCarrez_1']"))
                .click();
        extentTest.log(Status.INFO, "Je coche la case '" + checkbox + "'");
    }

    @And("Je saisis le nombre de pièces {string}")
    public void je_saisis_le_nombre_de_pièces(String pieces) {
        Select select = new Select(driver.findElement(By.id("codeNbPieces")));
        select.selectByVisibleText(pieces);
        extentTest.log(Status.INFO, "Je saisis le nombre de pièces '" + pieces + "'");
    }

    @And("je saisis l'annee de construction {string}")
    public void jeSaisisLAnneeDeConstruction(String year) {

        driver.findElement(By.id("anneeConstruction")).sendKeys(year);
        extentTest.log(Status.INFO, "Je saisis l'année de construction '" + year + "'");
    }

    @And("je coche la case d'investissement {string}")
    public void jeCocheLaCaseDInvestissement(String investment) {

        driver.findElement(By.xpath("//div[@id='bloc_investissement_1']")).click();
        extentTest.log(Status.INFO, "Je coche la case d'investissement '" + investment + "'");
    }

    @Then("Je devrais voir un message de confirmation de dépôt de l'annonce")
    public void je_devrais_voir_un_message_de_confirmation_de_dépôt_de_l_annonce() {
        extentTest.log(Status.INFO, "Je devrais voir un message de confirmation de dépôt de l'annonce");
    }

    @After
    public void teardown() {
        driver.quit();
        extentReports.flush();
    }



}
