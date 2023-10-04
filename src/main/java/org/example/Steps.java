package org.example;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import static com.codeborne.selenide.Selenide.$x;


public class Steps {
    private final SelenideElement searchField = $x("//input[@id='text']");
    private final SelenideElement submitButton = $x("//button[@type='submit']");


    @Given("Open link {string}")
    public void openLink(String string) {
        Selenide.open(string);
    }

    @And("Input search request {string}")
    public void inputSearchRequest(String str) {
        searchField.click();
        searchField.setValue(str);
    }

    @And("Wait {int} sec")
    public void waitSec(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000L);
    }

    @And("Press Enter button")
    public void pressEnterButton() {
        submitButton.click();
    }
}