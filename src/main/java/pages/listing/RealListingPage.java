package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.CounterPerPage.COUNT_ADS_PER_PAGES_RELTO;

public class RealListingPage extends BasePage {

    public RealListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='teaser-tile teaser-tile-left']");

    public RealListingPage checkCountCards (){
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(COUNT_ADS_PER_PAGES_RELTO,countCard);
        return this;
    }

}
