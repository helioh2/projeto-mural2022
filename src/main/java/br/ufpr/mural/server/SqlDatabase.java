/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.mural.server;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import br.ufpr.mural.core.usuario.Usuario;

/**
 *
 * 
 */
class SqlDatabase {  // DAO = Data Access Object
        
	Connection conexao;
	
	public SqlDatabase() {
		
	}
	
    public void inserirUsuario(Usuario usuario){
        //SQL
    }
    
    public Usuario getUsuario(String userName) {
		return null;
    	//SQL
    }
    
    public void inserirPost(Post post, Mural mural) {
    	// SQL
    }
    
    //...
    
    
    
}
