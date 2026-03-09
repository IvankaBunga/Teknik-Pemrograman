//******************************************************
// Paint.java
// Represents a type of paint that has a fixed area
// covered by a gallon. All measurements are in feet.
//******************************************************
public class Paint {
    private double coverage; // jumlah kaki persegi per galon

    public Paint(double c) {
        coverage = c;
    }

    // Mengembalikan jumlah cat (galon) yang dibutuhkan untuk mengecat bentuk tertentu
    public double amount(Shape s) {
        // ilustrasi polimorfisme
        System.out.println("Computing amount for " + s);

        // Rumus: Luas permukaan dibagi daya sebar cat
        return s.area() / coverage;
    }
}