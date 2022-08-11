package testClasses;

import pages.dashboardInicio.DashboardInicio;
import pages.registerPage.PaginaDeRegistro;

public class CPA002IngresarAPaginaBuggyCarYTratarDeRegistrarseCamposVacios {
    private String tituloPaginaPrincipal = "Buggy Cars Rating";
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
        paginaDeRegistro.validarBotonCancel();
        paginaDeRegistro.validarbtnRegisterDeshabilitado();
    }

}
