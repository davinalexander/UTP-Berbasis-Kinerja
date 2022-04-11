package praktikum;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jnis = scan.nextLine();
        int jmlah = scan.nextInt();
        Baju bju = new Baju(jnis,jmlah);

        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.println("Baju yang akan anda beli bertipe :" +jnis);
        System.out.println("Jumlah Baju yang akan anda beli adalah :" +jmlah);

        bju.display();
    }
}

class  Baju{
    String jenis;
    int harga;
    int jumlah;

     Baju (String a, int b){
         jenis = a;
         jumlah = b;

    }

     final int bajua = 100000;
     final int bajub = 125000;
     final int bajuc = 175000;

    void hargaa(){
            if(jumlah > 100){
                harga = 95000;
            }else{
                harga = bajua;
            }
        }
    void hargab(){
        if(jumlah > 100){
            harga = 120000;
        }else {
            harga = bajub;
        }
    }
    void hargac(){
        if (jumlah > 100) {
            harga = 160000;
        }else{
            harga = bajuc;
        }
    }
    void display(){
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli : "+jenis);
        System.out.println("Harga per buah       : "+harga );
        System.out.println("Total harga          : "+harga * jumlah);
    }
}
