package Seleniumfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlandtitle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver", "C:\\Users\\Deepa Deva\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String givenurl="https://www.google.co.in/";
        String title=driver.getTitle();
        System.out.println(title);
        if(url.equals(givenurl))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }

}