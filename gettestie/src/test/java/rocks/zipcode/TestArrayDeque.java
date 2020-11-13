package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {

    @Test
    public void arrayDequeAddTest(){
    Person jon = new  Person("Jon",1994);
    Person jessie = new Person("Jessie",1990);
    Person kyle = new Person("Kyle",1992);

    Person[] jonNJessie = {jon, jessie};
    List<Person> list = Arrays.asList(jonNJessie);
    ArrayDeque<Person> actual = new ArrayDeque<>(list);

    actual.add(kyle);

        assertEquals(true, actual.contains(kyle));
    }

    @Test
    public void arrayDequeAddFirstTest(){
        Person jon = new  Person("Jon",1994);
        Person jessie = new Person("Jessie",1990);
        Person kyle = new Person("Kyle",1992);

        Person[] jonNJessie = {jon, jessie};
        List<Person> list = Arrays.asList(jonNJessie);
        ArrayDeque<Person> actual = new ArrayDeque<>(list);
        actual.addFirst(kyle);
        Person actualPerson = actual.getFirst();
        Person expectedPerson = kyle;

        Assert.assertEquals(expectedPerson, actualPerson);

    }

    @Test
    public void arrayDequeAddLastTest(){
        Person jon = new  Person("Jon",1994);
        Person jessie = new Person("Jessie",1990);
        Person kyle = new Person("Kyle",1992);

        Person[] jonNJessie = {jon, jessie};
        List<Person> list = Arrays.asList(jonNJessie);
        ArrayDeque<Person> actual = new ArrayDeque<>(list);
        actual.addLast(kyle);

        Person actualPerson = actual.getLast();
        Person expectedPerson = kyle;

        Assert.assertEquals(expectedPerson, actualPerson);


    }
}
