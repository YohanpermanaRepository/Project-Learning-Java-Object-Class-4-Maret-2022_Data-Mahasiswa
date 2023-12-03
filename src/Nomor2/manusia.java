// 210441100052 YOHAN PERMANA
package Nomor2;
public class manusia{
    String nama ;
    int umur ;
    String alamat ;
    
    void datadiri (){
        System.out.println("NAMA = " + nama);
        System.out.println("UMUR = " + umur);
        System.out.println("ALAMAT = " + alamat);
    }
    
    void berjalan(){
        System.out.println("BERJALAN LAMBAT ");
    }
    void berlari(){
        System.out.println("BERLARI KENCANG ");
    }
    public static void main(String[] args) {
        manusia sehat = new manusia ();
        sehat.nama = "Yohan Permana";
        sehat.umur = 19 ;
        sehat.alamat = "Kampung Pesilat no 22 Madiun";
        
        sehat.datadiri();
        sehat.berlari();
        
        manusia sakit = new manusia ();
        sakit.nama = "Lansia";
        sakit.umur = 99 ;
        sakit.alamat = "Jalan Patimura no 33 pancoran" ;
         
        sakit.datadiri();
        sakit.berjalan();
    }
}
