package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class FormSendPage {

    /**
     * Properties
     **/

    static final String VALID_EMAIL = PropertiesLoader.loadProperty("valid.email");
    static final String VALID_PHONE_NUMBER = PropertiesLoader.loadProperty("valid.phoneNumber");
    static final String INVALID_PHONE_NUMBER = PropertiesLoader.loadProperty("invalid.email");
    static final String INVALID_EMAIL = PropertiesLoader.loadProperty("invalid.phoneNumber");
    static final String PLACE_OF_WORK = PropertiesLoader.loadProperty("place.of.work");
    static final String SPECIALTY = PropertiesLoader.loadProperty("specialty");
    static final String YOUR_MESSAGE = PropertiesLoader.loadProperty("your.message");

    /**
     * Elements
     */

    By buttonSend = By.xpath("//a[contains(.,'Send')]");
    By email = By.xpath("//input[@id='wpforms-551-field_1']");
    By phoneNumber = By.xpath("//input[@id='wpforms-551-field_7']");
    By errorMessageContainer = By.xpath("//label[@id='wpforms-551-field_1-error']");
    By placeOfWork = By.xpath("//input[@id='wpforms-551-field_4']");
    By specialty = By.xpath("//textarea[@id='wpforms-551-field_6']");
    By yourMessage = By.xpath("//textarea[@id='wpforms-551-field_2']");

    /**
     * Methods
     **/
    public FormSendPage validFillForm() {
        $(email).setValue(VALID_EMAIL);
        $(placeOfWork).setValue(PLACE_OF_WORK);
        $(specialty).setValue(SPECIALTY);
        $(phoneNumber).setValue(VALID_PHONE_NUMBER);
        $(yourMessage).setValue(YOUR_MESSAGE);
        return page(FormSendPage.class);
    }

    public void invalidFillFormEmail() {
        $(email).setValue(INVALID_EMAIL);
    }

    public void invalidFillFormPhoneNumber() {
        $(phoneNumber).setValue(INVALID_PHONE_NUMBER);
    }

    public SelenideElement getErrorMessageContainer() {
        return $(errorMessageContainer);
    }

    public void clickButtonSend() {
        $(buttonSend).click();
    }

    public void clickOnPlaceOfWork() {
        $(placeOfWork).click();
    }

    public void clickOnYourMessage() {
        $(yourMessage).click();
    }
}
