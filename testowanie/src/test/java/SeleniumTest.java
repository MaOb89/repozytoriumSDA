import org.apache.bcel.classfile.SourceFile;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    private static WebDriver driver;

    @BeforeClass
    public static void before() throws InterruptedException {
        //Driver znajduje się w resource
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        // Tworzymy nową instancję Firefoxa
        driver = new FirefoxDriver(capabilities);
        //Otwieramy stronę
        driver.get("http://www.kubamaterac.pl");
        // Wyświetlamy informacje, że udało się otwozyć stronę
        System.out.println("Successfully opened the website");
        //Czekamy 5 sekund
        Thread.sleep(2000);
    }

    @Test
    public void checkIfHelloScreenHaveCorrectText() {
        WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'bubble table__cell')]"));
        String napis = element.getText();
        assertEquals("Jestem Kuba,\ndeveloper c#, javy,\nphp i androida.", napis);
    }

    @Test
    public void checkIfThingsLikeExists() throws InterruptedException {
        //znalezienie menu
        WebElement menu = driver.findElement(By.id("parallax"));
        menu.findElement(By.id("omnie")).click();
        System.out.println();

        //znalezienie zainteresowań
        WebElement interests = driver.findElement(By.xpath("//div[contains(@class,'interests')]"));

        //przescrollowanie strony
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", interests);
        Thread.sleep(1000);
        System.out.println();

        // wyszukanie wszystich figcaption
        List<WebElement> aaa = interests.findElements(By.xpath(".//figcaption"));
        System.out.println();

        //sprawdzamy czy lista jest dlugosci 4
        assertEquals(4, aaa.size());

        //po kolei sprawdzamy napisy
        assertEquals("Programowanie", aaa.get(0).getText());
        assertEquals("Motocykle", aaa.get(1).getText());
        assertEquals("Piwo", aaa.get(2).getText());
        assertEquals("Dobra muzyka", aaa.get(3).getText());
    }
    //znalezienie menu i biogramu
    // znalezienie linka - wyszukanie div o id=mCSB_/

    @Test
    public void checkLink() {
//menu
        WebElement menu = driver.findElement(By.id("parallax"));
        menu.findElement(By.id("omnie")).click();
        System.out.println();
        //srodkowy element
        WebElement element = driver.findElement(By.xpath("//div[@id='mCSB_1']"));

        // wyszukiwanie linka, podejscie 1 - xpath
        // WebElement link = element.findElement(By.xpath("//div[@id='mCSB_1']//a[contains(@class,'company-link')]"));

        // podejscie 2 - po klasie
        //WebElement link = element.findElement(By.className("company-link"));

        // podejscie 3 - po tekscie
        WebElement link = element.findElement(By.xpath(".//a[contains(text(), 'Wydziale')]"));

        //pobranie atrybutu
        assertEquals("http://cs.pwr.edu.pl/", link.getAttribute("href"));


        //znalezienie naglowkow - zadanie 1
        WebElement subtitle = driver.findElement(By.xpath("//div[contains(@class,'sub-title')]"));
        WebElement Jestem = element.findElement(By.xpath(".//a[contains(text(), 'Jestem')]"));
        WebElement ZnamSieNa = element.findElement(By.xpath(".//a[contains(text(), 'Znam się na')]"));
        WebElement RzeczyKtoreLubie = element.findElement(By.xpath(".//a[contains(text(), 'Rzeczy, które lubię')]"));

        //przeniesienie na strone
        WebElement menu1 = driver.findElement(By.id("parallax"));
        menu.findElement(By.id("projekty")).click();
        System.out.println();



    }

    @AfterClass
    public static void after() {
        // Zamykamy driver
        driver.quit();

    }
}

