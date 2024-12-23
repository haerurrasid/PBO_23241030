package com.tutorial;

public class Main {
    public static void main(String[] args) {
        
        // objek
        Persegi persegi = new Persegi(8);
        System.out.println("Luas Persegi : " + persegi.luas() + "\nKeliling Persegi : " + persegi.keliling());

        PersegiPanjang psgpnjng = new PersegiPanjang(5, 10);
        System.out.println("Luas Persegi Panjang : " + psgpnjng.luas() + "\nKeliling Persegi Panjang : " + psgpnjng.keliling());

        Lingkaran lingkaran = new Lingkaran(3);
        System.out.println("Luas Lingkaran : " + lingkaran.luas() + "\nKeliling Lingkaran : " + lingkaran.keliling());

        Segitiga segitiga = new Segitiga(6, 10);
        System.out.println("Luas Segitiga : " + segitiga.luas() + "\nKeliling Segitiga : " + segitiga.keliling());

    }
}
