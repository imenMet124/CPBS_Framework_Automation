package org.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.setup.MyFirstActionSelenium;
import org.testng.annotations.BeforeTest;
import pages.DeposerAnnoncePage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class MyFirstActionSeleniumTest {
     WebDriver driver;

     HomePage objHomePage;
     DeposerAnnoncePage objAnnoncePage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.paruvendu.fr/");

    }

    @Test
    public void goToHomePage() {
        objHomePage = new HomePage(driver);
        objHomePage.clickOnDeposer();
    }

    @Test
    public void DeposerAnnonce() {

        objAnnoncePage = new DeposerAnnoncePage(driver);
        objAnnoncePage.choisirAnnonce();
        objAnnoncePage.personne();
        objAnnoncePage.selectCategorie("Appartement");
        objAnnoncePage.saisirTitre("Un appartement en bon état");
        objAnnoncePage.saisirDescrip("Un appartement en bon état");
        objAnnoncePage.saisirSurface("200");
        objAnnoncePage.selectNbPiece("3");
        objAnnoncePage.saisirAnneeContruction("2020");
        objAnnoncePage.checkInvest();









    }
}
