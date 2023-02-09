/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.mural.core;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private int id;
    private String userName;  // identificador
    private List<Post> postsSalvos;
    
    private static int ultimoId = 0;

    private synchronized static void incrementaId() {
        ultimoId++;
    }


    public Usuario(String userName) {
        incrementaId();
        this.id = ultimoId;
        this.userName = userName;
        this.postsSalvos = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }
    
    public List<Post> getPostsSalvos() {
		return postsSalvos;
	}
    
    public void salvarPost(Post post) {
    	this.postsSalvos.add(post);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
    
    
    
}
