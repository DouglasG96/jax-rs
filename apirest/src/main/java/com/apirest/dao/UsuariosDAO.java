/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.dao;

import com.apirest.modelo.Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class UsuariosDAO {
    
    public static List<Usuarios> getUsuarios()
    {
        List<Usuarios> lista = new ArrayList();
        Usuarios usr = new Usuarios(1,1,"douglas","1234");
        Usuarios usr1 = new Usuarios(2,1,"ricardo","12345");
        Usuarios usr2 = new Usuarios(3,1,"guzman","123456");
        Usuarios usr3 = new Usuarios(4,1,"barahona","1234567");
        
        lista.add(usr);
        lista.add(usr1);
        lista.add(usr2);
        lista.add(usr3);
        return lista;
    }
}
