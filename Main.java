
import java.util.ArrayDeque;

import java.util.ArrayList;

/**
 *
 * @author Axioo
 */
public class Main {
    public static void main(String[] args) {
        // Membuat object ArrayList untuk menyimpan data String
        ArrayList<String> arraylist = new ArrayList<>();
        
        // Menambahkan beberapa elemen ke ArrayList
        arraylist.add("Hallo");
        arraylist.add("Mahasiswa");
        arraylist.add("!");
        
        //Menampilkan elemen ArrayList menggunakan loop for
        arraylist.forEach((str) -> {
            System.out.println(str);
        });
        
        // Membuat objek ArrayDeque untuk menyimpan data integer
        ArrayDeque<Integer> arraydeque = new ArrayDeque<>();
        
        //Menambahkan bebeberapa elemen ke ArrayDeque
        arraydeque.add(1);
        arraydeque.add(2);
        arraydeque.add(3);
        
        // Menampilkan elemen ArrayDeque menggunakan iterator
        arraydeque.forEach((num) -> {
            System.out.println(num);
           
}
