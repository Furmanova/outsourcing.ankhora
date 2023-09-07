package org.example.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    By itConsulting = By.xpath("//a[contains(.,'Read more')]");
    By managementConsulting = By.xpath("//a[contains(.,'Read more')]");
    By sales = By.xpath("//a[contains(.,'Read more')]");
    By websiteDevelopment = By.xpath("//a[contains(.,'Read more')]");
    By customerSupport = By.xpath("//a[contains(.,'Read more')]");
    By transferPricing = By.xpath("//a[contains(.,'Read more')]");
    By audit = By.xpath("//a[contains(.,'Read more')]");
    By hrConsulting = By.xpath("//a[contains(.,'Read more')]");
    By marketing = By.xpath("//a[contains(.,'Read more')]");
    By header = By.xpath("//a[contains(.,'\n" + "\t\t\t\t\tOutsourcing\n" + "\t\t\t\t')]");

    public void clickItConsulting() {
        $(header).scrollTo();
        $(itConsulting).click();
    }

    public void clickManagementConsulting() {
        $(header).scrollTo();
        $(managementConsulting).click();
    }

    public void clickSales() {
        $(header).scrollTo();
        $(sales).click();
    }

    public void clickWebsiteDevelopment() {
        $(header).scrollTo();
        $(websiteDevelopment).click();
    }

    public void clickCustomerSupport() {
        $(header).scrollTo();
        $(customerSupport).click();
    }

    public void clickTransferPricing() {
        $(header).scrollTo();
        $(transferPricing).click();
    }

    public void clickAudit() {
        $(header).scrollTo();
        $(audit).click();
    }

    public void clickHrConsulting() {
        $(header).scrollTo();
        $(hrConsulting).click();
    }

    public void clickMarketing() {
        $(header).scrollTo();
        $(marketing).click();
    }
}
