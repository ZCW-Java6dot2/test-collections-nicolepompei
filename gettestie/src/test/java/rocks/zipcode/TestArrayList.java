package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    @Test
    public void testAddArrayList(){
        //given
   Person jerry = new Person ("Jerry", 1994);
   Person sam = new Person ("Sam", 1980);
   Person sarah = new Person("Sarah", 1992);
   //when
    Person [] jerryNSam = {jerry, sam};
    ArrayList<Person> actual = new ArrayList<>(Arrays.asList(jerryNSam));

    actual.add(sarah);
    Person[] all = {jerry, sam, sarah};
    ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));

    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveArrayList(){
    //given
    Person jerry = new Person ("Jerry", 1994);
    Person sam = new Person ("Sam", 1980);
    Person sarah = new Person("Sarah", 1992);
    //when
    Person[] all = {jerry, sam, sarah};
    ArrayList<Person> actual = new ArrayList<>(Arrays.asList(all));
    actual.remove(sarah);
    Person[] jerryNSam = {jerry, sam};
    ArrayList<Person> expected = new ArrayList<>(Arrays.asList(jerryNSam));

    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexOfArrayList(){
    //given
    Person jerry = new Person ("Jerry", 1994);
    Person sam = new Person ("Sam", 1980);
    Person sarah = new Person("Sarah", 1992);
    //when
    Person[] all = {jerry, sam, sarah};
    ArrayList<Person> arrayPeople = new ArrayList<>(Arrays.asList(all));
    int expected = 2;
    int actual = arrayPeople.indexOf(sarah);

    Assert.assertEquals(expected, actual);

    }
}
