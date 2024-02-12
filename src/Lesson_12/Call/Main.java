package Lesson_12.Call;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(10.0);

        client.addSum(20.0);
        System.out.println("Client active: " + client.isActive());

        client.call(5);
        System.out.println("Client active after call: " + client.isActive());

        client.sms(10);
        System.out.println("Client active after SMS: " + client.isActive());

    }
}
