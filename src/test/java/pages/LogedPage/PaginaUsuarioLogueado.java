package pages.LogedPage;

import driver.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static utils.AccionesControladas.visualizarObjeto;

public class PaginaUsuarioLogueado {

    private WebDriver driver;

    public PaginaUsuarioLogueado() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/ul/li[1]/span")
    private WebElement lblNombreUsuario;

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/ul/li[2]/a")
    private WebElement btnPerfilUsuario;

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/ul/li[3]/a")
    private WebElement btnLogout;


    /**
     * Se utiliza pra valida que una vez hayamos iniciado sesion
     * efectivamente estemos en la pagina de Usuario Logueado
     *
     * @param nombre --> hace referencia al nombre obtenido directamente de la pagina
     */
    public void validarNombreDelUsuario(String nombre) {
        System.out.println("\n Comienza Metodo --> validarNombreDelUsuario \n");
        try {
            if (visualizarObjeto(lblNombreUsuario, 10)) {
                System.out.println("\n Se visualiza Correctamente el nombre del usuario: " + nombre + "\n");
                if (nombre.equals(lblNombreUsuario.getText().replace("\n", "").replace("Hi, ", "").trim())) {
                    System.out.println("\n Concuerda el texto esperado con el texto obtenido \n");
                    assertTrue("Concuerda el texto esperado con el texto obtenido", true);
                } else {
                    fail("No concuerda el texto esperado con el texto obtenido");
                }
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Boton Perfil Usuario
     */
    public void validarBotonPerfilUsuario() {
        try {
            if (visualizarObjeto(btnPerfilUsuario, 10)) {
                System.out.println("\n Se visualiza Correctamente el Boton --> Perfil Usuario \n");
                assertTrue("Se visualiza Correctamente el Boton --> Perfil Usuario", true);
            } else {
                fail("No se visualiza Correctamente el Boton --> Perfil Usuario");
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Boton Cerrar Sesion o Logout
     */
    public void validarBotonCerrarSesion() {
        try {
            if (visualizarObjeto(btnLogout, 10)) {
                System.out.println("\n Se visualiza Correctamente el Boton --> Cerrar Sesion (Logout) \n");
                assertTrue("Se visualiza Correctamente el Boton --> Cerrar Sesion (Logout)", true);
            } else {
                fail("No se visualiza Correctamente el Boton --> Cerrar Sesion (Logout)");
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

}
