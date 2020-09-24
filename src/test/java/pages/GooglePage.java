package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.naming.Name;

public class GooglePage {

    public GooglePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (name = "q")
    public WebElement aramaKutusu;
}