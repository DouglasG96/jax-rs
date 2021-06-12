/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.api.servicios;

import com.api.modelos.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ejb.Stateless;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Stateless
public class PersonaServicio {
    @PersistenceContext(unitName="restUltimaPU")
    EntityManager em;

    public List<Persona> listarPersonas() {
        return em.createNamedQuery("findAll").getResultList();
    }

    public Persona encontrarPersonaPorId(Persona persona) {
        return em.find(Persona.class, persona.getIdpersona());
    }

    public Persona encontrarPersonaPorEmail(Persona persona) {
        Query query = em.createQuery("from persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    public void registrarPersona(Persona persona) {
        em.persist(persona);
    }

    /**
     *
     * @param persona
     */
    public void modificarPersona(Persona persona) {
        em.merge(persona);
    }

    /**
     *
     * @param persona
     */
    public void eliminarPersona(Persona persona) {
        em.remove(em.merge(persona));
    }
}
