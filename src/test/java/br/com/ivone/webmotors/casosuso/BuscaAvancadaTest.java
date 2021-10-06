package br.com.ivone.webmotors.casosuso;

import static org.junit.Assert.assertTrue;

import br.com.ivone.webmotors.paginas.BuscaAvancadaPagina;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscaAvancadaTest {

    private final BuscaAvancadaPagina pagina;

    @Given("a marca {string}")
    public void a_marca(String marca) {
        pagina.selecionarMarcaDoCarro(marca);
    }

    @When("modelo {string}")
    public void modelo(String modelo) {
        pagina.selecionarModelo(modelo);
    }

    @Then("vejo os veiculos correspondentes {string}")
    public void vejo_os_veiculos_correspondentes(String veiculo) {
        assertTrue(pagina.procurarVeiculo(veiculo));
    }

}