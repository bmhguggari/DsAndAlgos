package org.hanamant.dsalgo.queue;

public class QueueApplication {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.insertElement(12);
        queue.insertElement(14);
        queue.insertElement(42);
        queue.insertElement(32);
        queue.insertElement(66);
        queue.insertElement(76);
        queue.insertElement(65);
        queue.insertElement(12);
        queue.insertElement(14);
        queue.insertElement(42);
        queue.insertElement(42);
        queue.insertElement(42);

        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();
        queue.removeElement();


        queue.insertElement(76);
        queue.insertElement(65);
        queue.insertElement(42);
        queue.insertElement(32);
        queue.insertElement(66);
        queue.insertElement(76);
        queue.insertElement(65);
        queue.insertElement(12);
        queue.insertElement(14);
        queue.insertElement(42);
        queue.insertElement(42);
        queue.insertElement(42);

        queue.displayQueue();

    }
}
