package p0;

import java.util.LinkedList;

/**
 * Given a <code>LinkedList</code>, this class will find the maximum over a
 * subset of its <code>Integers</code>.
 */
public class Even extends Thread {
    
    

    protected LinkedList<Integer> list;
    //protected int partialMax = Integer.MIN_VALUE; // initialize to lowest value
    LinkedList<Integer> even = new LinkedList<Integer>();

    public Even(LinkedList<Integer> list) {
        this.list = list;
    }

    /**
     * Update <code>partialMax</code> until the list is exhausted.
     */
    public void run() {
        while (true) {
            int number;
            // check if list is not empty and removes the head
            synchronized (list) {// synchronization needed to avoid atomicity violation
                if (list.isEmpty()) {
                    return; // list is empty
                }
                number = list.remove();
            }
            // update partialMax according to new value
            // TODO: IMPLEMENT CODE HERE
            if (number %2 ==0) {
                even.add(number);
            }
        }
    }

    public LinkedList getPartialMax() {
        return even;
    }
    
}
