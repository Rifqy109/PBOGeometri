/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangunruang;

import Bangundatar.PersegiPanjang;

/**
 *
 * @author p
 */
public class Balok extends PersegiPanjang {
    // Atribut tambahan
    private double tinggi;

    // Constructor
    public Balok(double panjang, double lebar, double tinggi) {
        // Memanggil constructor parent (PersegiPanjang)
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Method untuk menghitung volume
    public double hitungVolume() {
        // Volume = luas alas * tinggi
        // super.hitungLuas() akan memanggil hitungLuas() dari PersegiPanjang
        return super.hitungLuas() * this.tinggi;
    }

    // Method untuk menghitung luas permukaan
    public double hitungLuasPermukaan() {
        // Rumus: 2 * (pl + pt + lt)
        double pl = this.panjang * this.lebar;
        double pt = this.panjang * this.tinggi;
        double lt = this.lebar * this.tinggi;
        return 2 * (pl + pt + lt);
    }
    
}
