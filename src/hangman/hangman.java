package hangman;
import java.util.Arrays;
import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite rec");
		String rec =s.next();
		
		char[] niz = rec.toCharArray();
		
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] );
			
		}
		System.out.println();
		
		char[] tabla = new char[niz.length];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i]='_';
		}
		
		
			int brojac=0;
			
			
				
				while(brojac!=6 && !endGame(niz,tabla)) {
					
				System.out.println("Unesite slovo");
				char slovo=s.next().charAt(0);
			
				if(match(slovo,niz,tabla)) {
					write(slovo,niz,tabla);
					System.out.println(tabla);
				}else {
					
					if (brojac==0) {
						printGlava();
						System.out.println(tabla);
						brojac++;
					}else if (brojac==1) {
						printTelo();
						System.out.println(tabla);
						brojac++;
					}else if (brojac==2) {
						printLevaRuka();
						System.out.println(tabla);
						brojac++;
					}else if (brojac==3) {
						printDesnaRuka();
						System.out.println(tabla);
						brojac++;
					}else if (brojac==4) {
						printLevaNoga();
						System.out.println(tabla);
						brojac++;
					}else {
						printDesnaNoga();
						System.out.println(tabla);
						brojac++;
						
					}
				}
				
				System.out.println(endGame(niz,tabla));
			}	
				
			
		
		if(endGame(niz,tabla)) {
			System.out.println("A L L I V E");
		}else{
			System.out.println("H A N G E D");
		}
		
	} 
	
		public static void print() {
			System.out.println("_______");
			System.out.println("|      |");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println();
		}
		
		public static void printGlava() {
			System.out.println("_______  ");
			System.out.println("|      | ");
			System.out.println("|      O ");
			System.out.println("|        ");
			System.out.println("|        ");
			System.out.println("|        ");
			System.out.println("|        ");
			System.out.println();
		}
		public static void printTelo() {
			System.out.println("_______  ");
			System.out.println("|      | ");
			System.out.println("|      O ");
			System.out.println("|      | ");
			System.out.println("|        ");
			System.out.println("|        ");
			System.out.println();
		}
		
		public static void printLevaRuka() {
			System.out.println("_______  ");
			System.out.println("|      | ");
			System.out.println("|      O ");
			System.out.println("|    --| ");
			System.out.println("|        ");
			System.out.println("|        ");
			System.out.println();
		}
		
		public static void printDesnaRuka() {
			System.out.println("_______   ");
			System.out.println("|      |  ");
			System.out.println("|      O  ");
			System.out.println("|    --|--");
			System.out.println("|         ");
			System.out.println("|         ");
			System.out.println();
		}
		
		public static void printLevaNoga() {
			System.out.println("_______   ");
			System.out.println("|      |  ");
			System.out.println("|      O  ");
			System.out.println("|    --|--");
			System.out.println("|     /   ");
			System.out.println();
		}
		
		public static void printDesnaNoga(){
			System.out.println("_______    ");
			System.out.println("|      |   ");
			System.out.println("|      O   ");
			System.out.println("|    --|-- ");
			System.out.println("|     / \\ ");
			System.out.println("|          ");
			System.out.println();
		}

		public static boolean endGame(char [] niz, char [] tabla) {
			
			boolean end = Arrays.equals(niz, tabla);
				
			return end;	
		
		}
		
		public static char [] write(char slovo, char[] niz, char [] tabla) {
			for (int i = 0; i < niz.length; i++) {
				if(niz[i]==slovo) {
					tabla[i]=slovo;
				}
			}
			
			return tabla;
		}
		
		public static boolean match(char slovo, char[] niz, char [] tabla) {
			for (int i = 0; i < tabla.length; i++) {
				if(niz[i]==slovo) {
					return true;
				}
			}
			return false;
		}
}