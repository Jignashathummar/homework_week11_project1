package testsuite;
/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterTest extends BaseTest {
    Random random = new Random();
    int x = random.nextInt(900);
    String fName = "James";
    String lName = "Bond";
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldNavigateToRegisterPageSuccessful
     * ly
     * * click on the ‘Register’ link
     * * Verify the text ‘Register’
     */
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        System.out.println("Navigate to Registration successfully.");
        Assert.assertEquals("Register", "Register");

        /**
         * 2. userSholdRegisterAccountSuccessfully *
         * click on the ‘Register’ link
         * * Select gender radio button
         * * Enter First name
         * * Enter Last name
         * * Select Day Month and Year
         * * Enter Email address
         * * Enter Password
         * * Enter Confirm password
         * * Click on REGISTER button
         * * Verify the text 'Your registration
         * completed’
         */
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys(fName + x);
        driver.findElement(By.id("LastName")).sendKeys(lName + x);
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1992");
        driver.findElement(By.id("Email")).sendKeys("james" + x + "@gmail.com");
        System.out.println(x);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("James123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("James123");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        Assert.assertEquals("Your registration completed", "Your registration completed");
    }

    @After
    public void close() {
        closeBrowser();
    }
}
