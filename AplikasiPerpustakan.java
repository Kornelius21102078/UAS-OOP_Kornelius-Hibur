

package com.mycompany.aplikasiperpustakan;

import java.util.Scanner;

/**
 *
 * @author KorneliusHibur_21102078
 */
public class AplikasiPerpustakan {

    public static void main(String[] args) {
       
       Scanner input = new Scanner (System.in);
    
    System.out.println ("         Masukan Data          ");
    System.out.println ("-------------------------------");
    System.out.print   ("Nama            : ");
    String nama = input.nextLine();
    System.out.print   ("NIM             : ");
    String nim = input.nextLine();
    System.out.print   ("Jumlah Buku     : ");
    int jumlah = input.nextInt();
    System.out.println ();
    
    int total=0;
    int i=0;
    String[] judul= new String[jumlah];   
    int[] jenis = new int[jumlah];
    int[] harga = new int[jumlah];
    
    do{
    Scanner inputarr = new Scanner(System.in);
    System.out.print   ("Judul Buku ke-"+ i+" : ");
    judul[i]= inputarr.nextLine();
    System.out.print ("Jenis Buku <1>Komputer <2>Non Komputer | pilih : ");
    jenis[i] = inputarr.nextInt();
    if(jenis[i]== 1){
    harga[i]= 5000;}
    else if(jenis[i]==2){
    harga[i] = 3000;} 
    i++; 
    }while (i<jumlah);
    System.out.println();
    System.out.println ("-------------------------------");
    System.out.println ("Nama            : "+nama);
    System.out.println ("NIM             : "+nim);
    System.out.println ("-------------------------------");
    System.out.println ("       Buku Yang Dipinjam      ");
    System.out.println ("-------------------------------");
    i=0;
    do{ 
 System.out.println (i+" | "+judul[i]+" | Harga Sewa : "+harga[i]);
 total=total+ harga[i];
 i++;
 }
    while (i<jumlah);
    System.out.println ("-------------------------------");
    System.out.println ("Total Biaya Pinjam "+total);
    }  
    
}

