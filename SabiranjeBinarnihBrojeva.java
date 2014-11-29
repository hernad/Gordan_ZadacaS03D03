import java.util.Scanner;


public class SabiranjeBinarnihBrojeva {

	/**
	 * Funkcija sabira dva binarna broja i vraća njihov zbir
	 * @param bin1
	 * @param bin2
	 * @return suma
	 */
	
	private static int[] sabiranje(int[] bin1, int[] bin2) {
		int[] suma = new int[8];
		for (int i=0; i<8; i++)
		{
			suma[i] = bin1[i] + bin2[i];
			if (suma[i] == 2)
			{
				if (i != 7)
				{
					suma[i] = 1;
					suma [i+1] += 1;
				}
				else
				{
					suma[i] = 1;
				}
			}
		}
		return suma;
	}
	
	/**
	 * Funkcija traži unos binarnog broja i vraća ga u obliku niza
	 * @return niz
	 */
	
	private static int[] unosBinarnogBroja() {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite 8-bitni binarni broj: ");
		int[] niz = new int [8];
		for (int i=0; i<8; i++)
		{	
			niz[i] = unos.nextInt();
			if (niz[i] != 0 && niz[i] != 1)
			{
				System.out.println("Niste unijeli binarni broj!");
				break;
			}	
		}
		return niz;
	}
	
	public static void main(String[] args) {
		
		int[] bin1 = unosBinarnogBroja();
		int[] bin2 = unosBinarnogBroja();
		int[] bin3 = sabiranje(bin1, bin2);
		for (int i=0; i<8; i++)
		{
			System.out.print(bin3[i]);
		}
	}
	
}
