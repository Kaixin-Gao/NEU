package p0;

//import java.util.LinkedList;
import java.util.*;

/**
 * This class runs <code>numThreads</code> instances of
 * <code>ParallelMaximizerWorker</code> in parallel to find the maximum
 * <code>Integer</code> in a <code>LinkedList</code>.
 */
public class ParallelMaximizer {

    int numThreads = 10;
    ArrayList<ParallelMaximizerWorker> workers;

    public ParallelMaximizer(int numThreads) {
        workers = new ArrayList<ParallelMaximizerWorker>(numThreads);
    }

    public static void main(String[] args) {
        int numThreads = 10; // number of threads for the maximizer
        int numElements = 100000; // number of integers in the list

        ParallelMaximizer maximizer = new ParallelMaximizer(numThreads);
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> backup = new LinkedList<Integer>();
        // populate the list
        // TODO: change this implementation to test accordingly
        Random rand = new Random();
        int next = 0;
        for (int i = 0; i < numElements; i++) {
            next = rand.nextInt() / 10000;
            list.add(next);
        }

        // run the maximizer
        backup.addAll(list);
        for (int j = 1; j < 11; j++) {
            list.addAll(backup);
            System.out.println();
            System.out.println();
            System.out.println("Computation times :" + j);
            System.out.println("LinkedList -> " + list);
            try {
                System.out.println("【Max result is 】" + maximizer.max(list));
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
    public int max(LinkedList<Integer> list) throws InterruptedException {
        int max = Integer.MIN_VALUE; // initialize max as lowest value

        // run numThreads instances of ParallelMaximizerWorker
        for (int i = 0; i < numThreads; i++) {
            workers.add(i, new ParallelMaximizerWorker(list));
            workers.get(i).start();
        }
        // wait for threads to finish
        for (int i = 0; i < workers.size(); i++) {
            workers.get(i).join();
        }
        System.out.println("【Workers size】 = " + workers.size());
        // take the highest of the partial maximums
        // TODO: IMPLEMENT CODE HERE
        for (int i = 0; i < workers.size(); i++) {
            System.out.println("【Worker-" + (1 + i) + " found partial max】" + workers.get(i).getPartialMax());
            if (workers.get(i).getPartialMax() > max) {
                max = workers.get(i).getPartialMax();
            }
        }
        workers.clear();//Make sure that the program terminates
        return max;
    }

}
