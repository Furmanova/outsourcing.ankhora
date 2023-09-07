package org.example.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.pages.FormSendPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class FormSendTest extends BasePageTest {
    FormSendPage formSendPage;

    @BeforeEach
    public void goToPage() {
        super.goToPage();
        formSendPage = page(FormSendPage.class);
    }

    @Test
    public void formSendPageTest() {
        formSendPage.clickButtonSend();
        formSendPage.validFillForm();
    }

    @Test
    public void testEmailNegative() {
        formSendPage.clickButtonSend();
        formSendPage.invalidFillFormEmail();
        formSendPage.clickOnPlaceOfWork();
        formSendPage.getErrorMessageContainer()
                .shouldHave(text("Please enter a valid email address."));
    }

    @Test
    public void testPhoneNumberNegative() {
        formSendPage.clickButtonSend();
        formSendPage.invalidFillFormPhoneNumber();
        formSendPage.clickOnYourMessage();
        formSendPage.getErrorMessageContainer()
                .shouldHave(text("Please enter a valid Phone Number address."));
    }
}
