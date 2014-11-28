import java.util.Scanner;


public class AsciiKod {

	/**
	 * Funkcija prima broj i vraća ASCII karakter za taj broj
	 * @param br
	 * @return znak
	 */
	
	private static char ascii(int br) {
		char znak = (char) br;
		return znak;
		
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		System.out.println(ascii(broj));
	}


}
