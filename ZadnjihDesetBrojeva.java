import java.util.Scanner;


public class ZadnjihDesetBrojeva {

	/**
	 * Funkcija traži unos brojeva i vraća niz od zadnjih 10 brojeva koje je korisnik unio.
	 * @return niz2
	 */
	
	public static int[] unosBrojeva()
	{
		int[] niz1 = new int [1000];
		int[] niz2 = new int [10];
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		int brojClanova=0;
		while (broj != -1)
		{	
				System.out.println("Unesite broj: ");
				broj = unos.nextInt();
				if (broj!=-1)
				{
					niz1[brojClanova] = broj;
					brojClanova++;
				}
		}
		for (int i=0; i<10; i++)
		{
			niz2[i]=niz1[brojClanova-10+i];
			
		}
		return niz2;
	}
	
	public static void main(String[] args) {
		int[] array = unosBrojeva();
		for (int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
