package Seleniumfirst;
//To open an ebay page and type Tshirts in search button and click on search button
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver", "C:\\Users\\Deepa Deva\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //Absolute xpath
//        driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("Tshirts");
//        driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
//driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[3]/a")).click();
  driver.findElement(By.xpath("//*[@id=\'gh-p-2\']/a")).click();
    }
}