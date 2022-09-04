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

    boolean CheckManufacturer(WebDriver driver, String checkName) {
        List<WebElement> searchResults = driver.findElements(By.tagName(checkName));
        boolean temp = false;
        for (int i = 0; i < searchResults.size(); i++) {
            if (searchResults.size()>0&&searchResults.get(i).equals(checkName)) {
                temp = true;
            }
        }
        return temp;
    }

    boolean CheckPrice(String from,String to) {
        return Integer.parseInt(from)>=25000 && Integer.parseInt(to)<=30000;
    }
}


