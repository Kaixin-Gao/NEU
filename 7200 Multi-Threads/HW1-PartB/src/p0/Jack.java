package p0;

import java.util.LinkedList;

/**
 * Given a <code>LinkedList</code>, this class will find the maximum over a
 * subset of its <code>Integers</code>.
 */
public class Jack extends Thread {

    protected LinkedList<Integer> list;
    //protected int partialMax = Integer.MIN_VALUE; // initialize to lowest value
    LinkedList<Integer> jack = new LinkedList<Integer>();

    public Jack(LinkedList<Integer> list) {
        this.list = list;
    }

    /**
     * Update <code>partialMax</code> until the list is exhausted.
     */
    public void run() {
        int n1=Integer.MIN_VALUE;;
        int n2=Integer.MIN_VALUE;;
        int n3=Integer.MIN_VALUE;;
        int n4=Integer.MIN_VALUE;;
        while (true) {
            // check if list is not empty and removes the head
            synchronized (list) {// synchronization needed to avoid atomicity violation
                if (list.isEmpty()) {
                    return; // list is empty
                }
                n1=n2;
                n2=n3;
                n3=n4;
                n4 = list.remove();
            }
            // update partialMax according to new value
            // TODO: IMPLEMENT CODE HERE
            if ((n1+n2+n3+n4)==21) {
                jack.add(n1);
                jack.add(n2);
                jack.add(n3);
                jack.add(n4);
            }
        }
    }

    public LinkedList getPartialMax() {
        return jack;
    }

}
