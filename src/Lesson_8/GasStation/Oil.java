package Lesson_8.GasStation;

public class Oil {
    private int petrol;

    public Oil(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    public void addPetrol(int addValue) {
        petrol += addValue;
    }

    public boolean isEmpty() {
        return petrol == 0;
    }

}
