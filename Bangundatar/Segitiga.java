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
public class Segitiga implements Bangun {
    // Atribut
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    // Constructor
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return this.sisiA + this.sisiB + this.sisiC;
    }
}