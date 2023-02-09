/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.mural.database;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufpr.mural.core.Anuncio;
import br.ufpr.mural.core.Comentario;
import br.ufpr.mural.core.Evento;
import br.ufpr.mural.core.Mural;
import br.ufpr.mural.core.Post;
import br.ufpr.mural.core.Reacao;
import br.ufpr.mural.core.Sugestao;
import br.ufpr.mural.core.Usuario;

/**
 *
 * @author helio
 */
public class InMemoryDatabase implements DatabaseDao {  // DAO = Data Access Object
        
   
	private Map<String, Usuario> usuarios;  // agregação 1 para muitos
//	private Map<String, Mural> murais;
	

    public InMemoryDatabase() {
		this.usuarios = new HashMap<>();
        // TODO atribuir map de murais
	}
	
    public void inserirUsuario(Usuario usuario){
        this.usuarios.put(usuario.getUserName(), usuario);
    }
    
    public Usuario getUsuario(String userName) {
    	return this.usuarios.get(userName);
    }

    /**
     * Limpa os maps.
     */
	@Override
	public void limparBase() {
		this.usuarios = new HashMap<>();
        // TODO: limpar murais
        // RESETANDO GERADORES DE ID:
        Usuario.resetaIds();
        // TODO: resetar ids de todas as classes
	}

    @Override
    public void inserirComentario(Comentario comentario, Post post) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirConfirmacaoEvento(Evento evento, Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirLembrete(Lembrete lembrete, Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirMural(Mural mural) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirPost(Evento post, Mural mural) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirPost(Anuncio post, Mural mural) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirPostSalvo(Post post, Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirReacao(Reacao reacao, Post post) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void inserirSugestao(Sugestao sugestao) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public List<Comentario> recuperarComentarios(Post post) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public List<Evento> recuperarEventosConfirmados(Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public List<Lembrete> recuperarLembretes(Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public Mural recuperarMural(int idMural) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public void recuperarPosts(Mural mural) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public List<Post> recuperarPostsSalvos(Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public List<Reacao> recuperarReacoes(Post post) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public List<Sugestao> recuperarSugestoesFeitas(Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public List<Sugestao> recuperarSugestoesPost(Post post) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public List<Sugestao> recuperarSugestoesRecebidas(Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        return null;
    }

    @Override
    public void removerConfirmacaoEvento(Evento evento, Usuario usuario) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

    @Override
    public void removerReacao(Reacao reacao, Post post) {
        // NÃO PRECISA IMPLEMENTAR
        
    }

	
    
    
    
}
