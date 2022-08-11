package testClasses;

import pages.alfaRomeoPage.PaginaAlfaRomeo;
import pages.dashboardInicio.DashboardInicio;

public class CPA005IngresarAPaginaBuggyCarYChequearLosModelosDeAlfaRomeo {
    private String tituloPaginaPrincipal = "Buggy Cars Rating";
    private String marca = "Alfa Romeo";
    DashboardInicio dashboardInicio;
    PaginaAlfaRomeo paginaAlfaRomeo;


    public void validacionFrontEnd(){
        dashboardInicio = new DashboardInicio();
        dashboardInicio.validarPaginaPrincipal(tituloPaginaPrincipal);
        dashboardInicio.validarYAccederaMarcaAutos(marca);
        paginaAlfaRomeo = new PaginaAlfaRomeo();
        paginaAlfaRomeo.validarPaginaAlfaRomeo(marca);
        paginaAlfaRomeo.validarQueExistanCuatroModelosAlfaRomeo();
    }






}
