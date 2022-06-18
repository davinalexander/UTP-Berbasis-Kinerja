package Tugas6;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String status = "";
        String angktn = "";
        String angkatan = getNIM().substring(0,2);
        if (angkatan.equalsIgnoreCase("19")){
            angktn = "2019";
        }else if (angkatan.equalsIgnoreCase("20")){
            angktn = "2020";
        }else if (angkatan.equalsIgnoreCase("21")){
            angktn = "2021";
        }

        String prOdi = "";
        String prodi = getNIM().substring(6,7);
        if(prodi.equalsIgnoreCase("2")){
            prOdi = "Teknik Meniup Gelembung";
        }else if (prodi.equalsIgnoreCase("3")){
            prOdi = "Teknik Berburu Ubur Ubur";
        }else if (prodi.equalsIgnoreCase("4")){
            prOdi = "Sistem Perhamburgeran";
        }else if (prodi.equalsIgnoreCase("6")){
            prOdi = "Pendidikan Chum Bucket";
        }else if (prodi.equalsIgnoreCase("7")){
            prOdi = "Teknologi Telepon Kerang";
        }
        status = prOdi +","+ " " + angktn;
        return status;
    }

    public double getBeasiswa(){
        double beasiswa = 0;
        if (IPK <= 3.5){
            beasiswa = getPendapatan() + 50 ;
        }else if (IPK <= 4){
            beasiswa = getPendapatan() + 75 ;
        }
        return beasiswa;
    }

    public String toString(){
        return ("Nama: "+ getNama()+"\n"
                +"MIK: "+ getNIK()+"\n"
                +"Jenis Kelamin: "+ isJenisKelamin()+"\n"
                +"Jumlah Pendapatan: "+getBeasiswa()+"$"+"\n"
                +"IPK: "+getIPK()+"\n"
                +"NIM: "+getNIM()+"\n"
                +"Status: "+getStatus())+"\n"
                +"=====================================";
    }
}
