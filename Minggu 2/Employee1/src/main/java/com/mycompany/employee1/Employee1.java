/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee1;

/**
 *
 * @author USER
 */
public class Employee1 {
    private String nip;
    private String nama;
    private String divisi;
    
    public String getNip(){
    return this.nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getNama(){
    return this.nama;
    }
    
        public void setNama(String nama){
    this.nama = nama;
    }
    public String getDivisi(){
    return this.divisi;
    }
    
    public void setDivisi(String divisi){
    this.divisi = divisi;
    }

    
    public static void main(String args[]){
    Employee1 objEmp = new Employee1();
    objEmp.setNip("NIP :11-xx-76");
    System.out.println(objEmp.getNip());
        objEmp.setNama("Nama : Lucky");
    System.out.println(objEmp.getNama());
        objEmp.setDivisi("Divisi : SDM");
    System.out.println(objEmp.getDivisi());
    }
}
