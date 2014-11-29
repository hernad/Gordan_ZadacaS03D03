import java.util.Scanner;


public class BinarniBrojNiz {

	/**
	 * Funkcija prima cijeli pozitivni broj i vraća njegovu binarnu vrijednost u obliku niza
	 * @param broj
	 * @return niz
	 */
	
	private static int[] binarniBroj(int broj) {
		int [] niz = new int [8];
		int i = 7;
		while(broj != 0)
		{
			if (broj % 2 == 0)
			{
				niz[i] = 0;
			}
			else
			{
				niz[i] = 1; 
			}
			broj = broj/2;
			i--;
		}
		return niz;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite jedan cijeli pozitivni broj (do 255): ");
		int broj = unos.nextInt();
		while (broj < 0 || broj > 255)
		{
			System.out.println("Unijeli ste pogrešan broj! Ponovite unos: ");
			broj = unos.nextInt();
		}
		int [] niz = binarniBroj(broj);
		for (int i=0; i<8; i++)
		{
			System.out.print(niz[i] + " ");
		}
			
	}

}
