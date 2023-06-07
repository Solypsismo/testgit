package it.betacom.model;

import java.util.Scanner;

public class Gioco {
	
	private int partitePareggiate = 0, nPartite;

	public void num_partite() {
		
		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;

        while (!validInput) {
            System.out.println("Quante partite vuoi fare : ");
            if (scanner.hasNextInt()) {
                setnPartite(scanner.nextInt());
                validInput = true;
            } else {
                System.out.println("Input non valido. Riprova.");
                scanner.next();
            }
        }
		
		scanner.close();
	}
	
	public void gioca(Persona persona_1, Persona persona_2, Dado dado) {
		
		num_partite();
		
		for(int i = 0; i < getnPartite(); i++) {
			lancia_dado(persona_1, dado);
			lancia_dado(persona_2, dado);
			controllo(persona_1, persona_2);
		}
	}
	
	public void acquisisciDati(Persona persona, Scanner scanner) {
		
		System.out.println("Inserisci nome : ");
		String nome = scanner.nextLine();
		
		while(nome.trim() == "") {
			System.out.println("Stringa non valida");
			System.out.println("Inserisci nome : ");
			nome = scanner.nextLine();
		}
			
		persona.setNome(nome);
		System.out.println("Ti sei registrato");
		
	}
	
	public void controllo(Persona persona_1, Persona persona_2){
			
			if(persona_1.getDado() == persona_2.getDado()){

				setPartitePareggiate(getPartitePareggiate() + 1);
				
			}else if(persona_1.getDado() > persona_2.getDado()){

				persona_1.setPartiteVinte(persona_1.getPartiteVinte() + 1 );
			}else{

				persona_2.setPartiteVinte(persona_2.getPartiteVinte() + 1 );
			}
		}
	
	public void esito(Persona persona_1, Persona persona_2) {
		System.out.println("Partite vinte da " + persona_1.getNome() + " : " + persona_1.getPartiteVinte() );
		System.out.println("Partite vinte da " + persona_2.getNome() + " : " + persona_2.getPartiteVinte() );
		System.out.println("Partite pareggiate : " + getPartitePareggiate());
		
		System.out.println("Risultati");
		
		System.out.println(persona_1.getNome() + ": ");
		for(int x : persona_1.risultati) {
			System.out.print(x + "\t");
		}
		
		System.out.println("\n" + persona_2.getNome() + ": ");
		for(int x : persona_2.risultati) {
			System.out.print(x + "\t");
		}
	}
	
	public void lancia_dado(Persona persona, Dado dado){
		persona.setDado(dado.lancia() + dado.lancia());
		persona.risultati.add(persona.getDado());
	}
	
	public int getPartitePareggiate() {
		return partitePareggiate;
	}

	public void setPartitePareggiate(int partitePareggiate) {
		this.partitePareggiate = partitePareggiate;
	}

	public int getnPartite() {
		return nPartite;
	}

	public void setnPartite(int nPartite) {
		this.nPartite = nPartite;
	}

	
}
