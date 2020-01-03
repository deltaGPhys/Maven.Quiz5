package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    private Stack<SomeType> stack = new Stack<>();

    public MyStack(SomeType... args) {
        for (SomeType item: args) {
            this.stack.push(item);
        }
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return (this.stack.size() == 0);
    }

    public void push(SomeType i) {
        this.stack.push(i);
    }

    public SomeType peek() {

        return (isEmpty())? null : this.stack.peek();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
        return this.stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return this.stack.iterator();
    }
}
