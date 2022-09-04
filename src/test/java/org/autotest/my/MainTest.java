package org.autotest.my;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

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
            assertTrue(homePage.atPage());
            homePage.openCatalogue();
            homePage.openComputers();
            computers.chooseNotebooks();
            noteBooks.chooseLenovo();
            noteBooks.setPriceFrom("25000");
            noteBooks.setPriceTo("3000");
            driver.manage().timeouts().getPageLoadTimeout();
            // Main test
            assertTrue(searchResultCheck.CheckManufacturer(driver, "Lenovo"));
            assertTrue(searchResultCheck.CheckPrice("25000","30000"));
            driver.close();
    }
}

