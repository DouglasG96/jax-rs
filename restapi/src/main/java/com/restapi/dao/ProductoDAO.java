/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.restapi.dao;

import com.restapi.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProductoDAO {
    public static List<Producto> getProductos()
    {
        List<Producto> lista = new ArrayList();
        Producto producto = new Producto(1,"Zapato",50);
        Producto producto2 = new Producto(2,"Pasta",10);
        Producto producto3 = new Producto(3,"Sardina",20);
        Producto producto4 = new Producto(4,"Espaguetti",11);
        Producto producto5 = new Producto(5,"Aceite",5);
        
        lista.add(producto);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        lista.add(producto5);
        
        return lista;
    }
}
