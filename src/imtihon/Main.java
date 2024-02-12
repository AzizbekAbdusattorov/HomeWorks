package imtihon;

public class Main {
    public static void main(String[] args) {
        PhoneStorage phoneStorage = new PhoneStorage(16, 7);

        System.out.println("Bo'sh xotira : " + phoneStorage.getEmptyStorage() + " GB");

        phoneStorage.addMusic(6);
        phoneStorage.addMusic(10);

        System.out.println("2 GB lik musiqadan 6 ta qo'shish mumkinmi : " + phoneStorage.addMusics(2,6));
        System.out.println("2 GB lik musiqadan 3 ta qo'shish mumkinmi : " + phoneStorage.addMusics(2,3));
    }
}
