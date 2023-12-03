// 210441100052 YOHAN PERMANA
package Nomor1;

public class datamhs {
    String nama ;
    String nim ;
    String prodi ;
    String alamat ;
    
    void cetak (){
        System.out.println("NAMA MAHASISWA = " +nama);
        System.out.println("NIM = " + nim);
        System.out.println("PRODI = " + prodi);
        System.out.println("ALAMAT = " + alamat);
        
    }
    
    public static void main(String[] args) {
        datamhs dm = new datamhs ();
        dm.nama = "YOHAN PERMANA";
        dm.nim = "210441100052";
        dm.prodi = "SISTEM INFORMASI" ;
        dm.alamat = "Kampung Pesilat no 22 Madiun";
                
        dm.cetak();
                        
    }
    
}




