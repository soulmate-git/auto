package pages;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends ElementsContainer {

    @FindBy(xpath = "//input[@id='text']")
    public SelenideElement searchField;
    @FindBy(xpath = "//button[@type='submit']")
    public SelenideElement submitButton;

}
