/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasiperpustakan;

/**
 *
 * @author KorneliusHibur_21102078
 */
public class jenisbuku extends AplikasiPerpustakan{
    
    private String NM, JNS;
    private String NAMA;
    private String JENIS;
    
    public String SetNAMA(String nama){
        return this.NM = nama;
    }
    public String SetJENIS(String jenis){
        return this.JNS;
    }
    private String GetNAMA(){
        return this.NAMA;
    }
    private String GetJENIS(){
        return this.JENIS;
    }
}
