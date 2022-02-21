package pageObjects;

import org.openqa.selenium.By;

public class GoogleBbPages {
    public static By txtBuscarProducto = By.xpath("//input[@class='textField_XaJoz']");
    public static By btnCerrarBusqueda = By.xpath("//button[@type='reset']");
    public static By txtBuscarExcel= By.xpath("//input[@class='textField_XaJoz']");

    public static By getTxtBuscarExcel() {
        return txtBuscarExcel;
    }

    public static By getTxtBuscarProducto() {
        return txtBuscarProducto;
    }

    public static By getBtnCerrarBusqueda() {
        return btnCerrarBusqueda;
    }


}
