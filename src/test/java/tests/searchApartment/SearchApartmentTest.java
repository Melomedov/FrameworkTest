package tests.searchApartment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.REAL_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkToRedirectToListing(){
        basePage.open(REAL_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realListingPage.checkCountCards();
    }
/*
вывод в консоль телефона поиска трехкомнатной квартиры
 */
    @Test
    public void takePhoneFirstResultThreeRooms(){
        basePage.open(REAL_HOME_PAGE);
        realtHomePage
                .enterCountThreeRoom()
                .clickToFind();

        WebElement element = driver.findElement(By.xpath(".//span[contains(text(),'+375 29 165-04-...')]"));
        String text = element.getAttribute("innerText");
        System.out.println(text);



    }


}
