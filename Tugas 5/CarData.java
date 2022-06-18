package Tugas5;

import java.util.ArrayList;

public class CarData {
    public ArrayList<Car>  carData = new ArrayList<Car>();

    public void addCar(String carType, String polnum, String merk){
        Car car = new Car(carType,polnum,merk,true);

        carData.add(car);
    }

    public  void listOfCar(){
        System.out.println("------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("------------------------------");
        for (int i = 0; i < carData.size(); i++){
            System.out.println("TIPE MOBIL :"+carData.get(i).getCarType());
            System.out.println("NO POLISI  :"+carData.get(i).getPolNum());
            System.out.println("MERK MOBIL :"+carData.get(i).getMerk());
            System.out.println("------------------------------");
        }

    }
}
