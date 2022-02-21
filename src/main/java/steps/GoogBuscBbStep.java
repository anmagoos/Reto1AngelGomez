package steps;

import drive.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.GoogleBbPages;
import utils.ExcelBb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class GoogBuscBbStep {

        public void escribirBusqueda(By elementolocalizado, String texto){
            SeleniumWebDriver.driver.findElement(elementolocalizado).sendKeys(texto, Keys.ENTER);

        }

        public void darClic(By elementolocalizado){
            SeleniumWebDriver.driver.findElement(elementolocalizado).click();
        }
        public void limpiarTxt(By elementolocalizado){ SeleniumWebDriver.driver.findElement(elementolocalizado).clear();
    }

        //metodo que ordena las acciones
        @Step
        public void buscarProductoBb(){
            escribirBusqueda(GoogleBbPages.getTxtBuscarProducto(), "Computers & Tablets");
            darClic(GoogleBbPages.getTxtBuscarProducto());
            darClic(GoogleBbPages.getBtnCerrarBusqueda());

         }

        private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
        @Step
        public void buscarBbExcel(){
            try {
              leerExcel = ExcelBb.leerXls("DatosBusquedaBetsBuy.xlsx","TerminosBusq");
            }
            catch (IOException e){
            e.printStackTrace();
        }
            for(int i = 0; i < leerExcel.size(); i++){
            escribirBusqueda(GoogleBbPages.getTxtBuscarExcel(),leerExcel.get(i).get("BuscarProducto"));
            darClic(GoogleBbPages.getTxtBuscarProducto());

            //darClic(GoogleBbPages.getBtnCerrarBusqueda());

        }
    }
}
