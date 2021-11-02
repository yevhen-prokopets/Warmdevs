
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest {
    @Test
    public void firstTest(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.warmdevs.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Start a project")).click();
        driver.findElement(By.xpath("//*[@id=\"email-form\"]/div[2]/div[2]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"NAME-2\"]")).sendKeys("Sans");
        driver.findElement(By.xpath("//*[@id=\"PHONE\"]")).sendKeys("380990117237");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("eugene@warmdevs.com");
        driver.findElement(By.xpath("//*[@id=\"COMPANY-2\"]")).sendKeys("Starship");
        driver.findElement(By.xpath("//*[@id=\"PROJECT\"]")).sendKeys("Brand new ship");
        driver.findElement(By.xpath("//*[@id=\"email-form\"]/input")).click();

    }
}
