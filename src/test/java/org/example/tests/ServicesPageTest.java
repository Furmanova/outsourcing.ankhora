package org.example.tests;

import org.example.pages.services.ServicesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class ServicesPageTest extends BasePageTest {
    public ServicesPage services;

    @BeforeEach
    public void goToPage() {
        super.goToPage();
        services = page(ServicesPage.class);
    }

    @Test
    public void servicePageTest() {
        services.clickServicesPage();
        services.getServicesPage().shouldHave(text("List of services of HORAND LTD"));
    }
}
