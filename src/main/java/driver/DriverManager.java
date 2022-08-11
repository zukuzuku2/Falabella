package driver;

import constants.Navegador;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class DriverManager {
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private WebDriver webDriver;
    private File root = new File("driverNavegador");
    private String extensionDriver = ".exe";

    protected void resolveDriver(Navegador nav, String URL) {
        String versionOs = System.getProperty("os.name").toLowerCase();
        System.out.println("\nSistema operativo ->" + versionOs + "\n");
        File driverPath;

        switch (nav) {
            case FIREFOX:
                System.out.println("Se selecciona Firefox");
                driverPath = new File(root, "geckodriver" + extensionDriver);
                System.setProperty("webdriver.gecko.driver", driverPath.getAbsolutePath());
                webDriver = new FirefoxDriver();
                capabilities.setBrowserName("Firefox");
                webDriver.manage().window().maximize();
                break;
            case CHROME:
                System.out.println("Se selecciona Chrome");
                driverPath = new File(root, "chromedriver" + extensionDriver);
                System.setProperty("webdriver.chrome.driver", driverPath.getAbsolutePath());
                webDriver = new ChromeDriver();
                capabilities.setBrowserName("Google Chrome");
                webDriver.manage().window().maximize();
                break;
            default:
                System.out.println("No es posible lanzar el navegador, no se reconoce el navegador: "+nav);
        }
        webDriver.get(URL);
    }
    protected WebDriver getDriver(){return webDriver;}
}
