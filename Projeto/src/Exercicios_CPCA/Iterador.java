package Exercicios_CPCA;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Inner class example
public class Iterador implements Iterator<Integer> {
    private int cursor;

    public Iterador() {
       
    }

    public boolean hasNext() {
        //TODO
    	return true;
    }

    public Integer next() {
        if(this.hasNext()) {
            int current = cursor;
            cursor ++;
            return current;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
} 
