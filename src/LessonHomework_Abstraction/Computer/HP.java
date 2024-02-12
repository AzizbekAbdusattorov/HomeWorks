package LessonHomework_Abstraction.Computer;

public class HP extends Computer{
    public HP(String processesModel, double diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    void showInfo() {
        System.out.println("HP Computer:");
        System.out.println("Processor Model: " + processesModel);
        System.out.println("Disk Size: " + diskSize + " GB");
    }
}
