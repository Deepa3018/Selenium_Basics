package Seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafgrounddemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Deepa Deva\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/input.xhtml");
        driver.manage().window().maximize();
        driver.findElement(By.id("j_idt88:name")).sendKeys("Deepa Devasenapthy");

        driver.findElement(By.id("j_idt88:j_idt95")).clear();





    }
}
