package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    private final By countRooms = By.id("rooms");
    private final By optionToRooms = By.xpath("//option[contains(text(),'2к квартира')]");
    private final By getOptionToThreeRooms = By.xpath("//option[contains(text(),'3к квартира')]");
    private final By findBnt = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms (){
        driver.findElement(countRooms).click();
        driver.findElement(optionToRooms).click();

        return this;
    }

    public RealtHomePage enterCountThreeRoom(){
        driver.findElement(countRooms).click();
        driver.findElement(getOptionToThreeRooms).click();

        return this;
    }

    public RealtHomePage clickToFind(){
        WebElement btnFind = driver.findElement(findBnt);
        waitElementIsVisible(btnFind).click();
        return this;
    }
}
