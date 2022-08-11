package pages.dashboardInicio;

import driver.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/form/div/input[2]")
    private WebElement txtBoxPass;

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/form/div/input[1]")
    private WebElement txtBoxLogin;

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/form/button")
    private WebElement btnLogin;

    @FindBy(xpath = "/html/body/my-app/div/main/my-home/div/div/div/div/h3")
    private List<WebElement> marcaAutos;

    @FindBy(xpath = "/html/body/my-app/div/main/my-home/div/div/div/a/img")
    private List<WebElement> imgAutos;

    /**
     * Validamos que nos encontremos en la pagina principal del sitio indicado por el caso de prueba
     *
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
    public void clickOpcionRegistrar() {
        System.out.println("\n Comienza Metodo --> clickOpcionRegistrar \n");
        try {
            if (visualizarObjeto(btnRegister, 10)) {
                assertTrue("Se visualiza correctamente el elemento Boton --> Register", true);
                btnRegister.click();
            } else {
                fail("No se visualiza el elemento Boton --> Register");
            }
        } catch (NullPointerException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos que exista el textBoxLogin
     */
    public void validarTextBoxLogin() {
        System.out.println("\n Comienza Metodo --> validarTextBoxLogin \n");
        try {
            if (visualizarObjeto(txtBoxLogin, 10)) {
                System.out.println("\n Se visualiza Correctamente el Text Box --> Login \n");
                Assert.assertTrue("Se visualiza Correctamente el Text Box --> Login", true);
            } else {
                Assert.fail("No se visualiza Correctamente el Text Box --> Login");
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Enviamos texto al cajon de texto del login
     *
     * @param userName --> Nombre de usuario para iniciar sesion
     */
    public void enviarTextoAlCajonDeLogin(String userName) {
        System.out.println("\n Comienza Metodo --> enviarTextoAlCajonDeLogin \n");
        try {
            txtBoxLogin.sendKeys(userName);
            assertTrue("Se envia correctamente el nombre de usuario al cajon de texto login", true);
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos que exista el textBoxPassword
     */
    public void validarTextBoxPassword() {
        System.out.println("\n Comienza Metodo --> validarTextBoxPassword \n");
        try {
            if (visualizarObjeto(txtBoxPass, 10)) {
                System.out.println("\n Se visualiza Correctamente el Text Box --> Password \n");
                Assert.assertTrue("Se visualiza Correctamente el Text Box --> Password", true);
            } else {
                Assert.fail("No se visualiza Correctamente el Text Box --> Password");
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }

    }

    /**
     * Enviamos texto al cajon de texto del Password
     *
     * @param userPass --> Nombre de usuario para iniciar sesion
     */
    public void enviarTextoAlCajonDePassword(String userPass) {
        System.out.println("\n Comienza Metodo --> enviarTextoAlCajonDeLogin \n");
        try {
            txtBoxPass.sendKeys(userPass);
            assertTrue("Se envia correctamente la contrasenia al cajon de texto del password", true);
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }


    /**
     * Validamos que exista el boton Login
     */
    public void validarBotonLogin() {
        System.out.println("\n Comienza Metodo --> validarBotonLogin \n");
        try {
            if (visualizarObjeto(btnLogin, 10)) {
                System.out.println("\n Se visualiza Correctamente el Boton --> Login \n");
                Assert.assertTrue("Se visualiza Correctamente el Boton --> Login", true);
            } else {
                Assert.fail("No se visualiza Correctamente el Boton --> Login");
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }

    }

    /**
     * Clickeamos el Boton Login
     */
    public void clickBotonLogin() {
        System.out.println("\n Comienza Metodo --> clickBotonLogin \n");
        try {
            btnLogin.click();
            Assert.assertTrue("Se hace click Correctamente en el Boton --> Login", true);
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }

    }

    /**
     * Validamos que exista al menos una marca Alfa Romeo
     */
    public void validarYAccederaMarcaAutos(String marcaEsperada) {
        System.out.println("\n Comienza Metodo --> validarMarcaAutos \n");
        try {
            for (int i = 0; i <= marcaAutos.size(); i++) {
                if (marcaAutos.get(i).getText().contains(marcaEsperada)) {
                    imgAutos.get(i).click();
                    assertTrue("Se clickea correctamente la primera marca del tipo " + marcaEsperada, true);
                    break;
                }
            }

        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
            Assert.fail("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

}
