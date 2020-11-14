package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {

    @Test
    public void priorityQueueAddTest(){

        PriorityQueue<String> peopleQueue = new PriorityQueue<>();

        peopleQueue.add("Jerry");
        peopleQueue.add("Sam");
        peopleQueue.add("Sarah");

        String expected = "Jerry";
        String actual = peopleQueue.peek();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void priorityQueueClearTest(){

        PriorityQueue<String> peopleQueue = new PriorityQueue<>();

        peopleQueue.add("Jerry");
        peopleQueue.add("Sam");
        peopleQueue.add("Sarah");
        peopleQueue.clear();


        assertEquals(true, peopleQueue.isEmpty());

    }

    @Test
    public void priorityQueueRemoveTest(){

        PriorityQueue<String> peopleQueue = new PriorityQueue<>();

        peopleQueue.add("Jerry");
        peopleQueue.add("Sam");
        peopleQueue.add("Sarah");
        peopleQueue.remove("Jerry");


        assertEquals(false, peopleQueue.contains("Jerry"));

    }
}
