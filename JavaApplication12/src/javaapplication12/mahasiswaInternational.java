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
public class mahasiswaInternational extends Mahasiswa {
    private String Bahasa;
    private Meet Meet;
    
    public mahasiswaInternational(String nama, int nim, mataKuliah mataKuliah, String Bahasa){
        super(nama,nim,mataKuliah);
        this.Bahasa = Bahasa;
    }
    
    public Meet lihatLinkMeet(){
        return this.Meet;
    }
}
