import java.util.Scanner;


public class IndexTackaHaEr {

	
	/**
	 * Funkcija prima string i ispisuje kompresovani string
	 * @param str
	 */

	public static void kompresuj(String str) {
		String[] niz = new String[30];
		int brojac = 0;
		str = str + " ";
		int idx = 0;
		for (int i=0; i <str.length()-1; i++) 
		{
			String str1 = "" + str.charAt(i);
			String str2 = "" + str.charAt(i + 1);
			if (str1.equals(str2)) 
			{
				brojac++;
			} 
			else 
			{
				niz[idx] = str1 + (brojac + 1);
				idx++;
				brojac = 0;
			}
		}
		for (int i = 0; i < niz.length; i++) {
        String jedan = "1";
			if (niz[i] == null) {
				niz[i] = "";
			}
			
			if(niz[i].contains(jedan))
				niz[i] = niz[i].substring(0,1);

			System.out.print(niz[i]);

		}

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vas string");
		String nekiString = unos.next();
		kompresuj(nekiString);
	}

}
