package Seleniumfirst;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.SortedSet;

public class WebBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepa Deva\\Chrome new\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fgcu.edu/");

    }
}
