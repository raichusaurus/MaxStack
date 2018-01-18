package MaxStack;

import java.util.Stack;

// MaxStack uses generics extending Comparable since it will need to compare elements
public class MaxStack<E extends Comparable> extends Stack<E> {

    private Stack<E> max_stack; // internal stack to track current max

    public MaxStack() {
        max_stack = new Stack<E>();
    }

    public E pop() {
        max_stack.pop();
        return super.pop();
    }

    // switch from recursion in getMax to pushing the current max onto the max_stack
    public E push(E item) {
        if (max_stack.isEmpty()) {
            max_stack.push(item);
        }
        else {
            E max_element = max_stack.peek();
            if (item.compareTo(max_element) > 0) {
                max_stack.push(item);
            }
            else {
                max_stack.push(max_element);
            }
        }

        return super.push(item);
    }

    // can return null
    // switching from recursion, we go from O(n) to O(1)
    public E getMax() {

        if (isEmpty()) {
            return null;
        }

        return max_stack.peek();
    }
}