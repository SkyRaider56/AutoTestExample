package org.autotest.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultCheck {
    private WebDriver driver;

    public SearchResultCheck(WebDriver driver) {
        this.driver = driver;
    }

    // Проверка фильтрации по производителю
    boolean CheckManufacturer(WebDriver driver, String checkName) {
        List<WebElement> searchResults = driver.findElements(By.tagName(checkName));
        boolean temp = false;
        for (WebElement searchResult : searchResults) {
            if (searchResult.getText().equals(checkName)) {
                temp = true;
            }
        }
        return temp;
    }
    // Проверка фильтрации по цене
    boolean CheckPrice(String from,String to) {
        List<WebElement> searchResultsPrice = driver.findElements(By.xpath("//span[@data-autotest-value='25','26','27','28','29']"));
        int intPriceFrom = Integer.parseInt(from);
        int intPriceTo = Integer.parseInt(to);
        boolean temp = false;
        for (WebElement webElement : searchResultsPrice) {
            if (Integer.parseInt(webElement.getText()) > intPriceFrom
                    &&
                    Integer.parseInt(webElement.getText()) < intPriceTo)
                temp = true;
        }
        return temp;
    }
}


