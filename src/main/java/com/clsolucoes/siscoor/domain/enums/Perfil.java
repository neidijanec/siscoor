package com.clsolucoes.siscoor.domain.enums;

public enum Perfil {
	
	ADMIN(1, "ROLE_ADMIN"),
	SUPERVISOR(2, "ROLE_SUPERVISOR"),
	ESTAGIARIO(3, "ROLE_ESTAGIARIO"),
	LIDER(4, "ROLE_LIDER");
	
	private int cod;
	private String descricao;
	
	private Perfil(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (Perfil x : Perfil.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}