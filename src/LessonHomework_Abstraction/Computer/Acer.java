package LessonHomework_Abstraction.Computer;

public class Acer extends Computer{
    public Acer(String processesModel, double diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    void showInfo() {
        System.out.println("Acer Computer:");
        System.out.println("Processor Model: " + processesModel);
        System.out.println("Disk Size: " + diskSize + " GB");
    }
}
