package p0;

//import java.util.LinkedList;
import java.util.*;

/**
 * This class runs <code>numThreads</code> instances of
 * <code>ParallelMaximizerWorker</code> in parallel to find the maximum
 * <code>Integer</code> in a <code>LinkedList</code>.
 */
public class ParallelMaximizer {

    int numThreads = 4;
//    ArrayList<Even> workers;

    public ParallelMaximizer(int numThreads) {
//        workers = new ArrayList<Even>(numThreads);
    }

    public static void main(String[] args) {
        int numThreads = 4; // number of threads for the maximizer
        int numElements = 100000; // number of integers in the list

        ParallelMaximizer maximizer = new ParallelMaximizer(numThreads);
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> backup = new LinkedList<Integer>();
        // populate the list
        // TODO: change this implementation to test accordingly
        Random rand = new Random();
        int next = 0;
        for (int i = 0; i < numElements; i++) {
            next = rand.nextInt() / 1000000;
            list.add(next);
        }

        // run the “inspectors”
        backup.addAll(list);
        for (int j = 1; j < 11; j++) {
            list.addAll(backup);
            System.out.println();
            System.out.println();
            System.out.println("Computation times :" + j);
            System.out.println("LinkedList -> " + list);
            try {
                System.out.println("【The result is 】:");
                maximizer.max(list);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);

    }

    /**
     * Finds the maximum by using <code>numThreads</code> instances of
     * <code>ParallelMaximizerWorker</code> to find partial maximums and then
     * combining the results.
     *
     * @param list <code>LinkedList</code> containing <code>Integers</code>
     * @return Maximum element in the <code>LinkedList</code>
     * @throws InterruptedException
     */
    public void max(LinkedList<Integer> list) throws InterruptedException {

        Even even = new Even(list);
        even.start();
        Odd odd = new Odd(list);
        odd.start();
        Order order = new Order(list);
        order.start();
        Jack jack = new Jack(list);
        jack.start();

        even.join();
        odd.join();
        order.join();
        jack.join();

        System.out.println("【Even number found " + even.getPartialMax().size() + "】and they are:" + even.getPartialMax());
        System.out.println("【Odd number found " + odd.getPartialMax().size() + "】and they are:" + odd.getPartialMax());
        if ((order.getPartialMax() == null) || (order.getPartialMax().size() == 0)) {
            System.out.println("【Ordered number found FAILED!】");
        } else {
            System.out.println("【Ordered number found " + order.getPartialMax().size() + "】and they are:" + order.getPartialMax());
        }
        if ((jack.getPartialMax() == null) || (jack.getPartialMax().size() == 0)) {
            System.out.println("【Jack number found FAILED!】");
        } else {
            System.out.print("【Jack number found " + jack.getPartialMax().size() + "】and they are:"/*+ jack.getPartialMax()*/);
            LinkedList<Integer> backup = new LinkedList<Integer>();
            backup.addAll(jack.getPartialMax());
            while (true) {
                int number;
                if (backup.isEmpty()) {
                    return;
                }
                System.out.print("[");
                for (int i = 0; i < 4; i++) {
                    number = backup.remove();
                    System.out.print(number + " ");
                }
                System.out.print("] ");

            }

        }
    }

}
