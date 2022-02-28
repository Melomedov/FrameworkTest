package tests.searchApartment;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.REAL_HOME_PAGE;

public class SearchFirstPfoneAdsThreeApartment extends BaseTest {

    /*
вывод в консоль телефона поиска трехкомнатной квартиры
 */
    @Test
    @Description("Вывод телефона первого объявления поиска трехкомнатной квартиры")

    public void takePhoneFirstResultThreeRooms(){
        step1();
        step2();
        step3();
        step4();

    }
    @Step ("Открытие страницы "+REAL_HOME_PAGE)
    public void step1(){
        basePage.open(REAL_HOME_PAGE);
    }
    @Step ("Выбрать трехкомнатную квартиру")
    public void step2(){
        realtHomePage.enterCountThreeRoom();
    }
    @Step ("Нажать кнопку Найти")
    public void step3(){
        realtHomePage.clickToFind();
    }
    @Step ("Вывод номера телефона первого отделения в лог")
    public void step4(){
        WebElement element = driver.findElement(By.xpath("//body/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]/div[2]/a[1]/span[1]"));
        String text = element.getAttribute("innerText");
        System.out.println(text);
    }
    

}
