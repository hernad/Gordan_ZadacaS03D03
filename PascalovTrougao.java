import java.util.Scanner;


public class PascalovTrougao {

	/**
	 * Funkcija ispisuje Pascalov trougao za zadani broj
	 * @param n
	 */
	
	private static void pascalovTrougao(int n) {
		int [][] matrica = new int [n][];
		for (int i=0; i<n; i++)
		{
			matrica[i] = new int[i+1];
			matrica [i][0] = 1;
			matrica[i][i] = 1;
			for (int j=1; j<i; j++)
			{
				matrica[i][j] = matrica[i-1][j] + matrica[i-1][j-1];
			}
		}
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.printf("%3d ", matrica[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj n: ");
		int n= unos.nextInt();
		pascalovTrougao(n);

	}

}
