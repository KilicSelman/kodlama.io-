package odev;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("MÜKEMMEL : GEÇTİNİZ");
			break;
		case 'B':
			System.out.println("İYİ : GEÇTİNİZ");
			break;
		case 'C':
			System.out.println("ORTA : GEÇTİNİZ");
			break;
		case 'D':
			System.out.println("ZOR: GEÇTİNİZ");
			break;
		case 'F':
			System.out.println("MALASEF : KALDINIZ");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}

	}

}
