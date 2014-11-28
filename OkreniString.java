import java.util.Scanner;


public class OkreniString {

	/**
	 * Funkcija prima string i vraća string unazad
	 * @param str
	 * @return
	 */
	
	private static String okreni(String str) {
		String okrenutiString = "";
		for (int i=str.length()-1; i>=0; i--)
		{
			okrenutiString += str.charAt(i);
		}
		return okrenutiString;
	}

	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String nekiString = unos.nextLine();
		String noviString = okreni(nekiString);
		System.out.println(noviString);

	}

}
