package com.lab111.lab5;

/**
 * Main method
 *
 * @author Volex
 * @version 5.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregator c = new ConcreteAggregator();
        Iterator it = c.getIterator();

        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.println((String) it.previous());
        }

        System.out.println();
        System.out.println("Sorted object:");

          Object [] array = (Object[]) it.sort();
            for (Object ar:array)
            System.out.println((String)ar);

    }
}
