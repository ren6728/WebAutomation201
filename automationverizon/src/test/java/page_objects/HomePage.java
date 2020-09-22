package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {

    WebDriver driver = null;
    @FindBy(how = How.CSS,using = "#gnav20-search-icon > svg")
    WebElement searchBox01;

    @FindBy(how = How.CSS,using = "#vz-gh20 > div > div.gnav20-sticky-content > div.gnav20-apicomponentnolayout > div.gnav20-width-wrapper > div.gnav20-main > div > div:nth-child(2) > div > div.gnav20-desktop > div.gnav20-utility > div.gnav20-row-two > div.gnav20-search-utility > div > div > div.gnav20-search-container > div.gnav20-search-content-wrapper > p > input")
    WebElement searchItem01;

    @FindBy(how = How.CLASS_NAME,using = "gnav20-close-icon")
    WebElement crossIcon;

    @FindBy(how = How.CSS,using = "#content > div > div.styled__HeaderDiv-ctMgNn.fvVCKn > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(1) > button")
   WebElement filterBy;

    @FindBy(how = How.CSS,using = "#content-filters > ul > li:nth-child(1) > button")
    WebElement brand;

    @FindBy(how = How.CSS,using = "#content-filters > ul > li:nth-child(2) > button")
    WebElement color;

    @FindBy(how = How.CSS,using = "#content-filters > ul > li:nth-child(3) > button")
    WebElement price;

    @FindBy(how = How.CSS,using = "#product\\.manufacturer\\.name_s > li:nth-child(5) > span > label")
    WebElement brandDropDownSelect;

    @FindBy(how = How.CSS,using = "#sku\\.color_s > li:nth-child(15) > span > label")
    WebElement colorDropDownSelect;

    @FindBy(how = How.CSS,using ="#recordDisplayPrice_fs > li:nth-child(2) > span > label" )
    WebElement priceDropDownSelect;

@FindBy(how = How.CSS,using = "#content-filters > div > button.noWrap.font_14.NHaasDS75Bd.Button__Button-jkHDFw.kXYVld")
  WebElement filterPage;

    @FindBy(how = How.CSS,using = "#content > div > div.styled__HeaderDiv-ctMgNn.fvVCKn > div:nth-child(3) > div")
WebElement result;

    public void clickSearchButton(){
       searchBox01.click();
       TestLogger.log("Clicked search Icon");
    }

    /*public void getCurrentUrl(){
        searchBox01.click();
        String currentUrl = driver.getCurrentUrl();
        TestLogger.log("Page Title: " + currentUrl);

    }*/

    public void search(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited");
        TestLogger.log("Typed unlimited");
    }
    public void crossIconDisplayed(){
        searchBox01.click();
        crossIcon.isDisplayed();
        TestLogger.log("Cross Icon displayed");
    }
    public void hitEnterAfterType(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        TestLogger.log("unlimited msg submited");
    }
    public void fiteredBy(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.isDisplayed();
        TestLogger.log("Filter by displayed");
    }
    public void fiteredByClick(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        TestLogger.log("Filter by clicked");
    }
    public void brandDisplay(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.isDisplayed();
        TestLogger.log("Brand displayed");
    }
    public void colorDisplay(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        color.isDisplayed();
        TestLogger.log("Color displayed");
    }
    public void priceDisplay(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        color.isDisplayed();
        TestLogger.log("Price displayed");
    }
    public void brandDropdownClick(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        TestLogger.log("Brand dropdown listed");
    }
    public void brandDropdownOnePlus(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        brandDropDownSelect.click();
        TestLogger.log("One plus selected");
    }
    public void colorDropdownClaasyBlue(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        brandDropDownSelect.click();
        color.click();
        colorDropDownSelect.click();
        TestLogger.log("One plus selected and Blue selected");
    }
    public void priceDropDownSelect(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        brandDropDownSelect.click();
        color.click();
        colorDropDownSelect.click();
        price.click();
        priceDropDownSelect.click();
        TestLogger.log("One plus selected ,Blue selected and $50-$100 picked ");
    }
    public void fiterPageDisplayed(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        brandDropDownSelect.click();
        color.click();
        colorDropDownSelect.click();
        price.click();
        priceDropDownSelect.click();
        filterPage.isDisplayed();
        TestLogger.log("filter Page displayed");
    }
    public void clickonFiterPage(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        brandDropDownSelect.click();
        color.click();
        colorDropDownSelect.click();
        price.click();
        priceDropDownSelect.click();
        filterPage.click();
        TestLogger.log("filter Page clicked");
    }
    public void resultPage(){
        searchBox01.click();
        searchItem01.sendKeys("unlimited"+ "\n");
        filterBy.click();
        brand.click();
        brandDropDownSelect.click();
        color.click();
        colorDropDownSelect.click();
        price.click();
        priceDropDownSelect.click();
        filterPage.click();
        TestLogger.log("0 results found");
    }
}
