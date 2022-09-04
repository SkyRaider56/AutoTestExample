package org.autotest.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By catalogueButton = By.xpath("//*[@id=\"catalogPopupButton\"]");
    private By computers = By.xpath("//*[@id='catalogPopup']");

    public void open() {
        driver.get("http://market.yandex.ru");
        driver.manage().timeouts().getPageLoadTimeout();
    }

     public void openCatalogue() {

        driver.findElement(catalogueButton).click();
        driver.manage().timeouts().getPageLoadTimeout();
     }

     public void openComputers() {

        driver.findElement(computers).click();
         driver.manage().timeouts().getPageLoadTimeout();
     }

    boolean atPage() {
        return driver.getTitle().equals("Интернет-магазин Яндекс.Маркет — покупки с быстрой доставкой");
    }
}