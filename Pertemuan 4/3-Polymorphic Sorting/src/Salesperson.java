// *******************************************************
// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// *******************************************************
public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;

    //------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    //------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //-------------------------------------------
    // Returns the sales person as a string.
    //-------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //-------------------------------------------
    // Returns true if the sales people have
    // the same name.
    //-------------------------------------------
    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    //--------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    //--------------------------------------------------
    public int compareTo(Object other) {
        Salesperson otherSales = (Salesperson) other;

        // 1. Bandingkan total penjualan
        if (this.totalSales < otherSales.getSales()) {
            return -1; // Berarti 'this' lebih kecil
        }
        else if (this.totalSales > otherSales.getSales()) {
            return 1;  // Berarti 'this' lebih besar
        }
        else {
            // 2. Jika totalSales SAMA (tie-breaker), bandingkan nama
            // Bandingkan Nama Belakang (LastName)
            int nameCompare = this.lastName.compareTo(otherSales.getLastName());

            if (nameCompare != 0) {
                return nameCompare;
            } else {
                // 3. Jika Nama Belakang juga sama, bandingkan Nama Depan (FirstName)
                return this.firstName.compareTo(otherSales.getFirstName());
            }
        }
    }

    //-------------------------------------------
    // Accessor untuk First Name
    //-------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    //-------------------------------------------
    // Accessor untuk Last Name
    //-------------------------------------------
    public String getLastName() {
        return lastName;
    }

    //-------------------------------------------
    // Accessor untuk Total Sales
    //-------------------------------------------
    public int getSales() {
        return totalSales;
    }
}