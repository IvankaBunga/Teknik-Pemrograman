//********************************************************************
// PaintThings.java
// Computes the amount of paint needed to paint various things.
// Uses the amount method of the paint class which takes any Shape as a parameter.
//********************************************************************
import java.text.DecimalFormat;

public class PaintThing {
    public static void main (String[] args) {
        final double COVERAGE = 350; // [cite: 420]
        Paint paint = new Paint(COVERAGE);

        // 1. Instansiasi objek bentuk sesuai spesifikasi tugas [cite: 328]
        // Deck: persegi panjang 20 x 35 kaki
        Rectangle deck = new Rectangle(20, 35);
        // BigBall: bola dengan radius 15 kaki
        Sphere bigBall = new Sphere(15);
        // Tank: tabung dengan radius 10 dan tinggi 30 kaki
        Cylinder tank = new Cylinder(10, 30);

        // 2. Memanggil method amount untuk mendapatkan nilai cat
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Print hasilnya dengan format desimal [cite: 429-434]
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck: " + fmt.format(deckAmt));
        System.out.println ("Big Ball: " + fmt.format(ballAmt));
        System.out.println ("Tank: " + fmt.format(tankAmt));
    }
}