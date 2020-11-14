package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;


import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {
    @Test
    public void testVectorLastElement(){
        Vector<String> people = new Vector<>();

        people.add("Jessie");
        people.add("Kyle");
        people.add("Jon");

        String expected = "Jon";
        String actual = people.lastElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testVectorFirstElement(){
        Vector<String> people = new Vector<>();

        people.add("Jessie");
        people.add("Kyle");
        people.add("Jon");

        String expected = "Jessie";
        String actual = people.firstElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testVectorClear(){
        Vector<String> people = new Vector<>();

        people.add("Jessie");
        people.add("Kyle");
        people.add("Jon");

        people.clear();

        assertEquals(true,people.isEmpty());
    }
}
