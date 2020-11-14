package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void treeSetFirstTest(){
        TreeSet<String> people = new TreeSet();

        people.add("Jessie");
        people.add("Kyle");
        people.add("Jon");

        String expected = "Jessie";
        String actual = people.first();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void treeSetLastTest(){
        TreeSet<String> people = new TreeSet();

        people.add("Jessie");
        people.add("Kyle");
        people.add("Jon");

        String expected = "Kyle";
        String actual = people.last();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void treeSetPollFirstTest(){
        TreeSet<String> people = new TreeSet();

        people.add("Jessie");
        people.add("Kyle");
        people.add("Jon");

        String expected = "Jessie";
        String actual = people.pollFirst();

        Assert.assertEquals(expected, actual);
    }
}
