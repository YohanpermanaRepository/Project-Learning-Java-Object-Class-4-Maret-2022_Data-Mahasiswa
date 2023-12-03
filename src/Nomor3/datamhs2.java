package Nomor3;
import java.util.Scanner;

public class datamhs2 {
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
        Scanner input = new Scanner (System.in);
        datamhs2 dm2 = new datamhs2();
        System.out.print("MASUKKAN NAMA  =  ");
        dm2.nama = input.nextLine();
        System.out.print("MASUKKAN NIM  =  ");
        dm2.nim = input.nextLine();
        System.out.print("MASUKKAN PRODI  =  ");
        dm2.prodi = input.nextLine();
        System.out.print("MASUKKAN ALAMAT  =  ");
        dm2.alamat = input.nextLine();
        
        
        dm2.cetak();
                     
    }
}



