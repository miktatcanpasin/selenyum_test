import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      driver.get("https://socradar.io/labs/");
      driver.manage().window().maximize();


        WebElement elementsButton = driver.findElement(By.xpath("//img[@src='/labs/static/img/icon/service/deepweb_sonar_white.svg']"));
        elementsButton.click();

        WebElement domain= driver.findElement(By.xpath("//input[@id='domainInput']"));

        domain.click();
        domain.sendKeys("akbank.com");
        domain.click();
        WebElement tıkla=driver.findElement(By.xpath("//img[@src='/labs/static/img/icon/search.svg']"));
         tıkla.click();
         driver.get("https://socradar.io/labs/dark-web-report/results/216d4eb585864060aa76e00b2b51d59e");
         WebElement ikincisayfa=driver.findElement(By.xpath("//p[normalize-space()='HIGH']"));
         ikincisayfa.click();
         driver.get("https://socradar.io/labs/dark-web-report/results/216d4eb585864060aa76e00b2b51d59e");
         WebElement three =driver.findElement(By.xpath("//div[contains(@class,'request-button')]"));
         three.click();

        //// driver.get("https://socradar.io/free-edition/dark-web-report/?utm_campaign=SOCRadar%20Labs&utm_source=LABS&utm_medium=DeepWebReport&utm_term=CTA");
        //WebElement tree= driver.findElement(By.xpath("//input[@id='email-4f847b8b-4274-4709-adfa-762ad43857b8']"));
       /// three.click();
      //  three.sendKeys("akbank.com");


    }
}