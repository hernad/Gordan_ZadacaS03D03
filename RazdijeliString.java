import java.util.Scanner;


public class RazdijeliString {

	/**
	 * Funkcija bi trebala da vrati niz stringova, razdvojenih zadanim karakterom
	 * @param str
	 * @param chr
	 * @return
	 */
	
	private static String[] razdijeli(String str, char chr) {
		String[] niz = new String [str.length()]; 
		int i=0;
		while (str.length() > 0) 
		{
			String noviString = str.substring(0,
					str.indexOf(chr));
			niz[i] = noviString;
			str = str.substring(0, str.indexOf(chr));
			i++;
		} 
		return niz;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String nekiString = unos.nextLine();
		System.out.println("Unesite znak: ");
		String znak = unos.nextLine();
		char znak2 = znak.charAt(0);
		String[] nizStringova = razdijeli(nekiString, znak2); 
		for (int i=0; i<nizStringova.length; i++)
		{
			System.out.print(nizStringova[i] + " ");
		}
	}

	

}
