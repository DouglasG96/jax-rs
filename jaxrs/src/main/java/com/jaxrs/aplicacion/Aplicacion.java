/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaxrs.aplicacion;

import io.swagger.jaxrs.config.BeanConfig;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@ApplicationPath("api")
public class Aplicacion  extends Application{

    
    public Aplicacion()
    {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setTitle("JaxRs Swagger");
        beanConfig.setBasePath("/JaxRs/api");
        beanConfig.setResourcePackage("com.jaxrs.recursos");
        beanConfig.setScan(true);
    }
}
