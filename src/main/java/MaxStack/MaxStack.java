package MaxStack;

import java.util.Stack;

// MaxStack uses generics extending Comparable since it will need to compare elements
public class MaxStack<E extends Comparable> extends Stack<E> {


    // my initial instinct was to go with recursion to avoid data duplication
    public E getMax() {

        E current_element;
        E max_element;

        if (isEmpty()) {
            return null;
        }

        else {
            current_element = pop(); // get the top element
            max_element = getMax(); // recursive call to get max element from remainder of the stack

            if (max_element == null) {
                return current_element;
            }

            if (current_element.compareTo(max_element) > 0) {
                max_element = current_element; // compare current element to max found from recursive call
            }

            push(current_element); // calling push after the recursion will restore the stack.
        }

        return max_element;
    }

    // simple test
    public static void main(String[] args) {
        MaxStack<Integer> myStack = new MaxStack<Integer>();
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }

        Integer max_element = myStack.getMax();
        System.out.println("Max element is: " + max_element);

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}