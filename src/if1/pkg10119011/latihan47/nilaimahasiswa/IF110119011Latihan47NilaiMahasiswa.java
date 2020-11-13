/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * Nama     : Reihan Wiyanda
 * Kelas    : IF-1
 * Nim      : 10119011
 */
public class IF110119011Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa mhs = new NilaiMahasiswa();
        mhs.setQuiz(75);
        mhs.setUts(45);
        mhs.setUas(34);
        System.out.println("QUIZ = " + mhs.getQuiz());
        System.out.println("UTS  = " + mhs.getUts());
        System.out.println("UAS  = " + mhs.getUas());
        
        System.out.println();
        
        System.out.println("Nilai Akhir = " + mhs.hitungNilaiAkhir());
        
        System.out.println();
        
        System.out.println("Index = " + mhs.indexNilai(mhs.hitungNilaiAkhir()));
        System.out.println("Keterangan = " + mhs.IndexKeterangan(mhs.indexNilai(mhs.hitungNilaiAkhir())));
    }
    
}
