package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;


public class EbayStepDefinition {

    EbayPage ebayPage = new EbayPage();

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici bayda arama kutusuna {string} yazar")
    public void kullanici_bayda_arama_kutusuna_yazar(String string) {
        ebayPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("sonuc sayilarini ekrana yazdirir")
    public void sonuc_sayilarini_ekrana_yazdirir() {
        String sonucSayisi = ebayPage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
    }
}
