/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Bangundatar.Lingkaran;
import Bangundatar.Persegi;
import Bangundatar.PersegiPanjang;
import Bangundatar.Segitiga;
import Bangunruang.Balok;
import Bangunruang.Kubus;
import Bangunruang.Prisma;
import Bangunruang.Tabung;
/**
 *
 * @author p
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("--- BANGUN DATAR ---");

        // 1. Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        System.out.println("\nPersegi Panjang (p=10, l=5)");
        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());

        // 2. Persegi (anak dari PersegiPanjang)
        Persegi p = new Persegi(7);
        System.out.println("\nPersegi (sisi=7)");
        System.out.println("Luas: " + p.hitungLuas());
        System.out.println("Keliling: " + p.hitungKeliling());

        // 3. Lingkaran
        Lingkaran l = new Lingkaran(10);
        System.out.println("\nLingkaran (r=10)");
        System.out.println("Luas: " + l.hitungLuas());
        System.out.println("Keliling: " + l.hitungKeliling());
        
        // 4. Segitiga (siku-siku 3, 4, 5)
        Segitiga s = new Segitiga(3, 4, 3, 4, 5);
        System.out.println("\nSegitiga (alas=3, tinggi=4, sisi=3,4,5)");
        System.out.println("Luas: " + s.hitungLuas());
        System.out.println("Keliling: " + s.hitungKeliling());
        
        System.out.println("\n--- BANGUN RUANG (Inherit dari Bangun Datar) ---");

        // 1. Balok
        Balok balok = new Balok(5, 4, 10);
        System.out.println("\nBalok (p=5, l=4, t=10)");
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());
        System.out.println("Volume: " + balok.hitungVolume());

        // 2. Kubus
        Kubus kubus = new Kubus(6);
        System.out.println("\nKubus (sisi=6)");
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
        System.out.println("Volume: " + kubus.hitungVolume());

        // 3. Tabung
        Tabung tabung = new Tabung(7, 10);
        System.out.println("\nTabung (r=7, t=10)");
        System.out.println("Luas Permukaan: " + tabung.hitungLuasPermukaan());
        System.out.println("Volume: " + tabung.hitungVolume());

        // 4. Prisma Segitiga
        Prisma prisma = new Prisma(6, 8, 6, 8, 10, 15);
        System.out.println("\nPrisma Segitiga (alas segitiga=6, tinggi segitiga=8, tinggi prisma=15)");
        System.out.println("Luas Permukaan: " + prisma.hitungLuasPermukaan());
        System.out.println("Volume: " + prisma.hitungVolume());
    }
}