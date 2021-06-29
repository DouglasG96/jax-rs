/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebService
public interface ServicioSumarWS {
    @WebMethod
    public int sumar(int a, int b);
}
