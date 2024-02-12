package LessonHomework_Abstraction.Computer;

public abstract class Computer {
    protected String processesModel; // Protsessor modeli
    protected double diskSize; // Disk hajmi

    public Computer(String processesModel, double diskSize) {
        this.processesModel = processesModel;
        this.diskSize = diskSize;
    }

    abstract void showInfo();
}
