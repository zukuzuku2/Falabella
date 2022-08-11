package testClasses;

import pages.dashboardInicio.DashboardInicio;
import pages.registerPage.PaginaDeRegistro;

public class CPA001IngresarAPaginaBuggyCarYRegistrarseCorrectamente {
    private String tituloPaginaPrincipal = "Buggy Cars Rating";
    private String nickName = "miracle";
    private String nombre = "Amer";
    private String apellido = "Al-Barkawi";
    private String pass = "Miracle.2022.Dota";
    private String repass = "Miracle.2022.Dota";
    private String registroExitoso = "Registration is successful";


    private DashboardInicio dashboardInicio;
    private PaginaDeRegistro paginaDeRegistro;

    public void validarFrontEnd(){
        dashboardInicio = new DashboardInicio();
        dashboardInicio.validarPaginaPrincipal(tituloPaginaPrincipal);
        dashboardInicio.clickOpcionRegistrar();
        paginaDeRegistro = new PaginaDeRegistro();
        paginaDeRegistro.validarCampoLogin();
        paginaDeRegistro.validarCampoFirstName();
        paginaDeRegistro.validarCampoLastName();
        paginaDeRegistro.validarCampoPassword();
        paginaDeRegistro.validarCampoConfirmPassword();
        paginaDeRegistro.validarbtnRegisterDeshabilitado();
        paginaDeRegistro.validarBotonCancel();
        paginaDeRegistro.ingresarDatosEntrada(nickName, nombre, apellido, pass, repass);
        paginaDeRegistro.validarbtnRegisterHabilitado();
        paginaDeRegistro.clickBtnRegistar();
        paginaDeRegistro.validarRegistroExitoso(registroExitoso);
    }
}
