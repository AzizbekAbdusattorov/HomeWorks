package LessonHomework_Abstraction.Text;

public class Main {
    public static void main(String[] args) {
        Color red = new Color("Red");
        TextStyle bold = new TextStyle("Bold");
        Pen redBoldPen = new Pen(red, bold);

        Text text = new Text(redBoldPen);

        // Testing Text class methods
        text.add("Hello");
        text.add("World!");
        System.out.println("Line count: " + text.count());
        text.show();

        text.removeLine();
        System.out.println("After removing a line:");
        text.show();

        text.clear();
        System.out.println("After clearing the text:");
        text.show();
    }
}
