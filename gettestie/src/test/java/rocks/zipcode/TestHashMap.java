package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestHashMap {

    @Test
    public void hashMapSizeTest(){
        Person jessie = new Person ("Jessie", 1990);
        Person kyle = new Person ("Kyle", 1983);
        Person jon = new Person ("Jon", 1989);

       HashMap <String, Integer> people = new HashMap();

       people.put("Jessie", 1990);
       people.put("Kyle", 1983);
       people.put("Jon", 1989);

       int expected = 3;
       int actual = people.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashMapPutTest(){
        HashMap <String, Integer> people = new HashMap();

        people.put("Jessie", 1990);
        people.put("Kyle", 1983);
        people.put("Jon", 1989);

        assertEquals(false, people.isEmpty());

    }

    @Test
    public void hashMapRemoveTest(){
        HashMap <String, Integer> people = new HashMap();

        people.put("Jessie", 1990);
        people.remove("Jessie");

        assertEquals(true, people.isEmpty());


    }
}
