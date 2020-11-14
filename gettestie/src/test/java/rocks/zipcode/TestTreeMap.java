package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;


import java.util.Set;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TestTreeMap {
    @Test
    public void treeMapPutTest(){
        TreeMap<String, Integer> people = new TreeMap();

        people.put("Jessie", 1990);
        people.put("Kyle", 1983);
        people.put("Jon", 1989);

        assertEquals(false, people.isEmpty());
    }

    @Test
    public void treeMapSizeTest(){
        TreeMap<String, Integer> people = new TreeMap();

        people.put("Jessie", 1990);
        people.put("Kyle", 1983);
        people.put("Jon", 1989);

        int expected = 3;
        int actual = people.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void treeMapClearTest(){
        TreeMap<String, Integer> people = new TreeMap();

        people.put("Jessie", 1990);
        people.put("Kyle", 1983);
        people.put("Jon", 1989);

        people.clear();

        assertEquals(true, people.isEmpty());
    }
}
