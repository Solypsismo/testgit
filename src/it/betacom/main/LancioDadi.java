package it.betacom.main;
import it.betacom.model.*;
import java.util.Scanner;

public class LancioDadi {
	
	public static void main(String[] args) {
		
		Gioco partita = new Gioco();
		
		Scanner scanner = new Scanner(System.in);

		Dado dado = new Dado(6);
		
		Persona persona_1 = new Persona();
		partita.acquisisciDati(persona_1, scanner);

		Persona persona_2 = new Persona();
		partita.acquisisciDati(persona_2, scanner);
		
		partita.gioca(persona_1, persona_2, dado);
		
		partita.esito(persona_1, persona_2);
		
		scanner.close();
		
		System.out.println("ciao git ueue");
	}
}
