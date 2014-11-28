import java.util.Scanner;


public class Palindrom {

	/**
	 * Funkcija ispisuje string ako je palindrom
	 * @param str
	 * @return
	 */
	
	public static void ispisiPalindrom(String str)
	{
		int i=0;
		int brojac=0;
		while(str.length()-1-i >= 0)
		{
			if(str.charAt(str.length()-1-i)== str.charAt(i)) 
			{
				brojac++;
			}
			i++;
		}
		if(brojac == str.length())
		{
			System.out.println(str);
		}
	}
	
	/**
	 * Funkcija odvaja jednu riječ iz stringa i poziva funkciju ispisiPalindrom
	 * @param str
	 */
	
	public static void jednaRijec(String str)
	{
		String noviString="";
		int i=0;
		while(i < str.length())
		{
			if(str.charAt(i) != ' ')
			{
				noviString+=str.substring(i, i+1);
			}
			else 
			{
				ispisiPalindrom(noviString);
				noviString="";
			}
			i++;		
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite string: ");
		String recenica = unos.nextLine();
		jednaRijec(recenica);
	}
}
