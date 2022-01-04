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
public class mataKuliah {
    mataKuliahWajib mataKuliahWajib;
    Dosen Dosen;
    mataKuliahPilihan matakulPilihan;
    
    public mataKuliah(mataKuliahWajib mataKuliahWajib, Dosen Dosen, mataKuliahPilihan matakulPilihan){
        this.Dosen = Dosen;
        this.matakulPilihan = matakulPilihan;
        this.mataKuliahWajib = mataKuliahWajib;
    }
    
    public void setMatkulWajib(mataKuliahWajib mataKuliahWajib){
        this.mataKuliahWajib = mataKuliahWajib;
    }
    
    public void setMatkulPilihan(mataKuliahWajib mataKuliahWajib){
        this.matakulPilihan = matakulPilihan;
    }
}
