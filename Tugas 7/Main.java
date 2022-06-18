package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("===============PEGAWAI TETAP===============");
        Pegawai pegawai1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(pegawai1.toString());
        System.out.println();
        Pegawai pegawai2 = new PegawaiTetap("Ahmad", "350728490327424892341", 2500000);
        System.out.println(pegawai2.toString());
        System.out.println();
        Pegawai pegawai3 = new PegawaiTetap("Cecep", "350728490327424892340", 3000000);
        System.out.println(pegawai3.toString());

        System.out.println(" ");

        System.out.println("===============PEGAWAI HARIAN===============");
        Pegawai pegawai4 = new PegawaiHarian("Edo", "350728490327424892343", 8500, 40);
        System.out.println(pegawai4.toString());
        System.out.println();
        Pegawai pegawai5 = new PegawaiHarian("Firman", "350728490327424892345", 9000, 50);
        System.out.println(pegawai5.toString());
        System.out.println();
        Pegawai pegawai6 = new PegawaiHarian("Garry", "350728490327424892346", 10000, 45);
        System.out.println(pegawai6.toString());

        System.out.println();

        System.out.println("===============SALES===============");
        Pegawai pegawai7 = new Sales("Tika", "350728490327424892344", 50, 50000);
        System.out.println(pegawai7.toString());
        System.out.println();
        Pegawai pegawai8 = new Sales("Udin", "350728490327424892347", 40, 40000);
        System.out.println(pegawai8.toString());
        System.out.println();
        Pegawai pegawai9 = new Sales("Siti", "350728490327424892348", 45, 60000);
        System.out.println(pegawai9.toString());



    }
}
