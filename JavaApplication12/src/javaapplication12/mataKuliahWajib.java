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
public class mataKuliahWajib {
    String namaMataKuliah;
    Dosen Dosen;
    
    public mataKuliahWajib(String mataKuliah, Dosen Dosen){
        this.namaMataKuliah = mataKuliah;
        this.Dosen = Dosen;
    }
    
    public void getMatakuliah(String namaMataKuliah){
        this.namaMataKuliah = namaMataKuliah;
    }
    
    public void getDosen (Dosen Dosen){
        this.Dosen = Dosen;
    }
}
