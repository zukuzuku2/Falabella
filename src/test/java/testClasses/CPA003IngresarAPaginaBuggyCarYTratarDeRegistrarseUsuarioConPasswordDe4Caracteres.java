package testClasses;

import pages.dashboardInicio.DashboardInicio;
import pages.registerPage.PaginaDeRegistro;

public class CPA003IngresarAPaginaBuggyCarYTratarDeRegistrarseUsuarioConPasswordDe4Caracteres {

    private String tituloPaginaPrincipal = "Buggy Cars Rating";

    private String nickName = "ana";
    private String nombre = "Anathan";
    private String apellido = "Pham";
    private String pass = "anad";
    private String repass = "anad";
    private DashboardInicio dashboardInicio;
    private PaginaDeRegistro paginaDeRegistro;

    public void validarFrontEnd() {
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
        paginaDeRegistro.validarTextoPassIncorrecto();
    }


}
