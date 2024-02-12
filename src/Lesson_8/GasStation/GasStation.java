package Lesson_8.GasStation;

public class GasStation {
    private int petrolInStation;

    public GasStation(int petrolInStation) {
        this.petrolInStation = petrolInStation;
    }

    public boolean toSell(Car car) {
        if (!car.getOil().isEmpty() && car.getOil().getPetrol() <= petrolInStation) {
            petrolInStation -= car.getOil().getPetrol();
            return true;
        } else {
            return false;
        }
    }

    public void addPetrol(int addValue) {
        petrolInStation += addValue;
    }

    public boolean isSell(Car[] cars) {
        for (Car car : cars) {
            if (!toSell(car)) {
                return false;
            }
         }
        return true;
    }

}
