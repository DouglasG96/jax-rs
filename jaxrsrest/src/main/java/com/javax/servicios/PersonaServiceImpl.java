/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javax.servicios;

import com.javax.modelos.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Stateless
public class PersonaServiceImpl implements PersonaService {

    @PersistenceContext(unitName="apiRest")
    EntityManager em;

    @Override
    public List<Persona> listarPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return em.find(Persona.class, persona.getIdpersona());
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void registrarPersona(Persona persona) {
        em.persist(persona);
    }

    /**
     *
     * @param persona
     */
    @Override
    public void modificarPersona(Persona persona) {
        em.merge(persona);
    }

    /**
     *
     * @param persona
     */
    @Override
    public void eliminarPersona(Persona persona) {
        em.remove(em.merge(persona));
    }
}
