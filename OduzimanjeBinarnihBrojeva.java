import java.util.Scanner;


public class OduzimanjeBinarnihBrojeva {

	/**
	 * Funkcija oduzima dva binarna broja i vraća njihov zbir
	 * @param bin1
	 * @param bin2
	 * @return suma
	 */
	
	private static int[] oduzimanje(int[] bin1, int[] bin2) {
		int[] razlika = new int[8];
		for (int i=0; i<8; i++)
		{
			if (bin2[i] == 1)
			{
				bin2[i] = 0;
			}
			else
			{
				bin2[i] = 1;
			}
		}
		for (int i=7; i>0; i--)
		{
			bin2[i] += 1;
			if (bin2[i] > 1)
			{
				bin2[i] = 0;
				bin2[i-1] += 1;  
				if(bin2[0] > 1)
				{
					bin2[0] = 0;
				}
			}
		}
		
		for (int j=0; j<8; j++)
		{
			razlika[j] = bin1[j] + bin2[j];
			if (razlika[j] == 2)
			{
				if (j != 7)
				{
					razlika[j] = 1;
					razlika[j+1] += 1;
				}
				else
				{
					razlika[j] = 1;
				}
			}
		}
		return razlika;
	}
	
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
		int[] bin3 = oduzimanje(bin1, bin2);
		for (int i=0; i<8; i++)
		{
			System.out.print(bin3[i]);
		}

	}

}
