package com.company;

import java.util.Scanner;

public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }


    public String toString(){
        return ("No. KTP           : "+getNoKTP());

    }
    public double gaji(){
        double pendapatan = 0;
        return pendapatan;
    }

}
