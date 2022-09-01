package org.example;

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
    @Test
    public void NoteTest() {
            //  1. Запуск развёрнутого на весь экран браузера.
            driver.manage().window().fullscreen();
            //  2. Переход на сайт https://market.yandex.ru/
            homePage.open();
            //  2.1 Ожидание для ввода капчи
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //  3. Перейти к разделу "Компьютеры" и выбрать "Ноутбуки".
            homePage.openCatalogue();
            homePage.openComputers();
            computers.chooseNotebooks();
            //  4. Задать параметры поиска:
            //  - Производитель: Lenovo (с возможностью замены в будущем)
            //          - Цена: от 25000 руб. до 30000 руб.
            noteBooks.chooseLenovo();
            noteBooks.setPriceFrom("25000");
            noteBooks.setPriceTo("3000");
            //  5. Нажать кнопку Показать.
            driver.manage().timeouts().getPageLoadTimeout();
            //  6. На первой странице с результатами убедиться, что найденные товары соответствуют заданным параметрам поиска.
            assertTrue(homePage.atPage());
            //  7. Закрыть браузер.
            driver.close();
    }
}

