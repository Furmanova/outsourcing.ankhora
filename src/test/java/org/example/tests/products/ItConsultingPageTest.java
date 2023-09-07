package org.example.tests.products;

import org.example.pages.services.ItConsultingPage;
import org.example.pages.services.ServicesPage;
import org.example.tests.BasePageTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class ItConsultingPageTest extends BasePageTest {
    public ItConsultingPage itConsulting;
    public ServicesPage services;

    @BeforeEach
    public void goToPage() {
        super.goToPage();
        services = page(ServicesPage.class);
        itConsulting = page(ItConsultingPage.class);
    }

    @Test
    public void iTConsultingTest() {
        services.servicesPage();
        itConsulting.clickItConsulting();
    }

    @Test
    public void clickButtonFindOutMoreTest() {
        services.servicesPage();
        itConsulting.clickItConsulting();
        itConsulting.clickButtonFindOutMore();
        itConsulting.setMessageHeader()
                .should(text("Automation of financial and operational processes"));
    }
}
