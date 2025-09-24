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
public class Lingkaran implements Bangun {
    // Atribut
    protected double jariJari;

    // Constructor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return Math.PI * this.jariJari * this.jariJari;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * Math.PI * this.jariJari;
    }
    
}
