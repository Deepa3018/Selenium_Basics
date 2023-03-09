package Seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements {
    public static void main(String[] args){
        System.setProperty("webdriver.chromedriver","C:\\Users\\Deepa Deva\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/dashboard.xhtml");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\'menuform:j_idt40\']/a")).click();
        driver.findElement(By.xpath("//*[@id=\'menuform:m_input\']/a")).click();
        driver.findElement(By.id("j_idt88:name")).sendKeys("Deepa Devasenapathy");



//        driver.findElement(By.id("j_idt88:name")).sendKeys("Deepa Devasenapathy");
//        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("hello");
//        driver.findElement(By.id("j_idt88:j_idt95")).clear();
//       String value= driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
//       System.out.println(value);

    }
}
