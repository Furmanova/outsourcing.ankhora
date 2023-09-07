package org.example.tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.example.pages.MainPage;
import org.example.pages.services.ItConsultingPage;
import org.example.pages.services.ServicesPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.example.pages.BasePage.BASE_URL;


public class BasePageTest {
    BasePageTest basePage;

    @BeforeEach
    public void goToPage() {
        basePage = open(BASE_URL, BasePageTest.class);
    }

    @AfterEach
    public void closeBrowser() {
        // getWebDriver().close();
        Configuration.holdBrowserOpen = true;
    }
}
