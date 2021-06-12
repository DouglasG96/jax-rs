/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaxrs.recursos;

import com.jaxrs.modelos.Productos;
import io.swagger.annotations.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Path("catalogo")
@Api(tags={"JaxRS"})
@Produces(MediaType.APPLICATION_JSON)
public class Catalogo {

    public List<Productos> listado_productos()
    {
        List<Productos> pro = new ArrayList<Productos>();

        pro.add(new Productos(1,"leche",15));
        pro.add(new Productos(2,"huevos",10));
        pro.add(new Productos(3,"pan",5));
       
        return pro;   
    }
    
    @GET
    public List<Productos> get()
    {
        return listado_productos();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Productos> post(Productos producto)
    {
        List<Productos> pro = listado_productos();
        pro.add(new Productos(producto.getId(), producto.getNombre(), producto.getPrecio()));
        return pro;
    }
    
    @POST
    @Path("url/{id}&{nombre}&{precio}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Productos> post_url(
            @PathParam("id") int id,
            @PathParam("nombre") String nombre, 
            @PathParam("precio") double precio)
    {
        List<Productos> pro = listado_productos();
        pro.add(new Productos(id,nombre,precio));
        return pro;
    }
    
    @POST 
    @Path("/response")
    public Response postStudenRecord(List<Productos> pro)
    {
        return Response.status(201).entity(pro).type(MediaType.APPLICATION_JSON).build();
    }
    
    @PUT
    public List<Productos> put(Productos pro)
    {
        List<Productos> lista_prod = listado_productos();
        for(Productos examenes: lista_prod)
        {
            if(examenes.getId() == pro.getId())
            {
                examenes.setPrecio(pro.getPrecio());
            }
        }
        return lista_prod;
    }
    
    @DELETE
    public List<Productos> delete(Productos pro)
    {
        List<Productos> lista_prod = listado_productos();
        for(Iterator<Productos> iterator_pro = lista_prod.iterator(); iterator_pro.hasNext();)
        {
            Productos dato = iterator_pro.next();
            if(dato.getId() == pro.getId())
            {
                iterator_pro.remove();
            }
        }
        return lista_prod;       
    }
    
}
