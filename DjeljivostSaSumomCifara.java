import java.util.Scanner;


public class DjeljivostSaSumomCifara {

	/**
	 * Funkcija ispisuje sve brojeve manje od n koji su djeljivi sa sumom svojih cifara
	 * @param n
	 */
	
	public static void djeljiviSaSumom (double n)
	{
		for (double i=n; i>0; i--)
		{	
			double suma = 0;
			double pomocna = i;
			while (pomocna > 1)
			{
				suma += pomocna % 10;
				pomocna = pomocna / 10;
			}
			if (i % suma ==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		djeljiviSaSumom(broj);

	}

}
