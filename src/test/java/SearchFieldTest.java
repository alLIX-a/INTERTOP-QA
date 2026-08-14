import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchFieldTest {
    WebDriver driver;
    WebDriverWait wait;

    String homePageUrl;

    By searchButton;
    By searchField;

    String brandName;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePageUrl = "https://intertop.kz/ru-kz/";
        searchButton = By.className("in-navbar__search-btn");
        searchField = By.cssSelector("[placeholder='Поиск модных находок']");

        brandName = "Vans";
    }

    @Test
    void searchForAnExistingItem() {
        driver.get(homePageUrl);

        WebElement searchButtonEl = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButtonEl.click();

        WebElement searchFieldEl = wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchFieldEl.sendKeys(brandName);

        searchFieldEl.sendKeys(Keys.ENTER);
    }
}
