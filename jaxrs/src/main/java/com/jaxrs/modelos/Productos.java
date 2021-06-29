/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jaxrs.modelos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Productos {
    
    private int id;
    private String nombre;
    private double precio;

    public Productos(int id, String nombre, double precio) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Productos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    



}
