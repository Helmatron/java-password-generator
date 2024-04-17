package org.lessons.java.security;

// IMPORTO utility java per la raccolta delle funzionalità della classe Scanner
import java.util.Scanner;

// importo le funzionalità del pacchetto java.time per gestire la richiesta della data di nascita
// import java.time.*; - NON FUNZIONA da capire il perchè????
// import java.time.format.DateTimeFormatter; - Da esplorare in futuro


public class PasswordGenerator {

	public static void main(String[] args) {
		
	// << INPUT TASTIERA >>
			// Attivo la raccolta degli input da tastiera col metodo (System.in)
			Scanner input = new Scanner(System.in);
			
	// << NOME >>			
			// Stampo la richiesta del Nome all'utente
			System.out.println("Inserisci il tuo Nome");
			// Imposto variabile NOME e richiedo il valore da console - String
			String name = input.nextLine();
		
	// << COGNOME >>		
			// Stampo la richiesta del Cognome all'utente
			System.out.println("Inserisci il tuo Cognome");
			// Imposto variabile COGNOME e richiedo il valore da console - String
			String surname = input.nextLine();
		
	// << COLORE PREFERITO >>	
			// Stampo la richiesta del Colore Preferito all'utente
			System.out.println("Inserisci il tuo Colore Preferito");
			// Imposto variabile COLORE PREFERITO e richiedo il valore da console - String
			String color = input.nextLine();
		
		
	// << DATA DI NASCITA >>
			//Inserisco messaggio di avviso inizio procedura di acquisizione data di nascita
			System.out.println("Ora dovrai inserire i dati relativi alla tua data di nascita");
			
			// Stampo la richiesta del Giorno di nascita all'utente
			System.out.println("Inserisci il Giorno di nascita - formato numero (gg)");
			// Imposto variabile COLORE PREFERITO e richiedo il valore da console - String
			int dateDay = input.nextInt();
			
			// Stampo la richiesta del Mese di nascita all'utente
			System.out.println("Inserisci il Mese di nascita - formato numero (mm)");
			// Imposto variabile COLORE PREFERITO e richiedo il valore da console - String
			int dateMonth = input.nextInt();
			
			// Stampo la richiesta dell' Anno di nascita all'utente
			System.out.println("Inserisci l'Anno di nascita - formato esteso (aaaa)");
			// Imposto variabile COLORE PREFERITO e richiedo il valore da console - String
			int dateYear = input.nextInt();
		
	// << GENERAZIONE PASSWORD >>
			// Sommo i dati raccolti e restituisco il risultato
			System.out.println("La tua password è la seguente");
			String Password = name + "-" + surname + "-" + color + "-" + (dateDay + dateMonth + dateYear);
			// Stampo il risultato in console
			System.out.print(Password);
		
		
		
		
		// Imposto il formato della data di nascita in modo personalizzato
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		// Stampo la richiesta della data di nascita suddivisa in giorno, mese e anno
		// System.out.println("Inserisci la tua data di nascita (Giorno/Mese/Anno)");
		// Imposto la variabile DATA DI NASCITA e richiedo il valore da console - Numb
		// String date = input.nextLine();
		
		
		
		
	}

}
