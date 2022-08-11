package driver;

import constants.Navegador;
import org.openqa.selenium.WebDriver;

public class DriverContext {

    public static DriverManager driverManager = new DriverManager();
    public static Navegador tipoNavegador;

    public static void setUp(Navegador navegador, String URL){
        driverManager.resolveDriver(navegador, URL);
    }

    public static WebDriver getDriver(){
        return driverManager.getDriver();
    }

    public static void quitDriver(){
        driverManager.getDriver().quit();
    }


}
