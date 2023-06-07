package it.betacom.model;
import java.util.Random;

public class Dado {

	private int nFacce;
	private Random gen;

	public Dado(int nFacce){
		this.nFacce = nFacce;
		gen = new Random();
	}
	
	public int lancia(){
		return gen.nextInt(nFacce) + 1; 
	}

}
