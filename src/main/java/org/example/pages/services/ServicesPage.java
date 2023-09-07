package org.example.pages.services;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ServicesPage {
    By servicesPage = By.xpath("//a[contains(.,'Services')]");
    By messageContainer = By.xpath("//h2[contains(text(),'List of services of HORAND LTD')]");

    public void clickServicesPage() {
        $(servicesPage).click();
    }

    public SelenideElement getServicesPage() {
        return $(messageContainer);
    }

    public void servicesPage() {
        $(servicesPage).hover();
    }
}

