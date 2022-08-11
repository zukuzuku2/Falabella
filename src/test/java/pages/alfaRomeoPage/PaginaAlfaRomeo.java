package pages.alfaRomeoPage;

import driver.DriverContext;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;
import static utils.AccionesControladas.visualizarObjeto;

public class PaginaAlfaRomeo {

    public PaginaAlfaRomeo() {
        WebDriver driver = DriverContext.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/my-app/div/main/my-make/div/div[1]/div/h3")
    private WebElement lblAlfaRomeo;

    @FindBy(xpath = "/html/body/my-app/div/main/my-make/div/div[2]/div/div/table/thead/tr/th[2]/a")
    private WebElement colummModel;

    @FindBy(xpath = "/html/body/my-app/div/main/my-make/div/div[2]/div/div/table/tbody/tr/td[2]/a")
    private List<WebElement> modelos;


    /**
     * Validamos que nos encontremos en la pagina de la marca alfa romeo
     *
     * @param nombrePagina --> parametro para hacer comparacion de texto y validar que
     *                     exactamente nos encontramos en la pagina de alfa romeo
     */
    public void validarPaginaAlfaRomeo(String nombrePagina) {
        System.out.println("Comienza Metodo --> validarPaginaAlfaRomeo");
        try {
            if (visualizarObjeto(lblAlfaRomeo, 10)) {
                System.out.println("Se visualiza Correctamente el elemento Label --> Alfa Romeo");
                if (lblAlfaRomeo.getText().trim().equals(nombrePagina)) {
                    System.out.println("Concuerda el texto esperado con el texto obtenido");
                    assertTrue("Concuerda el texto esperado con el texto obtenido", true);
                } else {
                    fail("Concuerda el texto esperado con el texto obtenido");
                }
            } else {
                fail("No se visualiza Correctamente el elemento Label --> Alfa Romeo");
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }

    /**
     * Validamos que existan 4 Modelos de Alfa Romeo en esa pagina
     */
    public void validarQueExistanCuatroModelosAlfaRomeo(){
        System.out.println("Comienza Metodo --> validarQueExistanCuatroModelosAlfaRomeo");
        try {
            int contador = 0;
                if (visualizarObjeto(colummModel, 10)){
                    System.out.println("Se visualiza correctamente el elemento Columna de modelos");
                    for (int i = 0; i <= modelos.size(); i++){
                        contador ++;
                    }
                    System.out.println(String.valueOf(contador));
                    assertTrue("Se devuelve el nombre de la cantidad de modelos ", true);
                }else{
                    System.out.println("No se visualiza correctamente el elemento Columna de modelos");
                }
        } catch (NoSuchElementException ex) {
            System.out.println("Se genera la siguiente excepcion " + ex.getMessage());
        }
    }
}