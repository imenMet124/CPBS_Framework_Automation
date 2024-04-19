package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.pages.SeConnecterPage;

import java.util.concurrent.TimeUnit;

public class SeConnecterStepDefs {

    WebDriver driver;
    SeConnecterPage seConnecter = new SeConnecterPage(driver);

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.paruvendu.fr/");

    }

    @When("Je clique sur l'icone Compte")
    public void jecliqueSuriconeCompte() {
        seConnecter.cliquerSurIconeCompte();
    }
    @Then("Je clique sur connectez-vous")
    public void jecliqueSurConnectezVous() {
        seConnecter.cliquerBoutonConnectezVous();
    }
    @And ("Je saisis le mail")
    public void jesaisisLeMail() {
        seConnecter.saisirMail("le@mail.com");
    }
    @And("je clique sur le bouton continue")
    public void jecliqueSurBoutonContinue() {
        seConnecter.cliqueContinue();
    }
    @And ("Je saisis le mot de passe")
    public void jesaisisMotDePasse() {
        seConnecter.saisirMDP("mot de passe");
    }
    @And ("je clique sur le bouton Me connecter ")
    public void jecliqueSurBoutonMeConnecter() {
        seConnecter.cliqueBoutonconnecter();
    }
    @Then ("J'accede à mon profile")
    public void jaccedeMonProfile() {
    }
}
