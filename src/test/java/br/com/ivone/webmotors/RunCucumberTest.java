package br.com.ivone.webmotors;

import org.junit.runner.RunWith;

import br.com.ivone.webmotors.navegadores.Chrome;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/features")
public class RunCucumberTest {

    private final Chrome chrome;

    @Before
    public void webmotors() {
        chrome.manage().window().maximize();
        chrome.get("https://www.webmotors.com.br/carros/estoque?lkid=1004"); 
    }

}