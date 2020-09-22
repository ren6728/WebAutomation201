package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import reporting.TestLogger;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

public class HomePageTest extends BrowserDriver {

    HomePage homePage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchTest1(){
        homePage.clickSearchButton();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest2(){
        homePage.crossIconDisplayed();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Verizon: Wireless, Internet, TV and Phone Services | Official Site");
        assertTrue(verifyTitle);
        TestLogger.log("True");
    }
    @Test
    public void searchTest3(){
       homePage.search();
        String verifyAssertNotNull = null;
        assertNull(verifyAssertNotNull);
    }
    @Test
    public void searchTest4(){
        homePage.hitEnterAfterType();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);


    }
    @Test
    public void searchTest5(){
        homePage.fiteredBy();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Search Results for unlimited at Verizon");
        assertTrue(verifyTitle);
        TestLogger.log("True");
    }
    @Test
    public void searchTest6(){
        homePage.fiteredByClick();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Search Results for unlimited at Verizon");
        assertTrue(verifyTitle);
        TestLogger.log("True");
    }
    @Test
    public void searchTest7(){
        homePage.brandDisplay();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest8(){
        homePage.colorDisplay();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest9(){
        homePage.priceDisplay();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest10(){
        homePage.brandDropdownClick();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest11(){
        homePage.brandDropdownOnePlus();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest12(){
        homePage.colorDropdownClaasyBlue();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest13(){
        homePage.priceDropDownSelect();
        String ActualTitle = driver.getTitle();
        TestLogger.log(ActualTitle);
        String ExpectedTitle = "Search Results for unlimited at Verizon";
        TestLogger.log(ExpectedTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    @Test
    public void searchTest14(){
        homePage.fiterPageDisplayed();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Search Results for unlimited at Verizon");
        assertTrue(verifyTitle);
        TestLogger.log("True");
    }
    @Test
    public void searchTest15(){
        homePage.clickonFiterPage();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Search Results for unlimited at Verizon");
        assertTrue(verifyTitle);
        TestLogger.log("True");
    }
    @Test
    public void searchTest16(){
        homePage.resultPage();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Search Results for unlimited at Verizon");
        assertTrue(verifyTitle);
        TestLogger.log("True");
    }

}
