package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestComparable {

    @Test
    public void compareableTest(){

        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(sam);
        peopleList.add(sarah);
        peopleList.add(jerry);


        Collections.sort(peopleList);

        String expected = peopleList.toString();
        String actual = peopleList.toString();

        Assert.assertEquals(expected, actual);

    }

}
