import java.util.Scanner;


public class RazdijeliString {

	/**
	 * Funkcija vraća niz stringova, razdvojenih zadanim karakterom
	 * @param str
	 * @param chr
	 * @return
	 */
	
	public static String[] razdijeli(String str, char chr)
	{
		String noviString="";
		str = str + " ";
		int i=0, j=0;
		String[] niz= new String[str.length()];
		while(i<str.length())
		{
			if(str.charAt(i) != chr) 
				noviString += str.substring(i, i+1);
			else 
			{
				niz[j]=noviString;
				j++;
				noviString="";
			}
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
			if(nizStringova[i] != null)
			{
				System.out.print(nizStringova[i] + ", ");
			}
		}
	}


}
