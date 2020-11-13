package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {

    @Test
    public void hashSetAddTest(){

        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);
        //when
        Person [] all = {jerry, sam, sarah};
        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(all));

        HashSet<ArrayList> actual = new HashSet<>();

        actual.add(personList);

        assertEquals(false, actual.isEmpty());


    }

    @Test
    public void hashSetClearTest(){
        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);
        //when
        Person [] all = {jerry, sam, sarah};
        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(all));

        HashSet<ArrayList> actual = new HashSet<>();

        actual.add(personList);
        actual.clear();

        assertEquals(true, actual.isEmpty());
    }

    @Test
    public void hashSetRemoveTest(){
        Person jerry = new Person ("Jerry", 1994);
        Person sam = new Person ("Sam", 1980);
        Person sarah = new Person("Sarah", 1992);
        //when
        Person [] all = {jerry, sam, sarah};
        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(all));

        HashSet<ArrayList> actual = new HashSet<>();

        actual.add(personList);
        actual.remove(sam);

        assertEquals(false, actual.contains(sam));


    }
}
