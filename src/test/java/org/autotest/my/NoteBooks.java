package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoteBooks {
    private WebDriver driver;
    public NoteBooks(WebDriver driver) {
        this.driver=driver;
    }

    private By showAllManufacturers = By.xpath(".//*[text()='Показать всё']/..");
    private By Lenovo = By.xpath(".//*[text()='Lenovo']/..");
    private By priceFrom = By.xpath("//input[@id='textfield4897909888']");
    private By priceTo = By.xpath("//input[@id='textfield4499784019']");


    public void chooseLenovo() {
        driver.findElement(showAllManufacturers).click();
        driver.findElement(Lenovo).click();
    }

    public void setPriceFrom(String setFrom) {
        driver.findElement(priceTo).sendKeys(setFrom);
    }
    public void setPriceTo(String setTo) {
        driver.findElement(priceTo).sendKeys(setTo);
    }
    // Пока хз как это сделать
    public boolean checkTheChoise(String models, String prices) {
        return true;
    }

}
