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
public class mahasiswaRegular extends Mahasiswa {
    Meet Meet;
    
    public mahasiswaRegular(String nama, int nim, mataKuliah mataKuliah){
        super(nama,nim,mataKuliah);
    }
    
    public void lihatLinkMeet(Meet Meet){
        this.Meet = Meet;
    }
    
}
