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
public class Mahasiswa {
    String nama;
    int nim;
    mataKuliah mataKuliah;
    
    public Mahasiswa (String nama, int nim, mataKuliah mataKuliah){
        this.nama = nama;
        this.nim = nim;
        this.mataKuliah = mataKuliah;
    }
    
    public void getNama(String nama){
        this.nama = nama;
    }
    
    public void getNim(int nim){
        this.nim = nim;
    }
    
    public void getMatkul(mataKuliah mataKuliah){
        this.mataKuliah = mataKuliah;
    }
}
