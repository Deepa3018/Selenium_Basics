package Seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
           public static void main(String[] args) {
            System.setProperty("webdriver.chromedriver", "C:\\Users\\Deepa Deva\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://leafground.com/link.xhtml");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("How many links in this layout?")).click();
               String url=driver.getCurrentUrl();
               System.out.println(url);
               String title=driver.getTitle();
               System.out.println(title);
        }
    }
