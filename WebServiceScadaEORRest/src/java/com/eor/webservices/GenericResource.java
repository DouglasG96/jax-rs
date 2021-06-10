/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eor.webservices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Julio
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of com.eor.webservices.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        String jsonInString = "";
        BufferedReader br = null;
        FileReader fr = null;
        try {
            String sCurrentLine = null;
            fr = new FileReader("C:\\ArchivosWebService\\Json.txt");
            br = new BufferedReader(fr);
            while ((sCurrentLine = br.readLine()) != null) {
                jsonInString = jsonInString + sCurrentLine;
            }
        } catch (IOException ex) {
            Response.serverError();
            //Logger.getLogger(GenericResource.class.getName()).log(Level.SEVERE, null, ex);
        }        
              
        return Response.ok(jsonInString)
                .header("Access-Control-allow-Origin", "*")
                .header("Access-Control-allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
                .header("Access-Control-allow-Headers", "Content-Type, Accept, x-Requested-with").build();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
