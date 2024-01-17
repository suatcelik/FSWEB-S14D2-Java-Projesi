package carpet;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public PaintColor getColor() {
        return this.color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
