import java.util.Scanner;

public class PosljednjaRijec {

	/**
	 * Funkcija prima rečenicu i vraća zadnju riječ iz rečenice
	 * @param recenica
	 */
	
	private static void rijec(String recenica) {
		String str = "";
		String okreni = "";
		int i=recenica.length()-1;
		while (recenica.charAt(i) != ' ')
		{
			str += recenica.charAt(i);
			i--;
		}
		for (int j=str.length()-1; j>=0; j--)
		{
			okreni += str.charAt(j);
		}
		System.out.println(okreni);
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite rečenicu: ");
		String recenica = unos.nextLine();
		rijec(recenica);
	}


}
