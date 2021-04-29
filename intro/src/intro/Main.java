package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "�nternet �ubeye Gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� ikonu");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi ikonu");
		}
		else {
			System.out.println("Dolar e�ittir ikonu");
		}
		
		String kredi1 ="H�zl� Kredi";
		String kredi2 ="Mutlu Emekli Kredisi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="�ift�i Kredisi";
		String kredi5 ="Msb Kredisi";
		String kredi6 ="Meb Kredisi";
		
//		System.out.println(kredi1);
//		System.out.println(kredi2);
//		System.out.println(kredi3);
//		System.out.println(kredi4);
//		System.out.println(kredi5);
//		System.out.println(kredi6);
		
		
		System.out.println("-------------------------");
		
		String[] krediler = 
			{
					"H�zl� Kredi", 				//index 0
					"Mutlu Emekli Kredisi", 	//index 1
					"Konut Kredisi",			//index 2
					"�ift�i Kredisi",			//index 3
					"Msb Kredisi",				//index 4
					"Meb Kredisi",				//index 5
					"K�lt�r Bakanl��� Kredisi"	//index 6
			};
		
		//foreach
		for (String kredi : krediler) {
			//System.out.println(kredi);
		}
		
		System.out.println("-------------------------");
		
			   //start	//condition		//i=i+1
		for(int i = 0; i<krediler.length; i++) {
			//System.out.println(krediler[i]);
		}
		
		// value(de�er) tipler  STACK de �al���r.
		//string, int, float, double de�er tip
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//referance(referans) tipler  HEAP de �al���r.
		//diziler, classlar, interfaceler, abstract classlar referans tip
		int[] sayilar1 = {1, 2, 3, 4, 5};
		int[] sayilar2 = {10, 20, 30, 40, 50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//string char arraydir.
		// array yani referans tip olsa da de�er tip gibi �al���r.
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);

	}

}
