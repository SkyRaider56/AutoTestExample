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

    List<WebElement> searchResults = driver.findElements(By.tagName("Lenovo"));

     //boolean check;

    public void Check(boolean check) {
        for (int i = 0; i < 8; i++) {
            if (searchResults.get(i).getTagName().equals("Lenovo"))
                check = true;
            else
                check = false;
        }
    }
}


