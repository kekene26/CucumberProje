package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleAramaStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given(": user google pagesine gider")
    public void user_google_pagesine_gider() {

        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
    }

    @Given("techproeducation search eder")
    public void techproeducation_search_eder() {
        googlePage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("google_kelime") + Keys.ENTER);
    }

    @Then("sayfa titlesini kontrol eder")
    public void sayfa_titlesini_kontrol_eder() {
        System.out.println("sayfa titlesini kontrol etti");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         String  baslik  = Driver.getDriver().getTitle();

        Assert.assertTrue(baslik.contains(ConfigurationReader.getProperty("google_kelime")));

    }

    }

