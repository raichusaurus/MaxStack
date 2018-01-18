package MaxStack;

import org.junit.Test;

import static org.junit.Assert.*;

// Create unit tests to make sure refactoring goes smoothly
public class MaxStackTest {

    // make sure stack is implemented correctly forward
    @Test
    public void testPushPeekPopForward() {

        MaxStack<Integer> testStack = new MaxStack<Integer>();
        for (int i = 0; i < 5; i++) {
            testStack.push(i);
        }

        for (int i = 4; i > -1; i--) {
            Integer current = testStack.peek();
            assertEquals((Integer) i, current);
            assertEquals((Integer) i, testStack.pop());
        }
    }

    // make sure stack is implemented correctly backward
    @Test
    public void testPushPeekPopBackward() {

        MaxStack<Integer> testStack = new MaxStack<Integer>();
        for (int i = 4; i > -1; i--) {
            testStack.push(i);
        }

        for (int i = 0; i < 5; i++) {
            Integer current = testStack.peek();
            assertEquals((Integer) i, current);
            assertEquals((Integer) i, testStack.pop());
        }
    }

    // make sure correct max is returned with items inserted in ascending order
    @Test
    public void testMaxForward() {

        MaxStack<Integer> testStack = new MaxStack<Integer>();
        for (int i = 0; i < 5; i++) {
            testStack.push(i);
        }
        assertEquals(testStack.getMax(), (Integer) 4);
    }

    // make sure correct max is returned with items inserted in descending order
    @Test
    public void testMaxBackWard() {

        MaxStack<Integer> testStack = new MaxStack<Integer>();
        for (int i = 4; i > -1; i--) {
            testStack.push(i);
        }
        assertEquals(testStack.getMax(), (Integer) 3);
    }
}
