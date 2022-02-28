package listener;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.base.BaseTest;


public abstract class ListenerTest implements ITestListener {

        private static String getTestMethodeName(ITestResult iTestResult){
            return iTestResult.getMethod().getConstructorOrMethod().getName();
        }




        //Screenshot attachment for Allure
        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshotPNG (WebDriver driver) {
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        }

        //Text attachment for Allure
        @Attachment(value = "{0}", type = "text/plain")
        public static String saveTextLog (String message){
            return message;
        }


}