package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */
public class LoginTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        driver.findElement(By.linkText("Log in")).click();
        Assert.assertEquals("User Navigate to Login Page", "Welcome, Please Sign In!", "Welcome, Please Sign In!");

        driver.findElement(By.id("Email")).sendKeys("julee1234@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("julee@123");
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();
        Assert.assertEquals("User logged in successfully", "Log out", "Log out");
        driver.findElement(By.xpath("//a[text()='Log out']")).click();

        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("prime123");
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }

    @After
    public void close() {
        closeBrowser();
    }
}
