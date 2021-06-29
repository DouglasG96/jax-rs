/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testclientews;

import clientesws.servicio.ServicioSumarImplService;
import clientesws.servicio.ServicioSumarWS;

public class TestServicioSumarWS {
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando servicio sumar ws");
        int x = 6;
        int y = 3;
        int resultado = servicioSumar.sumar(x,y);
        System.out.println("Resultado: "+resultado);
        System.out.println("Fin de servicio sumar ws");
    }
}
