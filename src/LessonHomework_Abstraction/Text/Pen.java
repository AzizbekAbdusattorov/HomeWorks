package LessonHomework_Abstraction.Text;

public class Pen {
    private Color color;
    private TextStyle style;

    public Pen(Color color, TextStyle style) {
        this.color = color;
        this.style = style;
    }

    public void write(String text) {
        System.out.println("Writing with " + color.getName() + " color and " + style.getStyle() + " style: " + text);
    }
}
