package Tugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String toString(){
        double gaji = getHariKerja() * getJamKerja() * 15;
        double bonusLembur = 0;
        if (getJamKerja() > 7){
            bonusLembur = (getHariKerja() - ((getHariKerja()/7)*2)) * (getJamKerja() - 7) * 7;
        }
        double bonusLibur = 0;
        bonusLibur = (getHariKerja()/7 * 2) * getJamKerja() * 20;
        double bonus = (bonusLembur + bonusLibur * 0.3) + (bonusLembur + bonusLibur);

        double pendapatan = (bonus + gaji + getPendapatan()) + 15;
        return ("Nama: "+ getNama()+"\n"
                +"MIK: "+ getNIK()+"\n"
                +"Jenis Kelamin: "+ isJenisKelamin()+"\n"
                +"Jumlah Pendapatan: "+ pendapatan+ "$"+"\n"
                +"Bonus: "+bonus+"$"+"\n"
                +"Gaji: "+gaji+"$"+"\n"
                +"Status: "+getStatus()+"\n"
                +"Lama Kerja: "+getLamaKerja()+ " "+ "hari")+"\n"
                +"=====================================";
    }
}



