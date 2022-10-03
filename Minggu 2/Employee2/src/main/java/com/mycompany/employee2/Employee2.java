/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee2;

/**
 *
 * @author USER
 */
public class Employee2 {
    private String nip;
    private String nama;
    private String divisi;
    
    public Employee2 (String nip, String nama, String divisi){
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    } 
    
    public String getNip(){
    return this.nip;
    }
    
    public String getNama(){
    return this.nama;
    }
    
    public String getDivisi(){
    return this.divisi;
    }

    
    public static void main(String args[]){
    Employee2 objEmp = new Employee2("11-xx-76", "Lucky", "SDM");
    System.out.println(objEmp.getNip());
    System.out.println(objEmp.getNama());
    System.out.println(objEmp.getDivisi());
    }
}