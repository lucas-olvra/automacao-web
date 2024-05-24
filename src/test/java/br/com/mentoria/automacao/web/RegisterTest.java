package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.web.commons.Dsl;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RegisterTest extends Dsl {

    Faker faker = new Faker();
    @Test
    public void register() {

        String name = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().fullAddress();

        super.accessSite("https://demo.automationtesting.in/Register.html");
        super.writeByXpath("//input[@placeholder='First Name']", name);
        super.writeByXpath("//input[@placeholder='Last Name']", lastName);
        super.writeByXpath("//textarea[@ng-model='Adress']", address);
        super.writeByXpath("//input[@type='email']", "etechmentoria@example.com");
        super.writeByXpath("//input[@type='tel']", "4002892240");

        super.clickByXpath("//input[@value='Male']");
        super.clickById("checkbox2");
        super.clickById("msdd");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 300);");

        driver.findElement(By.xpath("//a[@class='ui-corner-all' and text()='Portuguese']")).click();


        super.selectyByValueId("Skills", "Java");

        super.selectyByIndex("countries", 0);

        super.selectyByIndex("country", 10);

        super.selectyByVisibleText("yearbox", "2000");

        super.selectyByValue("//select[@placeholder='Month']", "October");

        super.selectyByVisibleTextInt("daybox", 27);

        super.writeById("firstpassword", "12345678910");
        super.writeById("secondpassword", "12345678910");

        super.uploadImage("imagesrc", "C:\\Users\\lucas\\OneDrive\\Imagens\\cleita\\WhatsApp Image 2024-03-10 at 19.28.21.jpeg");

        driver.quit();
    }
}
