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

    public void Check(WebDriver driver, String checkName) {
        List<WebElement> searchResults = driver.findElements(By.tagName(checkName));
        for(int i =0; i<10;i++) {
            searchResults.get(i).equals(checkName);
        }
    }
}


