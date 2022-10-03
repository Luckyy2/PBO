/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

/**
 *
 * @author USER
 */
public class Latihan3 {
    private int panjang;
    private int lebar;
    
    public Latihan3 (int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int getPanjang(){
    return this.panjang;
    }
    public int getLebar(){
    return this.lebar;
    }
    
   public static void main(String args[]){
       
       Latihan3 bilangan = new Latihan3(4,5);
      
       
       int luas = bilangan.getPanjang() * bilangan.getLebar();
       System.out.println("Luas Persegi panjang:"+luas);
       
       int keliling = 2 * bilangan.getPanjang() + bilangan.getLebar();
       System.out.println("Keliling Persegi panjang:"+keliling);
   }
}
