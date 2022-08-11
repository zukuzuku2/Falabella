package utils;

import driver.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AccionesControladas {

    public static boolean  visualizarObjeto(WebElement objeto, int segundos){
        try{
            System.out.println("Buscamos el objeto:"+objeto+", esperamos "+segundos+" segundos, hasta que aparezca.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(segundos));
            wait.until(ExpectedConditions.visibilityOf(objeto));
            System.out.println("Se encontró objeto:"+objeto+", se retorna true.");
            return true;
        }catch(Exception e){
            System.out.println("No se encontró objeto:"+objeto+", se retorna false.");
            return false;
        }
    }

}
