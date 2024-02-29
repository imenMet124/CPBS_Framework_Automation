package org;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstActionSelenium {
    public static void main(String[] args) {
        // Spécifiez l'emplacement du chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\CPBS_Framework_Automation\\drivers\\chromedriver.exe");

        // Initialisez le WebDriver pour Chrome
        WebDriver driver = new ChromeDriver();

        // Naviguer vers l'URL de votre site web
        driver.get("https://www.boulanger.com/");

        // Deletes all the cookies
        driver.manage().deleteAllCookies();

        // Fermer le navigateur
        driver.quit();
    }
}
