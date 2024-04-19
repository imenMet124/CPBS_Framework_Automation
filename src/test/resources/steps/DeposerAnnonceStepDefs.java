package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.pages.DeposerAnnoncePage;
import org.pages.HomePage;

import java.util.concurrent.TimeUnit;

public class DeposerAnnonceStepDefs {
     WebDriver driver;

    DeposerAnnoncePage Deposer_Annonce = new DeposerAnnoncePage(driver);


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.paruvendu.fr/");

    }

    @Given("^Je suis sur la page d'accueil du site web$")
    public void Home_Page() {
        HomePage home_page = new HomePage(driver);
        home_page.ClickPourDeposer();
    }


    @When("Je clique surDeposer une annonce gratuite")
    public void JeCliquesurDeposerUneAnnonce() {
        Deposer_Annonce.choisirAnnonce();
    }

    @And("Je clique sur Choisir une catégorie")
    public void JecliquesurChoisirunecatégorie() {
        Deposer_Annonce.selectCategorie("Appartement");

    }


    @And("je choisis l'option IMMOBILIER")
    public void jechoisisloptionIMMOBILIER() {
        Deposer_Annonce.choisirAnnonce();

    }

    //And Je choisis l'option "Vente immobilier"
    @And("Je suis Particulier")
    public void JesuisParticulier() {
        Deposer_Annonce.personne();
    }

    @And("Je choisis le type Appartement")
    public void JeChoisisleTypeAppartement() {
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
    public void JeSaisisLaSurface() {
        Deposer_Annonce.saisirSurface("200");
    }

    @And("Je coche la case Surface Loi Carrez")
    public void JeCocheLaCaseSurfaceLoiCarrez() {
        Deposer_Annonce.saisirSurface("Loi Carrez");
    }

    @And("Je saisis le nombre de pièces ")
    public void JeSaisisLeNombreDePieces() {
        Deposer_Annonce.selectNbPiece("3");

    }

    @And("je saisis l'annee de construction 2020")
    public void JeSaisisLLaAnneeDeConstruction2020() {
        Deposer_Annonce.saisirAnneeContruction("2020");

    }

    @And("je coche la case dinvestissement investissement")
    public void JeCocheLaCaseInvestissementInvestissement() {
        Deposer_Annonce.checkInvest();
    }


}

