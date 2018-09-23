/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan6.kambingstaticdanmamalia;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program ini berisi program menampilkan proses
 * variabel yang bervariabel static & konstanta
 */
public class PBO310117121Latihan6KambingStaticDanMamalia {

    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "endang";

    public static void main(String[] args) {
        mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                            + mamalia.jumlahKambing);
    }
    
}
