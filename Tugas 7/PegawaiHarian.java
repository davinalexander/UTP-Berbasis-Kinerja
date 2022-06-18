package com.company;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double pendapatan = 0;
        int jamKerjaNormal = 40;
        if (getTotalJam() <= 40) {
            pendapatan = getUpahPerJam() * getTotalJam();
        } else if (getTotalJam() > 40) {
            int jam = getTotalJam() - jamKerjaNormal;
            pendapatan = (getTotalJam() * getUpahPerJam()) + (jam) * getUpahPerJam() * 1.5;
        }
        return pendapatan;
    }

    @Override
    public String toString(){
        return ("Pegawai Harian    : "+getNama()+"\n"
                +super.toString()+"\n"
                +"Upah/jam          : Rp" + " " +getUpahPerJam()+"\n"
                +"Total jam kerja   : "+getTotalJam()+"\n"
                +"Pendapatan        : Rp" + " " + (int) gaji());

    }

}
