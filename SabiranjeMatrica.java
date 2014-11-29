import java.util.Scanner;


public class SabiranjeMatrica {

	/**
	 * Funkcija kreira matricu
	 * @return matrica
	 */
	
	private static int[][] kreirajMatricu() {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite visinu matrice: ");
		int visina = unos.nextInt();
		System.out.println("Unesite širinu matrice: ");
		int sirina = unos.nextInt();
		int[][] matrica = new int[visina][sirina];
		for (int i=0; i<visina; i++)
		{
			for (int j=0; j<sirina; j++)
			{
				System.out.println("Unesite (" + (i+1) + ", " + (j+1) + ") član matrice: ");
				matrica[i][j] = unos.nextInt();
			}
		}
		return matrica;
	}
	
	/**
	 * Funkcija ispisuje zadanu matricu
	 * @param matrica
	 */
	
	private static void ispisiMatricu(int[][] matrica) {
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.printf("%3d ", matrica[i][j]);
			}
			System.out.println();
		}
	}
		
	/**
	 * Funkcija sabira dvije matrice i vraća njihov rezultat
	 * @param matrica1
	 * @param matrica2
	 * @return suma
	 */
	
	private static int[][] saberiMatrice(int[][] matrica1, int[][] matrica2) {
		int[][] suma = new int [matrica1.length][matrica1[0].length];
		if ((matrica1.length != matrica2.length) || (matrica1[0].length != matrica2[0].length))
		{
			System.out.println("Matrice nisu pogodne za sabiranje!");
		}
		else
		{
			for (int i=0; i<suma.length; i++)
			{
				for (int j=0; j<suma[0].length; j++)
				{
					suma[i][j] = matrica1[i][j] + matrica2[i][j];
				}
			}
		}
		return suma;
	}
	public static void main(String[] args) {
		int[][] matrica1 = kreirajMatricu();
		int[][] matrica2 = kreirajMatricu();
		int[][] matrica3 = saberiMatrice(matrica1, matrica2);
		ispisiMatricu(matrica3);
	
	}

}
