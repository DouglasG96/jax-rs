/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javax.servicios;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.javax.modelos.Persona;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebService
public interface PersonaServiceWS {
    
    @WebMethod
    public List<Persona> listarPersonas();
}