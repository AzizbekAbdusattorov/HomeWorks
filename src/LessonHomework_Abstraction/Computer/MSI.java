package LessonHomework_Abstraction.Computer;

public class MSI extends Computer{
    public MSI(String processesModel, double diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    void showInfo() {
        System.out.println("MSI Computer:");
        System.out.println("Processor Model: " + processesModel);
        System.out.println("Disk Size: " + diskSize + " GB");
    }
}
