package testSuite;

import driver.DriverContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testClasses.CPA001IngresarAPaginaBuggyCarYRegistrarseCorrectamente;
import testClasses.CPA002IngrearAPaginaBuggyCarYTratarDeRegistrarseCamposVacios;
import testClasses.CPA003IngrearAPaginaBuggyCarYTratarDeRegistrarseUsuarioConPasswordDe4Caracteres;

import static constants.Navegador.FIREFOX;
import static driver.DriverContext.quitDriver;

public class BuggyCars{
    String URL = "https://buggy.justtestit.org/";

    @Before
    public void setUp(){
        DriverContext.setUp(FIREFOX, URL);
    }

    @After
    public void tearDown(){
        quitDriver();
    }

    @Test
    public void CPA001IngresarAPaginaBuggyCarYRegistrarseCorrectamente(){
        CPA001IngresarAPaginaBuggyCarYRegistrarseCorrectamente mensajero = new CPA001IngresarAPaginaBuggyCarYRegistrarseCorrectamente();
        mensajero.validarFrontEnd();
    }
    @Test
    public void CPA002IngrearAPaginaBuggyCarYTratarDeRegistrarseCamposVacios(){
        CPA002IngrearAPaginaBuggyCarYTratarDeRegistrarseCamposVacios mensajero = new CPA002IngrearAPaginaBuggyCarYTratarDeRegistrarseCamposVacios();
        mensajero.validarFrontEnd();
    }

    @Test
    public void CPA003IngrearAPaginaBuggyCarYTratarDeRegistrarseUsuarioConPasswordDe4Caracteres(){
        CPA003IngrearAPaginaBuggyCarYTratarDeRegistrarseUsuarioConPasswordDe4Caracteres mensajero = new CPA003IngrearAPaginaBuggyCarYTratarDeRegistrarseUsuarioConPasswordDe4Caracteres();
        mensajero.validarFrontEnd();
    }
}
