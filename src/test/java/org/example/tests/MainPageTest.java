package org.example.tests;

import org.example.pages.FormSendPage;
import org.example.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.page;

public class MainPageTest extends BasePageTest {
    MainPage mainPage;

    @BeforeEach
    public void goToPage() {
        super.goToPage();
        mainPage = page(MainPage.class);
    }

    @Test
    public void mainPageTest() {
        mainPage.clickItConsulting();
        mainPage.clickAudit();
        mainPage.clickItConsulting();
        mainPage.clickCustomerSupport();
        mainPage.clickManagementConsulting();
        mainPage.clickMarketing();
        mainPage.clickWebsiteDevelopment();
        mainPage.clickTransferPricing();
        mainPage.clickSales();
        mainPage.clickHrConsulting();
    }
}
