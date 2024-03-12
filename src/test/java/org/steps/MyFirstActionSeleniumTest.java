package org.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.steps.MyFirstActionSelenium;

public class MyFirstActionSeleniumTest {
    private WebDriver driver;
    private MyFirstActionSelenium myFirstActionSelenium;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        myFirstActionSelenium = new MyFirstActionSelenium();
    }

    @Test
    public void testScenario() {
        myFirstActionSelenium.je_suis_sur_la_page_d_accueil_du_site_web();

        myFirstActionSelenium.je_clique_sur("Déposer une annonce gratuite");

        myFirstActionSelenium.je_choisis_l_option("IMMOBILIER");

        myFirstActionSelenium.je_choisis_l_option("Vente immobilier");

        myFirstActionSelenium.je_suis("Particulier");

        myFirstActionSelenium.je_choisis_le_type("Appartement");

        myFirstActionSelenium.je_saisis_le_titre("Un appartement en bon état");

        myFirstActionSelenium.je_saisis_la_description("Description de l'appartement");

        myFirstActionSelenium.je_saisis_la_surface("200");

        myFirstActionSelenium.je_coche_la_case("Surface Loi Carrez");

        myFirstActionSelenium.je_saisis_le_nombre_de_pièces("3");

        myFirstActionSelenium.jeSaisisLAnneeDeConstruction("2020");

        myFirstActionSelenium.jeCocheLaCaseDInvestissement("Investissement");

        myFirstActionSelenium.je_devrais_voir_un_message_de_confirmation_de_dépôt_de_l_annonce();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
