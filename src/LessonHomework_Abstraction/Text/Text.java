package LessonHomework_Abstraction.Text;

public class Text {
    private Pen pen;
    private StringBuilder content;

    public Text(Pen pen) {
        this.pen = pen;
        this.content = new StringBuilder();
    }

    public void add(String line) {
        content.append(line).append("\n");
    }

    public void show() {
        pen.write(content.toString());
    }

    public int count() {
        return content.toString().split("\n").length;
    }

    public void clear() {
        content = new StringBuilder();
    }

    public boolean removeLine() {
        if (content.length() == 0) {
            return false;
        }

        int lastNewLineIndex = content.lastIndexOf("\n");
        if (lastNewLineIndex != -1) {
            content.delete(lastNewLineIndex, content.length());
            return true;
        }

        return false;
    }
}
