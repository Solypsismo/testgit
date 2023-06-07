package it.betacom.model;

import java.util.ArrayList;

public class Persona {
	
	private String  nome;
	private int Dado;
	private int partiteVinte;
	public ArrayList<Integer> risultati = new ArrayList();
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDado() {
		return Dado;
	}

	public void setDado(int dado) {
		Dado = dado;
	}

	public int getPartiteVinte() {
		return partiteVinte;
	}

	public void setPartiteVinte(int partiteVinte) {
		this.partiteVinte = partiteVinte;
	}

}
