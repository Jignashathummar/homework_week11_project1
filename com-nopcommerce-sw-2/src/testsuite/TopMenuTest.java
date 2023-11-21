package testsuite;
/**
 *  * 4. Write down the following test into ‘TopMenuTest’
 *  * class
 *  * 1. userShouldNavigateToComputerPageSuccessfully
 *  * * click on the ‘Computers’ Tab
 *  * * Verify the text ‘Computers’
 *  * 2. userShouldNavigateToElectronicsPageSuccessfully
 *  * * click on the ‘Electronics’ Tab
 *  * * Verify the text ‘Electronics’
 *  * 3. userShouldNavigateToApparelPageSuccessfully
 *  * * click on the ‘Apparel’ Tab
 *  * * Verify the text ‘Apparel’ 4.
 *  * userShouldNavigateToDigitalDownloadsPageSuccessfully
 *  * * click on the ‘Digital downloads’ Tab
 *  * * Verify the text ‘Digital downloads’
 *  * 5. userShouldNavigateToBooksPageSuccessfully
 *  * * click on the ‘Books’ Tab
 *  * * Verify the text ‘Books’
 *  * 6. userShouldNavigateToJewelryPageSuccessfully
 *  * * click on the ‘Jewelry’ Tab
 *  * * Verify the text ‘Jewelry’
 *  * 7. userShouldNavigateToGiftCardsPageSuccessfully
 *  * * click on the ‘Gift Cards’ Tab
 *  * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        /*
         * 1. userShouldNavigateToComputerPageSuccessfully
         * * click on the ‘Computers’ Tab
         * * Verify the text ‘Computers’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        Assert.assertEquals("Computers", "Computers");
        /*
         * 2. userShouldNavigateToElectronicsPageSuccessfully
         * * click on the ‘Electronics’ Tab
         * * Verify the text ‘Electronics’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        Assert.assertEquals("Electronics", "Electronics");
        /*
         * 3. userShouldNavigateToApparelPageSuccessfully
         * * click on the ‘Apparel’ Tab
         * * Verify the text ‘Apparel’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        Assert.assertEquals("Apparel", "Apparel");
        /*
         *4. userShouldNavigateToDigitalDownloadsPageSuccessfully
         * * click on the ‘Digital downloads’ Tab
         * * Verify the text ‘Digital downloads’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        Assert.assertEquals("Digital downloads", "Digital downloads");
        /*
         * 5. userShouldNavigateToBooksPageSuccessfully
         * * click on the ‘Books’ Tab
         * * Verify the text ‘Books’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        Assert.assertEquals("Books", "Books");
        /*
         * 6. userShouldNavigateToJewelryPageSuccessfully
         * * click on the ‘Jewelry’ Tab
         * * Verify the text ‘Jewelry’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        Assert.assertEquals("Jewelry", "Jewelry");
        /*
         * 7. userShouldNavigateToGiftCardsPageSuccessfully
         * * click on the ‘Gift Cards’ Tab
         * * Verify the text ‘Gift Cards’
         */
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        Assert.assertEquals("Gift Cards", "Gift Cards");

    }

    @After
    public void close() {
        closeBrowser();
    }
}
