/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok_tabung;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		try (Scanner menuSc = new Scanner(System.in)) {
			Scanner hitungSc = new Scanner(System.in);
			int inputMenu;
               

			do {
				System.out.println("Menu ");
				System.out.println(
						"1. Balok \n2. Tabung \n");
				System.out.print("Pilih : ");
				inputMenu = menuSc.nextInt();

				switch (inputMenu) {
					case 1 -> Balok(hitungSc);
                                        case 2 -> Tabung(hitungSc);
				}
                           
				if (inputMenu != 0) {
				
				}
			} while (inputMenu != 0);
		}
	}

	private static void Tabung(Scanner hitungSc) {
		double r, t;

		// Input
		

		System.out.print("Input Jari-jari :");
		r = hitungSc.nextDouble();

		System.out.print("Input Tinggi : ");
		t = hitungSc.nextDouble();

		hitungTabung(r, t);
	}

	private static void hitungTabung(double r, double t) {
		Tabung tabung  = new Tabung(r, t);
                Lingkaran lingkaran = new Lingkaran (r );

		// Hasil
		
		System.out.println("Volume Tabung: " + tabung.volume());
		System.out.println("Luas Tabung: " + tabung.luasPermukaan());
                System.out.println("Luas Lingkaran: " + lingkaran.luas());
		System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
	}
       
        private static void Balok(Scanner hitungSc) {
		double p, l, t;

		// Input
		

		System.out.print("Input Panjang :");
		p = hitungSc.nextDouble();

		System.out.print("Input Lebar : ");
		l = hitungSc.nextDouble();
                
                System.out.print("Input Tinggi : ");
		t = hitungSc.nextDouble();

		hitungBalok(p, l ,t);
	}

	private static void hitungBalok(double p, double l,double t) {
		Balok balok = new Balok(p, l, t);
                PersegiPanjang PersegiPanjang = new PersegiPanjang (p, l);

		// Hasil
		
		System.out.println("Volume Balok: " + balok.volume());
		System.out.println("Luas Balok: " + balok.luasPermukaan());
                System.out.println("Luas Persegi Panjang: " + PersegiPanjang.luas());
		System.out.println("Keliling Persegi Panjang: " + PersegiPanjang.keliling());
	}
        
    
    }

   


    
	
    
  