/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author amoro
 */
public class Dosen {
    private String nama,kodeDosen;
    
    public Dosen(String nama, String kodeDosen){
        this.nama = nama;
        this.kodeDosen = kodeDosen;
    }
    
    public Meet setMeet(String namaMeet, String linkMeet, String tanggalMeet){
        Meet meet = new Meet(namaMeet,linkMeet,tanggalMeet);
        return meet;
    }
    
    public String getNama(){
        return nama;
    }
    public String getKodeDosen(){
        return kodeDosen;
    }
    
    
}
