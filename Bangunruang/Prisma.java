/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangunruang;

import Bangundatar.Segitiga;

/**
 *
 * @author p
 */
public class Prisma extends Segitiga {
    // Atribut tambahan
    private double tinggiPrisma;

    // Constructor
    public Prisma(double alasSegitiga, double tinggiSegitiga, double sisiA, double sisiB, double sisiC, double tinggiPrisma) {
        // Memanggil constructor parent (Segitiga)
        super(alasSegitiga, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggiPrisma = tinggiPrisma;
    }

    // Method untuk menghitung volume
    public double hitungVolume() {
        // Volume = Luas Alas (segitiga) * tinggi prisma
        return super.hitungLuas() * this.tinggiPrisma;
    }

    // Method untuk menghitung luas permukaan
    public double hitungLuasPermukaan() {
        // Rumus: (2 * Luas Alas) + (Keliling Alas * Tinggi Prisma)
        double luasAlas = super.hitungLuas();
        double kelilingAlas = super.hitungKeliling();
        return (2 * luasAlas) + (kelilingAlas * this.tinggiPrisma);
    }
    
}
