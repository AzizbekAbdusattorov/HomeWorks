package Lesson_8.GasStation;

public class Main {
    public static void main(String[] args) {
        Capacity carCapacity = new Capacity(50);
        Oil carOil = new Oil(20);

        Car car = new Car(carCapacity, carOil);

        GasStation gasStation = new GasStation(100);


        boolean isSold = gasStation.toSell(car);

        if (isSold) {
            System.out.println("Mashinaga yoqilg'i sotildi: ");
        } else {
            System.out.println("Mashinaga yoqilg'i sotilmadi: ");
        }

        gasStation.addPetrol(30);

        Car[] cars = {car, new Car(new Capacity(30), new Oil(15))};

        if (gasStation.isSell(cars)) {
            System.out.println("Barcha mashinalar yoqilg'i sotib olishi mumkin: ");
        } else {
            System.out.println("Barcha mashinalar yoqilg'i sotib olishi mumkin emas: ");
        }
    }
}
