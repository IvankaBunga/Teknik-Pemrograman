//********************************************************************
// Sorting.java Author: Lewis/Loftus
//
// Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************
public class Sorting
{
    //-----------------------------------------------------------------
    // Sorts the specified array of objects using the selection
    // sort algorithm (Ascending - Tetap Standar).
    //-----------------------------------------------------------------
    public static void selectionSort (Comparable[] list)
    {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    // MODIFIKASI: Mengurutkan secara DESCENDING (Besar ke Kecil)
    // Sesuai instruksi tugas 3 poin nomor 4.
    //-----------------------------------------------------------------
    public static void insertionSort (Comparable[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;

            // Shift smaller values to the right
            // PERUBAHAN: key.compareTo(list[position-1]) > 0
            // Jika key lebih BESAR dari elemen sebelumnya, maka elemen sebelumnya digeser ke kanan.
            while (position > 0 && key.compareTo(list[position-1]) > 0)
            {
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }
    }
}