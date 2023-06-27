package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    //Browser setup

    @Before
    public void setUp() {

        //Open browser
        openBrowser(baseUrl);
    }

    @Test
    //userShouldNavigateToComputerPageSuccessfully

    public void userShouldNavigateToComputerPageSuccessfully() {
        //Click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//a[text() = 'Computers ']")).getText();

        //Verify the text ‘Computers’
        Assert.assertEquals("It as not expected ", expectedText, actualText);
    }

    @Test

    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Click on the 'Electronics'
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        //driver.findElement(By.xpath("//a[text()='Electronics']")).click();

        //Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//a[text() = 'Electronics ']")).getText();


        Assert.assertEquals("It is not expected", actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Click on the ‘Apparel’ Tab

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).click();

        //Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//a[text() = 'Apparel ']")).getText();

        Assert.assertEquals("It is not as expected", actualText, expectedText);
    }

        @Test

    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //Click on the ‘DigitalDownloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();

        //Verify the text ‘DigitalDownloads’
            String expectedText = "Digital downloads";
            String actualText = driver.findElement(By.xpath("//a[text() = 'Digital downloads ']")).getText();

            Assert.assertEquals("It is not as expected", actualText, expectedText);

        }
        @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Click on the ‘BooksPage’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//a[text()='Books ']")).getText();

        Assert.assertEquals("It is not as expected", actualText, expectedText);
    }
        @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();

        //Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();

        Assert.assertEquals("It is not as expected", actualText, expectedText);
    }

       @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();

        //Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();

        Assert.assertEquals("It is not as expected", actualText, expectedText);
    }

    @After
    public void tearDown(){
    closeBrowser();
    }
}

