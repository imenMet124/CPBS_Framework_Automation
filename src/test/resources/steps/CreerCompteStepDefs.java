package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.CreerComptePage;

import java.util.concurrent.TimeUnit;

public class CreerCompteStepDefs {
    WebDriver driver;
    CreerComptePage creerComptePage = new CreerComptePage(driver);


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.paruvendu.fr/");

    }

    @When( "Je clique sur l'icone Compte")
    public void je_clique_sur_l_icone_Compte() {
        creerComptePage.cliquerSurIconeCompte();
    }
    @Then("Je clique sur inscrivez vous gratuitement")
    public void Jecliquesurinscrivezvousgratuitement (){
        creerComptePage.clickBoutonInscription();
    }

   @And("Je saisis le mail")
   public void je_saisis_le_mail() {
        creerComptePage.saisirMail("methniimen@gmail.com");
   }

    @And ("Je saisis le prenom")
    public void je_saisis_le_prenom() {
        creerComptePage.saisirPrenom("imen");
    }
    @And ("Je saisis le nom")
    public void je_saisis_le_nom() {
        creerComptePage.saisirNom("methni");
    }
    @And ("Je saisis la ville")
    public void je_saisis_la_ville() {
        creerComptePage.saisirVille("Toulouse");
    }
    @And ("je clique sur le bouton Me connecter ")
    public void je_clique_sur_le_bouton_me_connecter() {
        creerComptePage.clickBoutonCreerCompte();
    }
}
