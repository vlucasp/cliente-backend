package com.projeto.cliente.enumeration;


public enum TipoTelefone {
	RESIDENCIAL("Residencial", "R"), CELULAR("Celular", "C"), COMERCIAL("Comercial", "O");
	
	private String descricao;
	private String sigla;
	
	private TipoTelefone(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public static TipoTelefone getBySigla(String sigla) {
		for (TipoTelefone t : TipoTelefone.values()) {
			if (t.getSigla().equals(sigla)) {
				return t;
			}
		}
		return null;
	}
}
