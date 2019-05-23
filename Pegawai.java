/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesbasdat;

/**
 *
 * @author Nata
 */
public class Pegawai {
    private String id_pegawai, nama_pegawai, pertanggungjawaban;
    
    public Pegawai(String idpegawai, String nama, String tnggungjawab) {
        this.id_pegawai = idpegawai;
        this.nama_pegawai= nama;
        this.pertanggungjawaban=tnggungjawab;
    }
    
     public String getid_pegawai(){
        return id_pegawai;
    }
    public String getnama_pegawai(){
        return nama_pegawai;
    }
    public String getpertanggungjawaban(){
        return pertanggungjawaban;
    }
}
