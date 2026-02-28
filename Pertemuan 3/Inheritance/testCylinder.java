public class testCylinder { // save as "TestCylinder.java"
    public static void main(String[] args) {

// Declare and allocate a new instance of cylinder
// with default color, radius, and height
    Cylinder c1 = new Cylinder();
    System.out.println("Cylinder:"
            + " radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " base area=" + c1.getArea()
            + " volume=" + c1.getVolume());

    // Declare and allocate a new instance of cylinder
    // specifying height, with default color and radius
    Cylinder c2 = new Cylinder(10.0);
    System.out.println("Cylinder 2:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());

    // Declare and allocate a new instance of cylinder
    // specifying radius and height, with default color
    Cylinder c3 = new Cylinder(2.0, 10.0);
    System.out.println("Cylinder 3:"
            + " radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " base area=" + c3.getArea()
            + " volume=" + c3.getVolume()
            + " color=" + c3.getColor());

    // Declare and allocate a new instance of cylinder
        // specifying radius, color, and height
        Cylinder c4 = new Cylinder(4.0, 6.0, "blue");
        System.out.println("Cylinder 4:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " base area=" + c4.getArea()
                + " volume=" + c4.getVolume()
                + " color=" + c4.getColor()
                + " Luas Permukaan=" + c4.getArea()
                + " " + c4.toString());
    }


}

