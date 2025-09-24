/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangunruang;

import Bangundatar.Lingkaran;

/**
 *
 * @author p
 */
public class Tabung extends Lingkaran {
    // Atribut tambahan
    private double tinggi;

    // Constructor
    public Tabung(double jariJari, double tinggi) {
        // Memanggil constructor parent (Lingkaran)
        super(jariJari);
        this.tinggi = tinggi;
    }

    // Method untuk menghitung volume
    public double hitungVolume() {
        // Volume = luas alas (lingkaran) * tinggi
        return super.hitungLuas() * this.tinggi;
    }

    // Method untuk menghitung luas permukaan
    public double hitungLuasPermukaan() {
        // Rumus: (2 * Luas Alas) + (Keliling Alas * Tinggi)
        double luasAlas = super.hitungLuas();
        double kelilingAlas = super.hitungKeliling();
        return (2 * luasAlas) + (kelilingAlas * this.tinggi);
    }
    
}
