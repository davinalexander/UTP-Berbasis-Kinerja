package Tugas6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("===============MANUSIA===============");
        Manusia man1 = new Manusia("Aku", "3923842934", true, true);
        System.out.println(man1.toString());
        Manusia man2 = new Manusia("Ahmad", "3456234876", true, false );
        System.out.println(man2.toString());
        Manusia man3 = new Manusia("Jessica", "3509456723", false, false);
        System.out.println(man3.toString());

        System.out.println(" ");

        System.out.println("===============MAHASISWA FILKOM===============");
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "3519238482", false, false, "205150601111018", 3.70);
        System.out.println(mhs1.toString());
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Robert", "3345689023", true, false, "215150600111009", 3.80);
        System.out.println(mhs2.toString());
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Kenny Angel", "3256745198", false, false, "193130202111003", 3.30);
        System.out.println(mhs3.toString());

        System.out.println(" ");

        System.out.println("===============PEKERJA===============");
        Pekerja pekerja1 = new Pekerja(7, 22, "395102439283", "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.toString());
        Pekerja pekerja2 = new Pekerja(9, 22, "642351674301", "Stephen Curry", "34567123456", true, true );
        System.out.println(pekerja2.toString());
        Pekerja pekerja3 = new Pekerja(8, 22, "227678535122", "Lebron James", "3098765456", true, true);
        System.out.println(pekerja3.toString());

        System.out.println(" ");

        System.out.println("===============MANAJER===============");
        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.toString());
        Manajer manajer2 = new Manajer(7, 20, "113567134034", "Eric Marcel", "3245612398", true, true, 1400);
        System.out.println(manajer2.toString());
        Manajer manajer3 = new Manajer(8, 22, "43415632199", "Heni Widianti", "3245123471", false,true,1300);
        System.out.println(manajer3.toString());



    }
}
