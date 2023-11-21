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

    /*
     * 1. userShouldNavigateToComputerPageSuccessfully
     * * click on the ‘Computers’ Tab
     * * Verify the text ‘Computers’
     */
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Computers Page","Computers", driver.findElement(By.className("page-title")).getText());


    }

    /* 2. userShouldNavigateToElectronicsPageSuccessfully
     * * click on the ‘Electronics’ Tab
     * * Verify the text ‘Electronics’
     */
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Electronics Page","Electronics", driver.findElement(By.className("page-title")).getText());
    }

    /*
     * 3. userShouldNavigateToApparelPageSuccessfully
     * * click on the ‘Apparel’ Tab
     * * Verify the text ‘Apparel’
     */
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Apparel Page","Apparel", driver.findElement(By.className("page-title")).getText());
    }
    /*
     *4. userShouldNavigateToDigitalDownloadsPageSuccessfully
     * * click on the ‘Digital downloads’ Tab
     * * Verify the text ‘Digital downloads’
     */

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Digital downloads Page","Digital downloads", driver.findElement(By.className("page-title")).getText());
    }

    /*
     * 5. userShouldNavigateToBooksPageSuccessfully
     * * click on the ‘Books’ Tab
     * * Verify the text ‘Books’
     */
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Books Page","Books", driver.findElement(By.className("page-title")).getText());
    }

    /*
     * 6. userShouldNavigateToJewelryPageSuccessfully
     * * click on the ‘Jewelry’ Tab
     * * Verify the text ‘Jewelry’
     */
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Jewelry Page","Jewelry", driver.findElement(By.className("page-title")).getText());
    }

    /*
     * 7. userShouldNavigateToGiftCardsPageSuccessfully
     * * click on the ‘Gift Cards’ Tab
     * * Verify the text ‘Gift Cards’
     */
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        Assert.assertEquals("User Should Successfully Navigate to Gift Cards Page","Gift Cards", driver.findElement(By.className("page-title")).getText());

    }
    @After
    public void close() {
        closeBrowser();
    }
}
