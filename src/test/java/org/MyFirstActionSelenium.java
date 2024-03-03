package org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstActionSelenium {
    public static void main(String[] args) {
        // Spécifiez l'emplacement du chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        // Initialisez le WebDriver pour Chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Naviguer vers l'URL de votre site web
      /*  driver.get("https://www.boulanger.com/");

        // Deletes all the cookies
        driver.manage().deleteAllCookies();

        WebElement boutonMeConnecter = driver.findElement(By.xpath("//button[contains(text(), 'Me connecter')]"));
        boutonMeConnecter.click();

        WebElement boutonNvCompte = driver.findElement(By.xpath("//button[contains(text(), 'Créer mon compte')]"));
        boutonNvCompte.click();


        driver.findElement(By.id("identifier")).sendKeys("imen methni");
        driver.findElement(By.id("password")).sendKeys("imen@BAC2021");

        WebElement R1 = driver.findElement(By.id("customerType_private_individual"));
        WebElement R2 = driver.findElement(By.id("customerType_professional"));
        R1.click();
        WebElement R3 = driver.findElement(By.id("gender_female"));
        WebElement R4 = driver.findElement(By.id("gender_male"));
        R3.click();

        driver.findElement(By.id("familyName")).sendKeys("methni");
        driver.findElement(By.id("givenName")).sendKeys("imen");
        driver.findElement(By.id("birthdate")).sendKeys("16/02/2003");

        Select pays = new Select(driver.findElement(By.id("country")));
        pays.selectByVisibleText("TUNISIE");

        driver.findElement(By.id("address")).sendKeys("bardo");
        driver.findElement(By.id("postalCode")).sendKeys("1007");
        driver.findElement(By.id("city")).sendKeys("Tunis");

        Select tel = new Select(driver.findElement(By.name("contactPhoneNumberIndicator")));
        pays.selectByVisibleText("TN");

        driver.findElement(By.id("contactPhoneNumberDigits")).sendKeys("50133970");
        driver.findElement(By.id("email")).sendKeys("methniimen@gmail.com");

        WebElement R5 = driver.findElement(By.id("commercialOffers_false"));
        R5.click();

        WebElement R6 = driver.findElement(By.id("optin_survey_false"));
        R6.click();

*/


        // Fermer le navigateur
        driver.quit();
    }
}
