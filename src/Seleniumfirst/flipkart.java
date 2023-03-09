package Seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Deepa Deva\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:\\flipkart.com");
        driver.findElement(By.name("q")).sendKeys("Mobile Phones");
    }
}
