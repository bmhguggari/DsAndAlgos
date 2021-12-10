package org.hanamant.dsalgo.queue;

public class Queue<E> {
    private int DEFAULT_SIZE = 10;
    private int INCREMENT_FACTOR = 10;
    private int rear = -1;
    private int front = -1;

    private Object[] queue = new Object[DEFAULT_SIZE];

    public E insertElement(E data) {
        if(this.front == -1) {
            this.rear = 0;
        }
        if(!this.isFull()) {
            this.queue[++front] = data;
        }
        return data;
    }

    public E removeElement() {
        if(this.isEmpty()) {
            return null;
        } else {
            E e = (E)this.queue[rear];
            this.rear++;
            if(this.rear > this.front) {
                this.rear = this.front = -1;
            }
            return e;
        }
    }

    public boolean isEmpty() {
        if(this.front < this.rear || this.front < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(this.front >= (queue.length - 1)) {
            adjustQueue();
        }
        return false;
    }

    private synchronized void adjustQueue() {
        int bottom = this.rear;
        if(this.rear > DEFAULT_SIZE) {
            System.out.println("Queue being shifted");
            //shift elements
            int i = 0;
            for(; bottom <= this.front; i++, bottom++) {
                queue[i] = queue[bottom];
            }
            this.rear = 0;
            this.front = i;
        } else {
            System.out.println("Queue being incremented");
            Object[] temp = new Object[this.queue.length + INCREMENT_FACTOR];
            while(bottom <= this.front) {
                temp[bottom] = this.queue[bottom];
                bottom++;
            }
            this.queue = temp;
        }
    }

    public void displayQueue() {
        if(!this.isEmpty()) {
            for(int i = this.rear; i <= this.front; i++) {
                System.out.println(this.queue[i]);
            }
        }
    }
}
