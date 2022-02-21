package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drive.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.GoogBuscBbStep;

public class GoogBusqBbExcelStepDefinitions {

    @Steps
    GoogBuscBbStep busquedaStep = new GoogBuscBbStep();

    @Given("^que me encuentro en el buscador en la pagina BestBuy$")
    public void queMeEncuentroEnElBuscadorEnLaPaginaBestBuy() {
        SeleniumWebDriver.chromeDriver("https://www.bestbuy.ca/en-ca?intlreferer=&intlredir=https://www.bestbuy.com/");
    }

    @When("^llamo datos del archivo excel$")
    public void llamoDatosDelArchivoExcel() {
        busquedaStep.buscarBbExcel();
        busquedaStep.buscarProductoBb();
    }

    @Then("^se hace la busqueda y me muestra resultados del producto seleccionado$")
    public void seHaceLaBusquedaYMeMuestraResultadosDelProductoSeleccionado() {

    }
}
