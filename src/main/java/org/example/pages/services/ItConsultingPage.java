package org.example.pages.services;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ItConsultingPage {
    By itConsultingPage = By.xpath("//a[contains(text(),'IT consulting')]");
    By buttonFindOutMore = By.xpath("//a/span/span");
    By messageHeader = By.xpath("//h2[contains(text(),'Automation of financial and operational processes')]");
    By headerItConsulting = By.xpath("//h1[contains(text(),'IT consulting')]");

    public void clickItConsulting() {
        $(itConsultingPage).click();
    }

    public void clickButtonFindOutMore() {
        $(headerItConsulting).scrollTo();
        $(buttonFindOutMore).click();
    }

    public SelenideElement setMessageHeader() {
        return $(messageHeader);
    }
}
