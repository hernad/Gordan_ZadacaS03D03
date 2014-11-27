import java.util.Scanner;


public class SabiranjePoDijagonali {

	/**
	 * Funkcija sabira sve članove matrice na dijagonali
	 * @param matrica
	 * @return suma
	 */
	
	private static int sumaClanova(int[][] matrica) {
		int suma = 0;
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				if (i==j)
				{
					suma += matrica[i][j];
				}
			}
		}
		return suma;
	}

	/**
	 * Funkcija sabira sve članove matrice na suprotnoj dijagonali
	 * @param matrica
	 * @return suma
	 */
	
	private static int sumaSuprotneDijagonale(int[][] matrica) {
		int suma = 0;
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				if (matrica[i][j]==matrica[j][i])
				{
					suma += matrica[i][j];
				}
			}
		}
		return suma;
	}
	
	/**
	 * Funkcija traži kreira matricu
	 * @return matrica
	 */
	
	private static int[][] unosMatrice() {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite visinu matrice: ");
		int visina = unos.nextInt();
		System.out.println("Unesite širinu matrice: ");
		int sirina = unos.nextInt();
		int[][] matrica = new int [visina][sirina];
		for (int i=0; i<visina; i++)
		{
			for (int j=0; j<sirina; j++)
			{
				System.out.println("Unesite (" + i + "," + j +") član matrice: ");
				matrica[i][j] = unos.nextInt();
			}
		}
		return matrica;
	}

	
	public static void main(String[] args) {
		int[][] matrica = unosMatrice();
		System.out.println("Suma svih članova matrice po dijagonali: " + sumaClanova(matrica));
		System.out.println("Suma svih članova suprotne dijagonale: " + sumaSuprotneDijagonale(matrica));

	}


}
