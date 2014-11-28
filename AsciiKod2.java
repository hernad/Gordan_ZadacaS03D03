import java.util.Scanner;


public class AcsiiKod2 {

	/**
	 * Funkcija ispisuje ASCII kod šifru zadanog znaka i sve znakove koji slijede
	 * @param chr
	 */
	
	private static void ascii(char chr) {
		char pomocna = chr;
		int broj = (char) pomocna;
		System.out.println("ASCII šifra broja je: " + broj);
		for (int i=176-broj; i<=176; i++)
		{
			char znak = (char) i;
			System.out.println(znak);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite znak: ");
		String znak = unos.nextLine();
		char znak2 = znak.charAt(0);
		ascii(znak2);
	}


}
