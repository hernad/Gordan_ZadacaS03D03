import java.util.Scanner;


public class TablicaMnozenja {

	/**
	 * Funkcija ispisuje tablicu množenja za dva zadana broja pomoću matrice
	 * @param red
	 * @param kolona
	 */
	
	private static void tablica(int red, int kolona) {
		int [][] matrica = new int [red][kolona];
		for (int i=0; i<red; i++)
		{
			for (int j=0; j<kolona; j++)
			{
				matrica[i][j] = (i+1)*(j+1); 
			}
		}
		for (int i=0; i<red; i++)
		{
			for (int j=0; j<kolona; j++)
			{
				System.out.printf("%3d ",matrica[i][j]); 
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dva broja: ");
		int m = unos.nextInt();
		int n = unos.nextInt();
		tablica(m, n);
	}


}
