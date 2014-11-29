import java.util.Scanner;


public class BinarniBroj {
	
	/**
	 * Funkcija prima cijeli broj i vraća njegov binarni broj u obliku stringa
	 * @param broj
	 * @return okreni
	 */
	
	private static String pretvoriUBinarni(int broj) {
		String binarni = "";
		String okreni="";
		if (broj > 0)
		{
			while (broj != 0)
			{
				if (broj % 2 == 0)
				{
					binarni += "0";
				}
				else
				{
					binarni += "1"; 
				}
				broj = broj/2;
			}
		}
		else
		{
			while (broj != 0)
			{
				if (broj % 2 == 0)
				{
					binarni += "1";
				}
				else
				{
					binarni += "0"; 
				}
				broj = broj/2;
			}
		}
			
		for (int i=binarni.length()-1; i>=0; i--)
		{
			okreni += binarni.charAt(i);
		}
		return okreni;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite jedan broj: ");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		String binarni = pretvoriUBinarni(broj);
		System.out.println(binarni);
	}

}
