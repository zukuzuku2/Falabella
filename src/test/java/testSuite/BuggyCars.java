package testSuite;

import driver.DriverContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testClasses.CPA001IngresarAPaginaBuggyCarYRegistrarseCorrectamente;

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
}
