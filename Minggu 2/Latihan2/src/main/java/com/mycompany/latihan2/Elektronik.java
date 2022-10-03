/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

/**
 *
 * @author USER
 */
public class Elektronik {
    private String namaBarang;
    private String panjangBarang;
    private String warnaBarang;
    
    public Elektronik (String namaBarang,String panjangBarang,String warnaBarang){
        this.namaBarang = namaBarang;
        this.panjangBarang = panjangBarang;
        this.warnaBarang = warnaBarang;
    }
    public String getNamaBarang(){
    return this.namaBarang;
    }
    
    public String getPanjangBarang(){
    return this.panjangBarang;
    }
    
    public String getWarnaBarang(){
    return this.warnaBarang;
    }
    
    public static void main(String args[]){
        Elektronik barang = new Elektronik("Handphone","10 cm","merah");
        System.out.println("Nama Barang:"+barang.getNamaBarang());
        System.out.println("Panjang Barang:"+barang.getPanjangBarang());
        System.out.println("Warna Barang:"+barang.getWarnaBarang());
    }
    } 
