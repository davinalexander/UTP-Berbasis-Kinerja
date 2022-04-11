package UBFOOD;

import java.util.Scanner;

public class DataMerchant {
    static Scanner scan = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        return new Merchant[]{merchant};
    }

    public static void tampilData() {
        for (Merchant mch1 : merc) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant :" + mch1.getNamaMerchant());
            System.out.println("Nama Produk   :" + mch1.getNamaProduk());
            System.out.println("Harga         :" + (int) mch1.getHargaMakanan());
        }
    }

    public static String cariMerchant(String nama) {
        nama = scan.nextLine();
        System.out.println("Cari Merchant:" + nama);
        if (nama.equals("Bakso")) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant :Bakso Pak Sahid");
            System.out.println("Nama Produk   :" + nama);
            System.out.println("Harga         :8000");
        } else if (nama.equals("Nasi Goreng Jawa")) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant :Nasgor Mblebes");
            System.out.println("Nama Produk   :" + nama);
            System.out.println("Harga         :10000");
        } else if (nama.equals("Ayam Kota Ekstra Nasi")) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant :Ayam Geprek Kak Ros");
            System.out.println("Nama Produk   :" + nama);
            System.out.println("Harga         :10000");
        } else {
            System.out.println("Merchant yang dicari tidak ada!");
        }
        return nama;

    }

    public static void tampilMerchant(Merchant merchant) {

    }


    public static void updateMerchant(Merchant merchant) {
        System.out.println("Update Merchant :"+merchant.getHargaMakanan());

        System.out.println("===Tampilan Data Merchant UBFood===");
        System.out.println("Nama Merchant :" +scan.nextLine());
        System.out.println("Nama Produk   :" +scan.nextLine());
        System.out.println("Harga         :" +merchant.getHargaMakanan());
        }
    }

