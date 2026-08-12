import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpTest {
    WebDriver driver;
    WebDriverWait wait;

    String homePageUrl;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePageUrl = "https://intertop.kz/ru-kz/";
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void signUpWithValidCredentials() {
        driver.get(homePageUrl);

        WebElement profileIcon = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Личный кабинет']")));
        profileIcon.click();

        WebElement createAccountButton = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-selected='false']")));
        createAccountButton.click();

        WebElement emailOrPhoneField = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='email_or_phone']")));
        emailOrPhoneField.sendKeys("someEmail@gmail.com");

        WebElement passwordField = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='password']")));
        passwordField.sendKeys("Test123!");
    }

    @Test
    void signUpWithExistingEmail() {
        driver.get(homePageUrl);

        WebElement profileIcon = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Личный кабинет']")));
        profileIcon.click();

        WebElement createAccountButton = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-selected='false']")));
        createAccountButton.click();

        WebElement emailOrPhoneField = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='email_or_phone']")));
        emailOrPhoneField.sendKeys("gamedi6814@gcervera.com");

        WebElement passwordField = wait.
                until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='password']")));
        passwordField.sendKeys("Test123!");
    }
}
