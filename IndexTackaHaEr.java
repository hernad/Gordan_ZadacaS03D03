import java.util.Scanner;


public class IndexTackaHaEr {

	private static String kompresuj(String str) {
		String kompresovani = "";
		for (int i=0; i<str.length(); i++)
		{	
			int brojac = 0;
			for (int j=0; j<str.length(); j++)
			{
				if (str.charAt(i) == (str.charAt(j)))
				{
					brojac++;
				}
			}
			if (brojac ==1)
			{
				kompresovani += str.charAt(i);
			}
			else
			{	
				kompresovani += brojac;
			}
			
		}
		return kompresovani;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite string: ");
		String nekiString = unos.nextLine();
		System.out.println(kompresuj(nekiString));
	}

}
