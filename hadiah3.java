import java.util.Scanner;

class hadiah3 {
	public static void main (String args[]){
		System.out.println("Konversi Celcius ke Farenheit");
		Scanner celcius = new Scanner (System.in);
		System.out.print("Suhu Celcius: ");
			float c = celcius.nextInt();
		float f = c*9/5+32;
		System.out.println(c + "  C adalah " + f + " F");
		
		System.out.println("-----------------------------");
		System.out.println("Hitung luas lingkaran");
		Scanner jari = new Scanner (System.in);
		System.out.print("Jari-jari lingkaran: ");
			float r = jari.nextInt();
		float luas = 3.14f*r*r;
		System.out.println("Luas lingkaran : " + luas);	
	}
}