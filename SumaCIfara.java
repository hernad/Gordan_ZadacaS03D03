import java.util.Scanner;


public class SumaCIfara {

	/**
	 * Funckija računa sumu cifara jednog broja
	 * @param n
	 * @return suma
	 */
	
	public static int sumaCifara (int n)
	{
		int suma = 0;
		while (n != 0)
		{
			suma += n%10;
			n = n / 10;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite broj: ");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		System.out.println("Suma cifara broja " + broj + " je: " + sumaCifara(broj));

	}

}
