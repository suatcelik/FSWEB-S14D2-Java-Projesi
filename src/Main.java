import bed.Bed;
import ceiling.Ceiling;
import ceiling.PaintColor;
import lamp.Lamp;
import lamp.LampType;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(LampType.MODERN,true,100);
        lamp1.turnOn();

        Ceiling ceiling =new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Bed bed =new Bed("Double",2,2,2,2);
        System.out.println(bed.toString());

        
    }
}