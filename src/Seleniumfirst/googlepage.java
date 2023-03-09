package Seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlepage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Deepa Deva\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:\\google.co.in");
        WebElement textbox=driver.findElement(By.name("q"));
        textbox.sendKeys("Florida International University");

            }
}
