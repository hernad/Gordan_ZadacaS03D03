import java.util.Scanner;


public class CezarovaSifra {

	/**
	 * Funkcija prima string i vraća string u obliku Cezarove šifre(šta god to značilo)
	 * @param str
	 * @return noviString
	 */
	
	private static String sifriraj(String str) {
		String noviString = "";
		char znak = ' ';
		int broj = 0;
		for (int i=0; i<str.length(); i++)
		{
			if (str.charAt(i) == 'z')
			{
				znak = 'a';
			}
			else if (str.charAt(i) == 'y')
			{
				znak = 'b';
			}
			else if (str.charAt(i) == 'x')
			{
				znak = 'c';
			}
			else
			{
				broj = (int) str.charAt(i) + 3;
				znak = (char) broj;
			}
			noviString += znak;
		}
		return noviString;
	}

	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String nekiString = unos.nextLine();
		System.out.println(sifriraj(nekiString));
	}

}
