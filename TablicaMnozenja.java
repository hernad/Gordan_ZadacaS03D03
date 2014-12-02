
/*
Primjer korištenja:

Ernads-iMac:java hernad$ java -cp . TablicaMnozenja

Unesite dva broja: 
2 4
 1 x 1 = 1 ;  1 x 2 = 2 ;  1 x 3 = 3 ;  1 x 4 = 4 ; 
 2 x 1 = 2 ;  2 x 2 = 4 ;  2 x 3 = 6 ;  2 x 4 = 8 ; 


Unesite dva broja: 
4 3
 1 x 1 = 1 ;  1 x 2 = 2 ;  1 x 3 = 3 ; 
 2 x 1 = 2 ;  2 x 2 = 4 ;  2 x 3 = 6 ; 
 3 x 1 = 3 ;  3 x 2 = 6 ;  3 x 3 = 9 ; 
 4 x 1 = 4 ;  4 x 2 = 8 ;  4 x 3 = 12 ; 

*/

import java.util.Scanner;

public class TablicaMnozenja {

	/**
	 * Funkcija ispisuje tablicu množenja za dva zadana broja pomoću matrice
	 * @param red
	 * @param kolona
	 */
	
	private static void tablica(int red, int kolona) {
		int [][] matrica = new int [red][kolona];
                int [][][] elementi = new int [red][kolona][2];
		for (int i=0; i<red; i++)
		{
			for (int j=0; j<kolona; j++)
			{
				elementi[i][j][0] = (i+1);
				elementi[i][j][1] = (j+1);
				matrica[i][j] = (i+1)*(j+1); 
			}
		}
		for (int i=0; i<red; i++)
		{
			for (int j=0; j<kolona; j++)
			{
				System.out.printf(" %d x %d = %d ; ", elementi[i][j][0], elementi[i][j][1], matrica[i][j]); 
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
