package com.company;

public class PegawaiTetap extends Pegawai {
    private double upah;


    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji(){
        double pendapatan = getUpah();
        return pendapatan;
    }

    @Override
    public String toString(){
        return ("Pegawai Tetap     : "+getNama()+"\n"
                +super.toString()+"\n"
                +"Upah              : "+getUpah()+"\n"
                +"Pendapatan        : Rp" + " " + (int) gaji());
    }
}
