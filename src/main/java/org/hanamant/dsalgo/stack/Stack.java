package org.hanamant.dsalgo.stack;

public class Stack<E> {
    private int DEFAULT_SIZE = 10;
    private int INCREASE_FACTOR = 20;
    private Object[] stack = new Object[DEFAULT_SIZE];
    private int top = -1;

    private synchronized void widenStack() {
        System.out.println("Stack was widened ");
        Object[] tempStack = new Object[stack.length + INCREASE_FACTOR];
        int i = 0;
        for(Object obj: stack) {
            tempStack[i] = stack[i];
            i++;
        }
        stack = tempStack;
    }

    public boolean isStackEmpty() {
        if(top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isStackFull() {
        if(top >= (stack.length -1)) {
            return true;
        } else {
            return false;
        }
    }

    public synchronized E popStatck() {
        E element = null;
        if(!this.isStackEmpty()) {
            element = (E) stack[top];
            top--;
        }
        return element;
    }

    public synchronized boolean pushStack(E element) {
        if(isStackFull()) {
            widenStack();
        }
        stack[++top] = element;
        return true;
    }

    public E peek(){
        if(!isStackEmpty()) {
            return (E)stack[top];
        }
        return null;
    }

    public void displayStack() {
        for(int i = 0; i <= top; i++) {
            System.out.println((E)stack[i]);
        }
    }
}
