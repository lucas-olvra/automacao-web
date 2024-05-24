package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.web.commons.Dsl;
import org.junit.Test;

public class SwitchTo extends Dsl {

    @Test
    public void actionBySwitchTo(){
        super.accessSite("https://demo.automationtesting.in/Register.html");
        super.actionByXpath("//a[@href='SwitchTo.html' and text()='SwitchTo']");
        super.clickByXpath("//a[@href='Frames.html' and text()='Frames']");
    }
}
