package com.lab111.lab5;

/**
 * Interface Iterator
 * has method for consistent approach in the forward and reverse directions and makes filtration
 *
 * @author Volex
 * @version 5.0
 */

interface Iterator {
    boolean hasNext();

    Object next();

    boolean hasPrevious();

    Object previous();

    Object sort();


}