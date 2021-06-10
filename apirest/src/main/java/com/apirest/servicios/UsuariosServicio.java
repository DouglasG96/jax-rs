/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.servicios;

import com.apirest.dao.UsuariosDAO;
import com.apirest.modelo.Usuarios;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Douglas
 */
@Path("/usuarios")
public class UsuariosServicio {
    
   private static final List<Usuarios> lista = UsuariosDAO.getUsuarios();
   
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response getUsuarios()
   {
       return Response.ok(lista).build();
   }
}
