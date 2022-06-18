package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        Magician magic = new Magician(10,60,100);
        Healer heal = new Healer(10,10,70);
        Warrior warr = new Warrior(30,25,80);
        Titan ttan = new Titan(0,45,200);

        System.out.println("Selamat datang di game Defense FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = scan.nextLine();

        int pilih = 0;

        do {
            try {
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] karakter = {"1. Magician", "2. Healer", "3. Warrior"};
                for (String hero : karakter){
                    System.out.println(hero);
                }
                pilih = scan.nextInt();

                if (pilih > 3) throw new NumberFormatException();
            }catch (Exception e){
                if (e instanceof NumberFormatException){
                    System.out.println("Nomor yang Anda masukkan tidak sesuai");
                }
                else {
                    System.out.println("Tolong masukkan angka");
                    scan.nextLine();
                }
            }
        }while (pilih == 0);
        System.out.println("Selamat datang, " + nama);

        switch (pilih){
            case 1 :
             int i = 1;
             magic.info();
             while (magic.getHP() != 0 && ttan.getHP() != 0){
                 System.out.println("============" + " " + "TURN" + " " + i + " " + "============");

                 if (magic.attack()){
                     ttan.receiveDamage(magic.getAttack());
                 }
                 if (ttan.attack()){
                     magic.receiveDamage(ttan.getAttack());
                 }

                 System.out.println("Enemy's HP     : " +ttan.getHP());
                 System.out.println(nama +"'s HP    : " +magic.getHP());
                 i++;
             }
                System.out.println("=================================");

                if (magic.getHP() == 0){
                    System.out.println("Titan Menang");
                }else if (ttan.getHP() == 0){
                    System.out.println(nama + "Menang");
                }

                System.out.println(" ");

                System.out.println("============ PLAYER ============");
                magic.info();
                System.out.println(" ");
                System.out.println("============ MUSUH ============");
                ttan.info();
                break;

            case 2 :
                int j = 1;
                heal.info();
                while (heal.getHP() != 0 && ttan.getHP() != 0){
                    System.out.println("============" + " " + "TURN" + " " + j + " " + "============");

                    if (j % 2 == 0){
                        System.out.println("Menggunakan skill heal");
                        heal.Heal();
                    }
                    if (heal.attack()){
                        ttan.receiveDamage(heal.getAttack());
                    }
                    if (ttan.attack()){
                        heal.receiveDamage(ttan.getAttack());
                    }

                    System.out.println("Enemy's HP     : " +ttan.getHP());
                    System.out.println(nama +"'s HP    : " +heal.getHP());
                    j++;
                }
                System.out.println("=================================");

                if (heal.getHP() == 0){
                    System.out.println("Titan Menang");
                }else if (ttan.getHP() == 0){
                    System.out.println(nama + "Menang");
                }

                System.out.println(" ");

                System.out.println("============ PLAYER ============");
                heal.info();
                System.out.println(" ");
                System.out.println("============ MUSUH ============");
                ttan.info();
                break;

            case 3 :
                int k = 1;
                warr.info();
                while (warr.getHP() != 0 && ttan.getHP() != 0){
                    System.out.println("============" + " " + "TURN" + " " + k + " " + "============");

                    if (warr.attack()){
                        ttan.receiveDamage(warr.getAttack());
                    }
                    if (ttan.attack()){
                        warr.receiveDamage(ttan.getAttack());
                    }

                    System.out.println("Enemy's HP     : " +ttan.getHP());
                    System.out.println(nama +"'s HP    : " +warr.getHP());
                    k++;
                }
                System.out.println("=================================");

                if (warr.getHP() == 0){
                    System.out.println("Titan Menang");
                }else if (ttan.getHP() == 0){
                    System.out.println(nama + "Menang");
                }

                System.out.println(" ");

                System.out.println("============ PLAYER ============");
                warr.info();
                System.out.println(" ");
                System.out.println("============ MUSUH ============");
                ttan.info();
                break;
        }
    }
}
