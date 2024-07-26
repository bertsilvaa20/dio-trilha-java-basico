package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
    public abstract double calcularXp();
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	@Override
	public String toString() {
		return "Dados [titulo=" + titulo + ", descricao=" + descricao + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	

}
