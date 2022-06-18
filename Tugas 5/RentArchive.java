package Tugas5;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentArchive = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent carRent = new CarRent(rider,car,rentDur);

        rentArchive.add(carRent);

        if (car.isStatus() == true){
            System.out.println("MOBIL BERHASIL DI SEWA");
        }else{
            System.out.println("MAAF, MOBIL SUDAH DI SEWA");
        }
    }

    public void info(){
        System.out.println("------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("------------------------------");
        for (int i = 0; i < rentArchive.size(); i++){
            System.out.println("NAMA PEMINJAM :"+rentArchive.get(i).getRider().getName());
            System.out.println("TIPE MOBIL    :"+rentArchive.get(i).getCar().getCarType());
            System.out.println("NO POLISI     :"+rentArchive.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL   :"+rentArchive.get(i).getRentDur());
            System.out.println("------------------------------");
        }

    }

}
