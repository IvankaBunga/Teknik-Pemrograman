public class testShape {
    public static void main(String[] args) {
/*        // --- 1. Uji Kelas Shape ---
        Shape s1 = new Shape();
        System.out.println("S1: " + s1.toString());

        Shape s2 = new Shape("yellow", false);
        System.out.println("S2: " + s2.toString());

        s1.setColor("red");
        s1.setFilled(false);

        System.out.println("--- Setelah Update S1 ---");
        System.out.println("S1 sekarang: " + s1);

        // --- 2. Uji Kelas Circle ---
        Circle c1 = new Circle(5.5, "yellow", false);
        System.out.println("\n--- Uji Circle ---");
        System.out.println(c1.toString());
        System.out.println("Luas Circle: " + c1.getArea());
        System.out.println("Keliling Circle: " + c1.getPerimeter());

        // --- 3. Uji Kelas Rectangle ---
        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println("\n--- Uji Rectangle ---");
        System.out.println(r1.toString());
        System.out.println("Luas Rectangle: " + r1.getArea());
        System.out.println("Keliling Rectangle: " + r1.getPerimeter());

        r1.setWidth(5.0);
        System.out.println("Luas Rectangle setelah width diubah: " + r1.getArea());
*/
        // --- 4. Uji Kelas Square ---
        System.out.println("\n--- Uji Square ---");
        Square sq1 = new Square(5.0, "purple", true);
        System.out.println(sq1.toString());

        // Membuktikan Square mewarisi metode hitung dari Rectangle
        System.out.println("Luas Square: " + sq1.getArea());
        System.out.println("Keliling Square: " + sq1.getPerimeter());

        // Uji Proteksi Sisi Square (Override check)
        System.out.println("-> Mencoba setLength(10.0) pada Square...");
        sq1.setLength(10.0);
        System.out.println("Hasil Width: " + sq1.getWidth());
        System.out.println("Hasil Length: " + sq1.getLength());
        System.out.println("Status akhir: " + sq1.toString());

    }
}
