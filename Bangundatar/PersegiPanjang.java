/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangundatar;
import Bangun.Bangun;
/**
 *
 * @author p
 */
public class PersegiPanjang implements Bangun {
    // Atribut
    protected double panjang;
    protected double lebar;

    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}