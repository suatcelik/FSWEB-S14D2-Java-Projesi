package ceiling;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return this.height;
    }

    public PaintColor getPaintedColor() {
        return this.paintedColor;
    }
    public void create(){
        System.out.println("Ceiling object has height of " + height + " and painted color of " + paintedColor);
    }
}
