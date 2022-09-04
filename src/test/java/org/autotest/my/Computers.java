package org.autotest.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Computers {
    private WebDriver driver;

    public Computers(WebDriver driver) {
        this.driver=driver;
    }

    private By notebooks = By.xpath(".//*[text()='Ноутбуки']/..");

    public void chooseNotebooks() {
        driver.findElement(notebooks).click();
    }
}
