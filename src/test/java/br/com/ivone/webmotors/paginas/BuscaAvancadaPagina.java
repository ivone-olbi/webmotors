package br.com.ivone.webmotors.paginas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import br.com.ivone.webmotors.navegadores.Chrome;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscaAvancadaPagina {

    private final Chrome chrome;

    public void selecionarMarcaDoCarro(String marca) {
        chrome.findElement(By.xpath("//small[contains(text(),'" + marca.toLowerCase() + "')]")).click();
    }

    public void selecionarModelo(String modelo) {
        chrome.findElement(By.xpath("//div[contains(text(),'Todos os modelos')]")).click();
        chrome.findElement(By.xpath("//a[contains(text(),'" + modelo.toUpperCase() + "')]]")).click();
    }

    public boolean procurarVeiculo(String veiculo) {
        chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return !chrome.findElements(By.xpath("//h2[contains(text(),'" + veiculo.toUpperCase() + "')]")).isEmpty();
    }

}