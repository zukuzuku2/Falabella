package testClasses;

import pages.LogedPage.PaginaUsuarioLogueado;
import pages.dashboardInicio.DashboardInicio;

public class CPA004IngresarAPaginaBuggyCarYLoguearseCOnUsuarioAntesRegistrado {

    private String tituloPaginaPrincipal = "Buggy Cars Rating";
    private String nickName = "miracle";
    private String nombre = "Amer";
    private String apellido = "Al-Barkawi";
    private String pass = "Miracle.2022.Dota";
    private String repass = "Miracle.2022.Dota";
    private String registroExitoso = "Registration is successful";


    private DashboardInicio dashboardInicio;
    private PaginaUsuarioLogueado paginaUsuarioLogueado;
    public void validarFrontEnd(){
        dashboardInicio = new DashboardInicio();
        dashboardInicio.validarPaginaPrincipal(tituloPaginaPrincipal);
        dashboardInicio.validarBotonLogin();
        dashboardInicio.validarTextBoxLogin();
        dashboardInicio.enviarTextoAlCajonDeLogin(nickName);
        dashboardInicio.validarTextBoxPassword();
        dashboardInicio.enviarTextoAlCajonDePassword(pass);
        dashboardInicio.clickBotonLogin();
        paginaUsuarioLogueado = new PaginaUsuarioLogueado();
        paginaUsuarioLogueado.validarNombreDelUsuario(nombre);
        paginaUsuarioLogueado.validarBotonPerfilUsuario();
        paginaUsuarioLogueado.validarBotonCerrarSesion();
    }
}
