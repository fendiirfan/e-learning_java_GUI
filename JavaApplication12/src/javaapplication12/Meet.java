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
public class Meet {
    private String namaMeet, linkMeet, tanggalMeet;
    
    public Meet(String namaMeet, String linkMeet, String tanggalMeet){
        this.namaMeet = namaMeet;
        this.linkMeet = linkMeet;
        this.tanggalMeet = tanggalMeet;
    }
    
    public void setNamaMeet(String namaMeet){
        this.namaMeet = namaMeet;
    }
    
    public void setLinkMeet(String linkMeet){
        this.linkMeet = linkMeet;
    }
    
    public void setTanggalMeet(String tanggalMeet){
        this.tanggalMeet = tanggalMeet;
    }
    
    public String getLinkMeet(){
        return linkMeet;
    }
    
    public String getTanggalMeet(){
        return tanggalMeet;
    }
    
    public String getNamaMeet(){
        return namaMeet;
    }
    
    
}
