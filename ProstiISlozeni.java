package lab12;

import java.util.Scanner;

public class ProstiISlozeni {
/**
 * Funkcija kreira jedan niz
 * @return niz
 */
	public static int[] kreirajNiz()
	{
		System.out.println("Unesite broj članova niza: ");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		int[] niz = new int [broj];
		for (int i=0; i<broj; i++)
		{
			System.out.println("Unesite " + (i+1) + ". član niza: ");
			niz[i] = unos.nextInt();
		}
		return niz;
	}
	
	/**
	 * Funkcija kreira dva niza, jedan sa prostim brojevima, drugi sa složenim
	 * @param niz
	 */
	
	private static void prostiISlozeni(int[] niz) {
		int[] prosti = new int[niz.length];
		int[] slozeni = new int[niz.length];
		for (int i=0; i<niz.length; i++)
		{
			int slozenost = 0;
			for (int j=2; j<niz[i]; j++)
			{
				if (niz[i] % j == 0)
				{
					slozenost++;
				}
			}
			if (slozenost != 0)
			{
				slozeni[i] = niz[i];
			}
			else
			{
				prosti[i] = niz[i];
			}
		}
		System.out.println("Prosti brojevi: ");
		for (int i=0; i<prosti.length; i++)
		{
			if(prosti[i] != 0)
			{
				System.out.print(prosti[i] + " ");
		
			}
		}
		System.out.println();
		System.out.println("Složeni brojevi: ");
		for (int i=0; i<slozeni.length; i++)
		{
			if (slozeni[i] != 0)
			{
				System.out.print(slozeni[i] + " ");
		
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] niz = kreirajNiz();
		prostiISlozeni(niz);

	}

}
