package Tugas6;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String status = "";
        String kCabang = "";
        String kantorCabang = getNIP().substring(0,1);
        if(kantorCabang.equalsIgnoreCase("1")){
            kCabang = "Mondstatd";
        }else if(kantorCabang.equalsIgnoreCase("2")){
            kCabang = "Liyue";
        }else if(kantorCabang.equalsIgnoreCase("3")){
            kCabang = "Inazume";
        }else if (kantorCabang.equalsIgnoreCase("4")){
            kCabang = "Sumure";
        }else if (kantorCabang.equalsIgnoreCase("5")){
            kCabang = "Fontaine";
        }else if (kantorCabang.equalsIgnoreCase("6")){
            kCabang = "Natlan";
        }else if (kantorCabang.equalsIgnoreCase("7")){
            kCabang = "Snezhnaya";
        }

        String cabangKe = getNIP().substring(2,3);

        String dprtmn = " ";
        String departemen = getNIP().substring(6,7);
        if (departemen.equalsIgnoreCase("1")){
            dprtmn = "Pemasaran";
        }else if (departemen.equalsIgnoreCase("2")){
            dprtmn = "Humas";
        }else if (departemen.equalsIgnoreCase("3")) {
            dprtmn = "Riset";
        }else if (departemen.equalsIgnoreCase("4")) {
            dprtmn = "Teknologi";
        }else if (departemen.equalsIgnoreCase("5")) {
            dprtmn = "Personalia";
        }else if (departemen.equalsIgnoreCase("6")) {
            dprtmn = "Akademik";
        }else if (departemen.equalsIgnoreCase("7")) {
            dprtmn = "Administrasi";
        }else if (departemen.equalsIgnoreCase("8")) {
            dprtmn = "Operasional";
        }else if (departemen.equalsIgnoreCase("9")) {
            dprtmn = "Pembangunan";
        }
        status = dprtmn + "," + " " + kCabang + " " + "cabang" + " - " + cabangKe;
        return status;
    }

    public String toString(){
        gaji = getHariKerja() * getJamKerja() * 15;
        double bonusLembur = 0;
        if (getJamKerja() > 7){
            bonusLembur = (getHariKerja() - ((getHariKerja()/7)*2)) * (getJamKerja() - 7) * 7;
        }
        double bonusLibur = 0;
        bonusLibur = (getHariKerja()/7 * 2) * getJamKerja() * 20;
        double bonus = bonusLembur + bonusLibur;

        double pendapatan = bonus + gaji + getPendapatan();
        return ("Nama: "+ getNama()+"\n"
                +"MIK: "+ getNIK()+"\n"
                +"Jenis Kelamin: "+ isJenisKelamin()+"\n"
                +"Jumlah Pendapatan: "+pendapatan+"$"+"\n"
                +"Bonus: "+bonus+"$"+"\n"
                +"Gaji: "+gaji+"$"+"\n"
                +"Status: "+getStatus())+"\n"
                +"=====================================";
    }
}
