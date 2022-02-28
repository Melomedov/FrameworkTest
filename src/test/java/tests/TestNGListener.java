//package test.java.cases;
//
//import common.CommonAction;
//import io.qameta.allure.Attachment;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//import tests.base.BaseTest;
//
//public class TestngListener extends TestListenerAdapter  {
//
//    public void onTestFailure(ITestResult tr) {
//        super.onTestFailure(tr);
//         bt = (CommonAction) tr.getInstance();
//        WebDriver driver = bt.createDriver();
//        takePhoto(driver);
//        logCaseStep(tr);
//        exceptedResult(tr);
//    }
//
//
//    @Attachment (value = "Неудачные снимки экрана:", type = "image / png")
//    public byte[]  takePhoto(WebDriver driver){
//        byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//        return screenshotAs;
//    }
//
//    /**
//     * Шаги теста печати
//     * @param tr
//     */
//    @Attachment (value = "Действия следующие:")
//    public String logCaseStep(ITestResult tr){
//        String step = "1, откройте браузер 2, введите адрес Baidu";
//        return step;
//    }
//
//    /**
//     * Шаги теста печати
//     * @param tr
//     */
//    @Attachment (value = "Ожидаемый результат:")
//    public String exceptedResult(ITestResult tr){
//        String result = "Показать результат запроса";
//        return result;
//    }
//}