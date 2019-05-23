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
public class Ruang {
    
    private String nama,kd_ruang,tgl_pinjam,jam_pinjam;
    private String id_user,id_pinjam;
    
    public Ruang(String id_user, String id_pinjam, String nama, String tgl_pinjam,String kd_ruang, String jam_pinjam) {
        this.id_user = id_user;
        this.id_pinjam= id_pinjam;
        this.nama=nama;
        this.tgl_pinjam=tgl_pinjam;
         this.kd_ruang=kd_ruang;
         this.jam_pinjam=jam_pinjam;
    }
    
     public String getid_user(){
        return id_user;
    }
    public String getid_pinjam(){
        return id_pinjam;
    }
    public String getnama(){
        return nama;
    }
    public String gettgl_pinjam(){
        return tgl_pinjam;
    }
    public String getkd_ruang(){
        return kd_ruang;
    }
    public String getjam_pinjam(){
        return jam_pinjam;
    }
    
    
}
