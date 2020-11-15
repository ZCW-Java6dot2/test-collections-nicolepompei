package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class TestIterator {

    @Test
    public void iteratorObjectNextTest(){
        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);

        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(jerry);
        peopleList.add(sam);
        peopleList.add(sarah);

        Iterator iterator = peopleList.iterator();

        Object expected = jerry;
        Object actual = iterator.next();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void iteratorBooleanHasNextTest(){

        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);

        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(jerry);
        peopleList.add(sam);
        peopleList.add(sarah);

        Iterator iterator = peopleList.iterator();

        Object actual = iterator.hasNext();

        assertEquals(true,actual);


    }
}
