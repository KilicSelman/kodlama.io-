package odev;

public class arraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1  ="Selman" ;
		String ogrenci2 ="Suheyl" ;
		String ogrenci3 = "Faruk" ;
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Selman";
		ogrenciler[1] = "Suheyl";
		ogrenciler[2] = "Faruk";
				
		for (int i=0; i< ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			
			
		}
		
	}

}
