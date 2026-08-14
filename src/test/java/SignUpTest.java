import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.Duration;

public class SignUpTest {
    WebDriver driver;
    WebDriverWait wait;

    String homePageUrl;

    By profileIcon;
    By createAccountButton;
    By emailOrPhoneField;
    By passwordField;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePageUrl = "https://intertop.kz/ru-kz/";

        profileIcon = By.cssSelector("[aria-label='Личный кабинет']");
        createAccountButton = By.cssSelector("[aria-selected='false']");
        emailOrPhoneField = By.cssSelector("[name='email_or_phone']");
        passwordField = By.cssSelector("[name='password']");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void signUpWithValidCredentials() {
        driver.get(homePageUrl);

        WebElement profileIconEl = wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        profileIconEl.click();

        WebElement createAccountButtonEl = wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
        createAccountButtonEl.click();

        WebElement emailOrPhoneFieldEl = wait.until(ExpectedConditions.elementToBeClickable(emailOrPhoneField));
        emailOrPhoneFieldEl.sendKeys("someEmail@gmail.com");

        WebElement passwordFieldEl = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordFieldEl.sendKeys("Test123!");
    }

    @Test
    void signUpWithExistingEmail() {
        driver.get(homePageUrl);

        WebElement profileIconEl = wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        profileIconEl.click();

        WebElement createAccountButtonEl = wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
        createAccountButtonEl.click();

        WebElement emailOrPhoneFieldEl = wait.until(ExpectedConditions.elementToBeClickable(emailOrPhoneField));
        emailOrPhoneFieldEl.sendKeys("someEmail@gmail.com");

        WebElement passwordFieldEl = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordFieldEl.sendKeys("Test123!");
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "testemail@domain.",
            "testemail@domain",
            "testemail@.com",
            "testemaildomain.com",
            "testemail"
    })
    void signUpWithEmailInInvalidFormats(String invalidEmail) {
        driver.get(homePageUrl);

        WebElement profileIconEl = wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        profileIconEl.click();

        WebElement createAccountButtonEl = wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
        createAccountButtonEl.click();

        WebElement emailOrPhoneFieldEl = wait.until(ExpectedConditions.elementToBeClickable(emailOrPhoneField));
        emailOrPhoneFieldEl.sendKeys("someEmail@gmail.com");

        WebElement passwordFieldEl = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordFieldEl.sendKeys("Test123!");
    }
}
