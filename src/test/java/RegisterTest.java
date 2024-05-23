import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

    @Test
    public void register(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("etech");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mentoria");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("teste endereço");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("etechmentoria@example.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("4002892240");

        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("msdd")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 250);");
        driver.findElement(By.xpath("//a[@class='ui-corner-all' and text()='Portuguese']")).click();

        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByValue("Java");

        Select countries = new Select(driver.findElement(By.id("countries")));
        countries.selectByIndex(0);

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByIndex(10);

        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("2000");

        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByValue("October");

        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText("27");

        driver.findElement(By.id("firstpassword")).sendKeys("12345678910");
        driver.findElement(By.id("secondpassword")).sendKeys("12345678910");

        WebElement upload = driver.findElement(By.id("imagesrc"));
        upload.sendKeys("C:\\Users\\lucas\\OneDrive\\Imagens\\cleita\\WhatsApp Image 2024-03-10 at 19.28.21.jpeg");

        driver.quit();
    }
}
