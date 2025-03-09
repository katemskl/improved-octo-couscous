import codedraw.CodeDraw;
import codedraw.Corner;
import codedraw.Palette;

public class TestCodeDraw {
    public static void main(String[] args) {
        int size = 400;
        CodeDraw canvas = new CodeDraw(size, size);
        canvas.setLineWidth(10);
        canvas.setCorner(Corner.ROUND);
        int numberOfLines = 8;
        int step = 20;
        for (int i = 1; i <= numberOfLines; i++) {
            int spacing = i * step;
            int oppositeSpacing = size - spacing;
            canvas.setColor(Palette.BLUE);
            canvas.drawLine(spacing, spacing, oppositeSpacing, spacing);
            canvas.setColor(Palette.GREEN);
            canvas.drawLine(spacing, oppositeSpacing, oppositeSpacing, oppositeSpacing);
        }
        canvas.show();
    }
}
