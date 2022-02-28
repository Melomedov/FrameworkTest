package tests.searchApartment;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.Urls.REAL_HOME_PAGE;



public class SearchApartmentTest extends BaseTest {

    /*
    Проверка колличества обьявлений на странице
     */


    @Test
    @Description("Проверка колличества обьявлений на странице")
    public void checkToRedirectToListing(){
        step1();
        step2();
        step3();
        step4();
    }

    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);

    }

    @Step ("Открытие браузера " + PLATFORM_AND_BROWSER)
    public void step1(){
        basePage.open(REAL_HOME_PAGE);
        screenshot();
    }
    @Step ("Выбор колличества комнат")
    public void step2(){
        realtHomePage.enterCountRooms();
        screenshot();
    }
    @Step ("Нажать на кнопку Найти")
    public void step3(){
        realtHomePage.clickToFind();
        screenshot();
    }
    @Step ("Проверка колличества объявлений")
    public void step4(){
        realListingPage.checkCountCards();
        screenshot();
    }



}
