package Tugas6;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        if (jenisKelamin== true){
            System.out.println("Laki-laki");
        }else if (jenisKelamin == false){
            System.out.println("Perempuan");
        }
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
       this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        double tunjangan = 0;
        if (jenisKelamin == true ) {
            tunjangan = tunjangan + 25;
        }else {
            tunjangan = tunjangan + 20;
        }
        return tunjangan;
    }

    public double getPendapatan(){
        double pendapatan = 0;
        if (menikah == false){
            pendapatan = pendapatan + 15;
        }else {
            pendapatan = getTunjangan();
        }
        return pendapatan;
    }

    public String toString(){
        return ("Nama: "+ getNama()+"\n"
                +"MIK: "+ getNIK()+"\n"
                +"Jenis Kelamin: "+ isJenisKelamin()+"\n"
                +"Jumlah Pendapatan: "+  getPendapatan() + "$")+"\n"
                +"=====================================";

    }

}

