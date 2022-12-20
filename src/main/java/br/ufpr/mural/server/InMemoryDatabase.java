/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.mural.server;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import br.ufpr.mural.core.usuario.Usuario;

/**
 *
 * @author helio
 */
class InMemoryDatabase {  // DAO = Data Access Object
        
   
	private Map<String, Usuario> usuarios;  // agregação 1 para muitos
//	private Map<String, Mural> murais;
	
	public InMemoryDatabase() {
		this.usuarios = new HashMap<>();
	}
	
    public void inserirUsuario(Usuario usuario){
        this.usuarios.put(usuario.getUserName(), usuario);
    }
    
    public Usuario getUsuario(String userNameNovo) {
    	return this.usuarios.get(userNameNovo);
//    	for (Usuario usuario: this.usuarios) { // para cada usuario em this.usuarios
//    		if (userNameNovo.equals(usuario.getUserName())) {
//    			return usuario;
//    		}
//    	}
//    	return null;
    }
    
    
    
}
