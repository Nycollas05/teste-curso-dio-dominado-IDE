package com.doi.dio.br;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private Interer idade;

	public Gato() {
	}

	public Gato(String nome, String cor, Interer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
	}

	public void setIdade(Interer idade) {
		this.idade = idade;
	}this.cor=cor;

	}

	public Interer getIdade() {
		return idade;

	@Override
	public int hashCode() {
		return Objects.hash(cor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + "]";
	}

	/*
	 * public gato (String nome, String cor, Integer idade) {this.nome= nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}
