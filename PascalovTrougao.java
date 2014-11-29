import java.util.Scanner;


public class PascalovTrougao {

	/**
	 * Funkcija ispisuje Pascalov trougao za zadani broj n
	 * @param n
	 */
	
	private static void pascalovTrougao(int n) {
		int broj = 1;
		for (int i=0; i<=n; i++)
		{
			int trenutni = i + 1;
			for (int j=1; j<=i; j++)
			{
				if (j>0)
				{
					broj = broj * (trenutni - j) / j;
				}
				System.out.printf("%3d ", broj);
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
