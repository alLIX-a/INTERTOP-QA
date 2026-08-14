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

import static org.junit.jupiter.api.Assertions.*;

public class SearchFieldTest {
    WebDriver driver;
    WebDriverWait wait;

    String homePageUrl;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePageUrl = "https://intertop.kz/ru-kz/";
    }

    @Test
    void searchForAnExistingItem() {
        driver.get(homePageUrl);

        WebElement searchButton = wait.
                until(ExpectedConditions.elementToBeClickable(By.className("in-navbar__search-btn")));
        searchButton.click();

        WebElement searchField = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[placeholder='Поиск модных находок']")));
        searchField.sendKeys("Vans");

        searchField.sendKeys(Keys.ENTER);
    }
}
