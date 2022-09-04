package org.autotest.my;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class MainTest {
    private WebDriver driver = new SafariDriver();
    private HomePage homePage = new HomePage(driver);
    private Computers computers = new Computers(driver);
    private NoteBooks noteBooks = new NoteBooks(driver);
    private SearchResultCheck searchResultCheck = new SearchResultCheck(driver);
    @Test
    public void NoteTest() {
            driver.manage().window().fullscreen();
            homePage.open();
            // Waiting for CAPCHA
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            assertTrue(homePage.atPage());
            homePage.openCatalogue();
            homePage.openComputers();
            computers.chooseNotebooks();
            noteBooks.chooseLenovo();
            noteBooks.setPriceFrom("25000");
            noteBooks.setPriceTo("3000");
            driver.manage().timeouts().getPageLoadTimeout();
            // Main test
            searchResultCheck.Check(driver, "Lenovo");
            driver.close();
    }
}

