/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan2;

/**
 *
 * @author USER
 */
public class MenghitungRata{
    private int angka1;
    private int angka2;
    private int angka3;
    
    public void setAngka1(int angka1){
        this.angka1 = angka1;
    }
    public int getAngka1(){
    return this.angka1;
    }
    public void setAngka2(int angka2){
        this.angka2 = angka2;
    }
    public int getAngka2(){
    return this.angka2;
    }
    public void setAngka3(int angka3){
        this.angka3 = angka3;
    }
    public int getAngka3(){
    return this.angka3;
    }
    

    public static void main(String[] args) {
        int jumlah;
        int rataRata;
        
        MenghitungRata objAngka = new MenghitungRata();
        objAngka.setAngka1(10);
        objAngka.setAngka2(20);
        objAngka.setAngka3(30);
        
        jumlah = objAngka.getAngka1() + objAngka.getAngka2() + objAngka.getAngka3();
        rataRata = jumlah / 3;
        System.out.println(rataRata);
    }
}