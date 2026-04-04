// <T extends A> membatasi tipe T agar hanya boleh class A atau semua anak cucunya (B dan C)
class Bound<T extends A> {

    private T objRef; // Variabel objRef akan bertipe sesuai dengan yang ditentukan saat inisialisasi

    // Constructor untuk menyimpan objek bertipe T ke dalam objRef
    public Bound(T obj) {
        this.objRef = obj;
    }

    public void doRunTest() {
        // Karena T sudah pasti turunan dari A, maka Java menjamin method displayClass() pasti ada
        this.objRef.displayClass();
    }
}

// Class Induk (Super Class)
class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

// Class B adalah turunan dari A (Valid untuk digunakan di class Bound)
class B extends A {
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

// Class C adalah turunan dari A (Valid untuk digunakan di class Bound)
class C extends A {
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

public class BoundedClass {
    public static void main(String a[]) {

        // Valid: C adalah turunan dari A
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();

        // Valid: B adalah turunan dari A
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();

        // Valid: A adalah dirinya sendiri (batas atas/upper bound)
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();

        // Jika kita membuat class baru, misal class D (tanpa extends A),
        // maka Bound<D> akan menyebabkan error kompilasi.
    }
}