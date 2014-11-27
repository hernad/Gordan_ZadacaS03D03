import java.util.Scanner;


public class PomjeranjeUlijevo {

	/**
	 * Funkcija traži od korisnika da unese dužinu niza, a zatim kreira niz
	 * @return niz
	 */
	
	public static int[] unosNiza ()
	{
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj članova niza: ");
		int broj = unos.nextInt();
		int niz []= new int [broj]; 
		for (int i=0; i<broj; i++)
		{
			System.out.println("Unesite " + (i+1) + " član niza: ");
			niz[i]=unos.nextInt();
		}
		return niz;
	}
	
	/**
	 * Funkcija pomjera sve čanove niza ulijevo za zadani niz
	 * @param niz
	 * @return niz
	 */
	
	public static int[] pomjeriLijevo(int[] niz)
	{
		int duzina = niz.length;
		int i = 0;
		while (i < duzina-1)
		{
			niz[i]=niz[i+1];
			i++;
		}
		niz[duzina-1]=0;
		return niz;
	}
	
	public static void main(String[] args) {
		int[] array = unosNiza();
		array = pomjeriLijevo(array);
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}

}
