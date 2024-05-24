package br.com.mentoria.automacao.web.commons;

import br.com.mentoria.automacao.web.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dsl extends BaseTest {

    /**
     * Acessar uma url
     * @param url Inserir url desejada
     */
    public void accessSite(String url){
        driver.get(url);
    }

    /**
     * Escreve em um elemento desejado
     * @param xpath Insira o elemento xpath
     * @param text Insira o texto que deseja escrever
     */
    public void writeByXpath(String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    /**
     * Escreve em um elemento desejado
     * @param id Insira o elemento id
     * @param text Insira o texto que deseja escrever
     */
    public void writeById(String id, String text){
        driver.findElement(By.id(id)).sendKeys(text);
    }

    /**
     * Clicar em um elemento desejado
     * @param xpath Inisira o elemento xpath
     */
    public void clickByXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    /**
     * Clicar em um elemento desejado
     * @param id Insira o elemento id
     */
    public void clickById(String id){
        driver.findElement(By.id(id)).click();
    }

    /**
     * Selecionar uma opção a partir de um Select
     * @param xpath Insira o xpath do elemento
     * @param value Inserir a value desejada
     */
    public void selectyByValue(String xpath, String value){
        Select select = new Select(driver.findElement(By.xpath(xpath)));
        select.selectByValue(value);
    }

    /**
     * Selecionar uma opção a partir de um Select
     * @param id Insira o xpath do elemento
     * @param value Inserir a value desejada
     */
    public void selectyByValueId(String id, String value){
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByValue(value);
    }

    /**
     * Selecionar uma opção a partir de um Select
     * @param id Insira o id do elemento
     * @param value Inserir a value int desejada
     */
    public void selectyByIndex(String id, int value){
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByIndex(value);
    }

    /**
     * Selecionar uma opção a partir de um Select
     * @param id Insira o id do elemento
     * @param value Inserir a value desejada
     */
    public void selectyByVisibleText(String id, String value){
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByValue(value);
    }

    /**
     * Selecionar uma opção a partir de um Select
     * @param id Insira o id do elemento
     * @param value Inserir a value desejada
     */
    public void selectyByVisibleTextInt(String id, int value){
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByValue(String.valueOf(value));
    }

    /**
     * Carrega uma imagem a partir de um input
     * @param id Insira o id do elemento
     */
    public void uploadImage(String id, String path){
        WebElement upload = driver.findElement(By.id(id));
        upload.sendKeys(path);
    }
}
