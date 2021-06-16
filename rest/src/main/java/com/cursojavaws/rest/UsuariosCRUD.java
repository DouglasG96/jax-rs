/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojavaws.rest;

import com.cursojavaws.modelos.Usuarios;
import javax.ws.rs.Path;
//import javax.ejb.Stateless;
import com.cursojavaws.logica.AbstractFacade;
import com.cursojavaws.logica.UsuariosInf;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.persistence.EntityManager;

/**
 *
 * @author Douglas
 */
//@Stateless
@Path("usuarios")
public class UsuariosCRUD{
    
    private Class<Usuarios> entityClass;

    @PersistenceContext(unitName = "usuariosCRUDPersistencia")
    private EntityManager em ;
    /*
    public UsuariosCRUD(Class<Usuarios> entityClass) {
        super(entityClass);
    }

    @POST
    //@Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Usuarios entity) {
        super.create(entity);
    }
    */
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuarios> getList()
    {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }
    
    /*
    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getByID()
    {
        return Response.ok("hola").build();
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    */
}
