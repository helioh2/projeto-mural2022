package br.ufpr.mural.server;

public enum Resposta {
	
	OK("ok"),
	COMANDO_INVALIDO("comando-invalido"),
	USUARIO_JA_EXISTE("usuario-ja-existe");

	private String nomeMensagem;
	
	Resposta(String nomeMensagem) {
		this.nomeMensagem = nomeMensagem;
	}
	
	@Override
	public String toString() {
		return nomeMensagem;
	}
	

}
