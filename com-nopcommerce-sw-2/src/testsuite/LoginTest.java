package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        WebElement getLoingClickVerification = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        Assert.assertEquals("User Navigate to Login Page", "Welcome, Please Sign In!", getLoingClickVerification.getText());
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.linkText("Log in")).click();
        WebElement getLoingClickVerification = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        Assert.assertEquals("User Navigate to Login Page", "Welcome, Please Sign In!", getLoingClickVerification.getText());

        driver.findElement(By.id("Email")).sendKeys("james36@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("James123");
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();
        WebElement getLogoutText = driver.findElement(By.xpath("//a[text()='Log out']"));
        Assert.assertEquals("User logged in successfully", "Log out", getLogoutText.getText());
    }

    @Test
    public void verifyTheUnsucLoginErrorMessage(){
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("prime123");
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();
        WebElement getUnsuccessfulLoginErrMsg = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        System.out.println(getUnsuccessfulLoginErrMsg.getText());
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", getUnsuccessfulLoginErrMsg.getText());

    }

    @After
    public void close() {
        closeBrowser();
    }
}
