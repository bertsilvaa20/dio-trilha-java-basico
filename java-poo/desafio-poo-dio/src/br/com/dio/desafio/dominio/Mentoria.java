package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Mentoria() {
		
		
	}
	
	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", getData()=" + getData() + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
