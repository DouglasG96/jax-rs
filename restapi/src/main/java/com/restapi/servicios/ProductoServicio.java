/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.restapi.servicios;

import com.restapi.dao.ProductoDAO;
import com.restapi.modelo.Producto;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Path("productos")
public class ProductoServicio {
    
    private static final List<Producto> lista = ProductoDAO.getProductos();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductos()
    {
        return Response.ok(lista).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducto(@PathParam("id") int id)
    {
        Producto producto = new Producto();
        producto.setId(id);
        if(lista.contains(producto))
        {
            for(Producto obj: lista)
                if(obj.getId() == id)
                    return Response.ok(obj).build();        
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrarProducto(@PathParam("id") int id)
    {
        Producto producto = new Producto();
        producto.setId(id);
        if(lista.contains(producto))
        {
            lista.remove(producto);
            return Response.ok().build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
