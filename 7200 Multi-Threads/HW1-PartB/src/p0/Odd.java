package p0;

import java.util.LinkedList;

/**
 * Given a <code>LinkedList</code>, this class will find the maximum over a
 * subset of its <code>Integers</code>.
 */
public class Odd extends Thread {

    protected LinkedList<Integer> list;
    LinkedList<Integer> odd = new LinkedList<Integer>();

    public Odd(LinkedList<Integer> list) {
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
            if (number %2 ==1) {
                odd.add(number);
            }
        }
    }

    public LinkedList getPartialMax() {
        return odd;
    }

}


