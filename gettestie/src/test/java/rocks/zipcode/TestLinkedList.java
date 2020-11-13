package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    @Test
    public void linkedListAddTest(){
        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);

        LinkedList<Person> personList = new LinkedList<Person>();

        personList.add(jerry);
        personList.add(sam);
        personList.add(sarah);

        assertEquals(false, personList.isEmpty());

    }

    @Test
    public void linkedListRemoveTest(){
        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);

        LinkedList<Person> personList = new LinkedList<Person>();

        personList.add(jerry);
        personList.add(sam);
        personList.add(sarah);
        personList.remove(jerry);

        assertEquals(false, personList.contains(jerry));

    }

    @Test
    public void linkedListRemoveLastTest(){
        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);

        LinkedList<Person> personList = new LinkedList<Person>();

        personList.add(jerry);
        personList.add(sam);
        personList.add(sarah);

        Person expected = sarah;
        Person actual = personList.removeLast();

        Assert.assertEquals(expected, actual);

    }
}
