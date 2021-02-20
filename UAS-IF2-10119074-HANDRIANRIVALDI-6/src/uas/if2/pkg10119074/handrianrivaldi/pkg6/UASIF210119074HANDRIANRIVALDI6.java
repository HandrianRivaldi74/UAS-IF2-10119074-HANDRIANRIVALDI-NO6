/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119074.handrianrivaldi.pkg6;

/**
 *
 * @author Acer
 * NAMA : HANDRIAN RIVALDI
 * KELAS : IF2
 * NIM : 10119074
 * TGL :2/20/2021
 * NO SOAL : 6
 */
public class UASIF210119074HANDRIANRIVALDI6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);

        System.out.println("Value 1 = " + kalkulator.getValue1());
        System.out.println("Value 2 = " + kalkulator.getValue2());
        System.out.println("Hasil Perkalian = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
