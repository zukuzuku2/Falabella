package pages.registerPage;

import driver.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;
import static utils.AccionesControladas.visualizarObjeto;

public class PaginaDeRegistro {

    private WebDriver driver;

    public PaginaDeRegistro() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement boxLogin;

    @FindBy(id = "firstName")
    private WebElement boxFirstName;

    @FindBy(id = "lastName")
    private WebElement boxLastName;

    @FindBy(id = "password")
    private WebElement boxPassword;

    @FindBy(id = "confirmPassword")
    private WebElement boxConfirmPass;

    @FindBy(xpath = "/html/body/my-app/div/main/my-register/div/div/form/button")
    private WebElement btnRegister;

    @FindBy(xpath = "/html/body/my-app/div/main/my-register/div/div/form/a")
    private WebElement btnCancel;

    @FindBy(xpath = "/html/body/my-app/div/main/my-register/div/div/form/div[6]")
    private WebElement lblRegistroExitoso;

    /**
     * Validamos el campo de Login, teniendo en cuenta su cajon de texto, para luego en otro metodo enviarle texto
     */
    public void validarCampoLogin() {
        System.out.println("\n Comienza Metodo --> validarCampoLogin \n");
        try {
            if (visualizarObjeto(boxLogin, 10)) {
                System.out.println("Se visualiza correctamente el eleemento --> Login");
                assertTrue("Se visualiza correctamente el elemento Login", true);
            } else {
                System.out.println("No se visualiza correctamente el elemento --> Login");
                fail("No se visualiza correctamente el elemento --> Login");
            }
        } catch (NullPointerException | NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Campo del Primer Nombre (First Name), teniendo en cuenta su cajon de texto, para luego en otro metodo enviarle texto
     */
    public void validarCampoFirstName() {
        System.out.println("\n Comienza Metodo --> validarCampoFirstName \n");
        try {
            if (visualizarObjeto(boxFirstName, 10)) {
                System.out.println("Se visualiza correctamente el elemento --> FirstName");
                assertTrue("Se visualiza correctamente el elemento --> FirstName", true);
            } else {
                System.out.println("No se visualiza correctamente el elemento --> FirstName");
                fail("No se visualiza correctamente el elemento --> FirstName");
            }
        } catch (NullPointerException | NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Campo del Apellido (Last Name), teniendo en cuenta su cajon de texto, para luego en otro metodo enviarle texto
     */
    public void validarCampoLastName() {
        System.out.println("\n Comienza Metodo --> validarCampoLastName \n");
        try {
            if (visualizarObjeto(boxLastName, 10)) {
                System.out.println("Se visualiza correctamente el elemento --> Last Name");
                assertTrue("Se visualiza correctamente el elemento --> Last Name", true);
            } else {
                System.out.println("No se visualiza correctamente el elemento --> Last Name");
                fail("No se visualiza correctamente el elemento --> Last Name");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Campo de la Contraseña (Password), teniendo en cuenta su cajon de texto, para luego en otro metodo enviarle texto
     */
    public void validarCampoPassword() {
        System.out.println("\n Comienza Metodo --> validarCampoPassword \n");
        try {
            if (visualizarObjeto(boxPassword, 10)) {
                System.out.println("Se visualiza correctamente el elemento --> Password");
                assertTrue("Se visualiza correctamente el elemento --> Password", true);
            } else {
                System.out.println("No se visualiza correctamente el elemento --> Password");
                fail("No se visualiza correctamente el elemento --> Password");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Campo de reingresar Contraseña (Confirm Password), teniendo en cuenta su cajon de texto, para luego en otro metodo enviarle texto
     */
    public void validarCampoConfirmPassword() {
        System.out.println("\n Comienza Metodo --> validarCampoConfirmPassword \n");
        try {
            if (visualizarObjeto(boxConfirmPass, 10)) {
                System.out.println("Se visualiza correctamente el elemento --> Confirm Password");
                assertTrue("Se visualiza correctamente el elemento --> Confirm Password", true);
            } else {
                System.out.println("No se visualiza correctamente el elemento --> Password");
                fail("No se visualiza correctamente el elemento --> Password");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos que el Boton --> Register se encuentre deshabilitado
     */
    public void validarbtnRegisterDeshabilitado() {
        System.out.println("\n Comienza Metodo --> validarbtnRegisterDeshabilitado \n");
        try {
            if (visualizarObjeto(btnRegister, 10)) {
                System.out.println("Se visualiza correctamente el Boton --> Register");
                if (!btnRegister.isEnabled()) {
                    System.out.println("Se encuentra deshabilitado el Boton --> Register");
                    assertTrue("Se encuentra deshabilitado el Boton --> Register", true);
                } else {
                    System.out.println("Se encuentra habilitado el Boton --> Register, por lo que se detiene la prueba");
                    fail("Se encuentra habilitado el Boton --> Register, por lo que se detiene la prueba");
                }
            } else {
                System.out.println("No se visualiza correctamente el Boton --> Register");
                fail("No se visualiza correctamente Boton --> Register");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos el Boton --> Cancel
     */
    public void validarBotonCancel() {
        System.out.println("\n Comienza Metodo --> validarBotonCancel \n");
        try {
            if (visualizarObjeto(btnCancel, 10)) {
                System.out.println("Se visualiza correctamente el Boton --> Cancel");
                assertTrue("Se visualiza correctamente el Boton --> Cancel", true);
            } else {
                System.out.println("No se visualiza correctamente el Boton --> Cancel");
                fail("No se visualiza correctamente el Boton --> Cancel");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }

    }

    /**
     * Ingresamos datos a los cambpos correspondientes y antes validados
     *
     * @param login  traera consigo el nickname del usuario a registrarse
     * @param firts  traera consigo el Nombre del usuario a registrarse
     * @param last   traera consigo el Apellido del usuario a registrarse
     * @param pass   traera consigo la contraseña del usuario a registrarse
     * @param repass traera consigo la contraseña para hacer el check
     */
    public void ingresarDatosEntrada(String login, String firts, String last, String pass, String repass) {
        System.out.println("\n Comienza Metodo --> ingresarDatosEntrada \n");
        try {
            Thread.sleep(1000);
            boxLogin.sendKeys(login);
            Thread.sleep(1000);
            boxFirstName.sendKeys(firts);
            Thread.sleep(1000);
            boxLastName.sendKeys(last);
            Thread.sleep(1000);
            boxPassword.sendKeys(pass);
            Thread.sleep(1000);
            boxConfirmPass.sendKeys(repass);
        } catch (InterruptedException | NullPointerException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Se valida que el Boton --> Register se encuentre Habilitado
     */
    public void validarbtnRegisterHabilitado() {
        System.out.println("\n Comienza Metodo --> validarbtnRegisterHabilitado \n");
        try {
            if (visualizarObjeto(btnRegister, 10)) {
                System.out.println("Se visualiza correctamente el Boton --> Register");
                if (btnRegister.isEnabled()) {
                    System.out.println("Se encuentra habilitado el Boton --> Register");
                    assertTrue("Se encuentra habilitado el Boton --> Register", true);
                    assertTrue(btnRegister.isEnabled());
                } else {
                    System.out.println("Se encuentra deshabilitado el Boton --> Register, por lo que se detiene la prueba");
                    fail("Se encuentra deshabilitado el Boton --> Register, por lo que se detiene la prueba");
                }
            } else {
                System.out.println("No se visualiza correctamente el Boton --> Register");
                fail("No se visualiza correctamente Boton --> Register");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }

    }

    /**
     * Clickeamos el Boton --> Register
     */
    public void clickBtnRegistar() {
        System.out.println("\n Comienza Metodo --> clickBtnRegistar \n");
        try {
            btnRegister.click();
            assertTrue("Se clickea correctamente el boton de registrar", true);
        } catch (NullPointerException ex) {
            System.out.println("Se genero al siguiente excepcion " + ex.getMessage());
            System.out.println("Se genero al siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Se hace la comparacion del texto obtenido con el texto esperado
     *
     * @param textoEsperado el indicado por el caso de prueba
     */
    public void validarRegistroExitoso(String textoEsperado) {
        System.out.println("\n Comienza Metodo --> validarRegistroExitoso \n");
        try {
            if (visualizarObjeto(lblRegistroExitoso, 10)) {
                if (lblRegistroExitoso.getText().trim().toLowerCase().equals(textoEsperado.trim().toLowerCase())) {
                    System.out.println("Registro exitoso");
                    assertTrue("Concuerdan los textos a validar", true);
                } else {
                    System.out.println("El texto esperado y es obtenido no coinciden");
                }
            } else {
                System.out.println("No se visualiza el elemento de registro exitoso");
                fail("No se visualiza el elemento de registro exitoso");
            }
        } catch (NoSuchElementException ex) {
            fail("Se genero la siguiente excepcion " + ex.getMessage());
        }
    }


}
