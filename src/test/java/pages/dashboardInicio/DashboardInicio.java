package pages.dashboardInicio;

import driver.DriverContext;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;
import static utils.AccionesControladas.visualizarObjeto;

public class DashboardInicio {

    public DashboardInicio() {
        WebDriver driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/my-app/header/div/div/div/div[1]/h1")
    private WebElement lblBuggy;

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/form/a")
    private WebElement btnRegister;

    /**
     * Validamos que nos encontremos en la pagina principal del sitio indicado por el caso de prueba
     * @param titulo trae consigo el titulo que debe tener la pagina para hacer la comprobacion
     */
    public void validarPaginaPrincipal(String titulo) {
        System.out.println("\n Comienza Metodo --> validarPaginaPrincipal \n");
        try {
            Thread.sleep(5000);
            String obtener = DriverContext.getDriver().getTitle();
            System.out.println(obtener);
            if (obtener.equals(titulo)) {
                assertTrue("Nos encontramos en la pagina principal de la pagina", true);
            } else {
                fail("No se visualiza el titulo de la pagina");
            }
        } catch (NullPointerException | NoSuchElementException | InterruptedException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }

    }

    /**
     * Se procede a clickear el boton para registrar un nuevo usuario en la pagina principal
     */
    public void clickOpcionRegistrar(){
        System.out.println("\n Comienza Metodo --> clickOpcionRegistrar \n");
        try {
            if(visualizarObjeto(btnRegister, 10)){
                assertTrue("Se visualiza correctamente el elemento Boton --> Register", true);
                btnRegister.click();
            }else {
                fail("No se visualiza el elemento Boton --> Register");
            }
        }catch (NullPointerException ex){
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }
}
