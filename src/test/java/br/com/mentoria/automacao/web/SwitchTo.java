package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.web.commons.Dsl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SwitchTo extends Dsl {

    @Before
    public void beforeTest(){
        super.accessSite("https://demo.automationtesting.in/Register.html");
        super.actionByXpath("//a[@href='SwitchTo.html' and text()='SwitchTo']");

    }

    @Test
    public void actionBySwitchTo(){
        super.clickByXpath("//a[@href='Frames.html' and text()='Frames']");
    }

    @Test
    public void iFrameTest(){
        super.clickById("cbb");

    }

    @After
    public void afterTest(){
        driver.quit();
    }
}
