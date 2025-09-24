/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangunruang;

import Bangundatar.Persegi;

/**
 *
 * @author p
 */
public class Kubus extends Persegi {
    // Constructor
    public Kubus(double sisi) {
        // Memanggil constructor parent (Persegi)
        super(sisi);
    }

    // Method untuk menghitung volume
    public double hitungVolume() {
        // Volume = sisi * sisi * sisi
        return this.panjang * this.panjang * this.panjang; // panjang dari parent
    }

    // Method untuk menghitung luas permukaan
    public double hitungLuasPermukaan() {
        // Luas permukaan = 6 * luas sisi (persegi)
        // super.hitungLuas() akan memanggil hitungLuas() dari Persegi
        return 6 * super.hitungLuas();
    }
}
