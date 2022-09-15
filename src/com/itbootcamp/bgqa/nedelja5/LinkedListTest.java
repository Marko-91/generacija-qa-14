package com.itbootcamp.bgqa.nedelja5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        int[] niz = {1, 2, 3, 4, 5, 100,6, 7, 8, 9, 10};
        LinkedList<String> povezanaLista = new LinkedList<>();

        povezanaLista.add("Cao");
        povezanaLista.add("Zdravo");
        povezanaLista.add("123");

        for (String element : povezanaLista) {
            System.out.println(element);
        }

        //povezanaLista.remove();
        //povezanaLista.remove("Cao");
        //povezanaLista.remove(0);
        //povezanaLista.removeFirst();
        //povezanaLista.removeLast();
//        for (String element : povezanaLista) {
//            System.out.println(element);
//        }

        Iterator<String> listIterator = povezanaLista.iterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
