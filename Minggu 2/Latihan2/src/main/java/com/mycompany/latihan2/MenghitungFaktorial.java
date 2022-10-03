/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

/**
 *
 * @author USER
 */
public class MenghitungFaktorial {
    private int bilangan;
    
    public void setBilangan(int bilangan){
        this.bilangan = bilangan;
    }
    public int getBilangan(){
    return this.bilangan;
    }
    
    public static void main(String args[]){
        int faktorial = 1;
        int i;
        
        MenghitungFaktorial bil = new MenghitungFaktorial();
        bil.setBilangan(2);
        
       for (i = 1; i <= bil.getBilangan(); i++){
                faktorial *= i;
            }
       System.out.println(faktorial);
    }
}




