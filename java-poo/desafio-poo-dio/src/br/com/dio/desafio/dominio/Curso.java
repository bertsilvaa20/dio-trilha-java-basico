package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	public int cargaHoraria;
	
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso() {
		
		
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", getCargaHoraria()=" + getCargaHoraria() + ", getTitulo()="
				+ getTitulo() + ", getDescricao()=" + getDescricao() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
