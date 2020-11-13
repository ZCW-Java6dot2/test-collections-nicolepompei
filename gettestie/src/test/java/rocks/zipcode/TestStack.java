package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testStackPush(){
        Stack<String> testStack = new Stack<>();
        testStack.push("dogs n' things");
        assertEquals(false, testStack.isEmpty());


    }

    @Test
    public void testStackPop(){
        Stack<String> testStack = new Stack<>();
        String expected = "dogs n' things";
        testStack.push("dogs n' things");

        String actual = testStack.pop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStackPeek(){
        Stack<String> testStack = new Stack<>();
        String expected = "dogs n' things";
        testStack.push("dogs n' things");

        String actual = testStack.peek();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testStackIsEmpty(){
        Stack<String> testStack = new Stack<>();
        Boolean expected = false;
        testStack.push("dogs n' things");

        assertEquals(false, testStack.isEmpty());



    }
}
