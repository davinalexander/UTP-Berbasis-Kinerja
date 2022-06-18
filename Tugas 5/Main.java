package Tugas5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Nama : Deavin Alexander Gareso Tonapa");
        System.out.println("NIM  : 215150700111010");

        System.out.println("");

        CarRider ming = new CarRider("Lin Ming", 19,"08000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "08111111111");
        CarRider ling = new CarRider("Ling'er",31, "08222222222");
        CarRider davin = new CarRider("Davin Alexander", 19, "08123456789");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data.addCar("SEDAN", "N 4444 AB", "Honda");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming,data.carData.get(1),9);
        arsip.Rent(youhan,data.carData.get(0),3);
        arsip.Rent(ling,data.carData.get(2),1);
        arsip.Rent(davin,data.carData.get(3), 12);

        System.out.println("");
        arsip.info();
    }
}
