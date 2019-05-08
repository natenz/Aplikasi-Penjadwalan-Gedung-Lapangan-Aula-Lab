package tubespbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User-5
 */
public class Kelas {
    private int jam_mulai,jam_selesai;
    private String nama,kd_ruang,tgl_pinjam;
    private String username;
    
    public Kelas(String username, String nama, String tgl_pinjam,int jam_mulai,int jam_selesai,String kd_ruang){
        this.username = username;
        this.nama=nama;
        this.tgl_pinjam=tgl_pinjam;
        this.jam_mulai=jam_mulai;
        this.jam_selesai=jam_selesai;
        this.kd_ruang=kd_ruang;
    }
    
     public String getusername(){
        return username;
    }
    public String getnama(){
        return nama;
    }
 
    public String gettgl_pinjam(){
        return tgl_pinjam;
    }
    public int getjam_mulai(){
        return jam_mulai;
    }
    public int getjam_selesai(){
        return jam_selesai;
    }
       public String getkd_ruang(){
        return kd_ruang;
    }
}
