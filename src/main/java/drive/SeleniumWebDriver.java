package drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {
    public static WebDriver driver;
    public static void  chromeDriver(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //la ventana de abre completa
        options.addArguments("--ignore-certificate-errors");
        //Sirve para ignorar las ventas emergentes de las cookes
        options.addArguments("--disable-infobars");
        //hace algo parecido con la alerte de notificaciones
        //options.addArguments("--incognito");
        //para que no pida capcha o entradas constantes a la página como robot se nevega en incognito

        driver = new ChromeDriver(options);
        driver.get(url);
    }
}
