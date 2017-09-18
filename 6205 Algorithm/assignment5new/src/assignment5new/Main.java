package assignment5new;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] randomArray(int min, int max, int n) {
        int len = max - min + 1;
        if (max < min || n > len) {
            return null;
        }
        int[] source = new int[len];
        for (int i = min; i < min + len; i++) {
            source[i - min] = i;
        }
        int[] result = new int[n];
        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            index = Math.abs(rd.nextInt() % len--);
            result[i] = source[index];
            source[index] = source[len];
        }
        /*int[] result = new int[n];
        Random rd = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i]= (rd.nextInt(max)%(max-min+1) + min);
        }*/
        return result;
    }

    public static void doinsertion() {

        int hashLength = 10000;
        int arraySize;
        double loadFactor;

        int[] countIns = new int[100];
        double loadFacs[] = new double[100];
        long timeCosLiner[] = new long[100];
        long timeCosDouble[] = new long[100];
        long timeCosQuad[] = new long[100];

        for (int l = 0; l < 100; l++) {
            int countInsert = 0;
            arraySize = 100 * (l + 1);

            loadFactor = arraySize / 10000.0;
            /////		System.out.println(loadFactor);
            loadFacs[l] = loadFactor;

            // create random array
            int[] array = randomArray(0, 10000, arraySize);

            /////		System.out.println("LoadFact: " + loadFactor + " arraySize: " + arraySize + " HashLength: " + hashLength);
            /////		System.out.println(Arrays.toString(array));
            int[] hash = new int[hashLength];
            // 创建hash
            // insert
            //long sumTime = 0;
            //		for (int a = 0; a < 10; a++) {

            //			hash = new int[hashLength];
            long startTime = System.nanoTime();
            for (int i = 0; i < array.length; i++) {

                LinerHash.insertHash(hash, hashLength, array[i]);
            }
//				System.out.println(Arrays.toString(hash));
            long endTime = System.nanoTime();
//				System.out.println(a + "completed" + " time:" + (endTime - startTime));
            //sumTime = (endTime - startTime);
            //		}
            timeCosLiner[l] = endTime - startTime;
            countIns[l] = countInsert;
            
             hash = new int[hashLength];
             startTime = System.nanoTime();
            for (int i = 0; i < array.length; i++) {

                DoubleHash.insertHash(hash, hashLength, array[i]);
            }
//				System.out.println(Arrays.toString(hash));
             endTime = System.nanoTime();
//				System.out.println(a + "completed" + " time:" + (endTime - startTime));
            //sumTime = (endTime - startTime);
            //		}
            timeCosDouble[l] = endTime - startTime;
            
            
            hash = new int[hashLength];
             startTime = System.nanoTime();
            for (int i = 0; i < array.length; i++) {

                QuadraticProbing.insertHash(hash, hashLength, array[i]);
            }
//				System.out.println(Arrays.toString(hash));
             endTime = System.nanoTime();
//				System.out.println(a + "completed" + " time:" + (endTime - startTime));
            //sumTime = (endTime - startTime);
            //		}
            timeCosQuad[l] = endTime - startTime;
            
            
            /////		System.out.println();

            /////		System.out.println("loadFactor is: " + loadFactor);
            /////		System.out.println("Insert completed!  Insertcount: " + countInsert);
            /////		System.out.println("Time cost: " + sumTime );
        }
        /////	System.out.println("Quadratic Probing");
        System.out.println(Arrays.toString(loadFacs));
        System.out.println(Arrays.toString(timeCosLiner));
        System.out.println(Arrays.toString(timeCosDouble));
        System.out.println(Arrays.toString(timeCosQuad));
        /////	System.out.println(Arrays.toString(countIns));
    }

    public static void main(String[] args) {
        /*  int[] array = randomArray(0, 10000, arraySize);
	DoubleHash doub = new DoubleHash();
	LinerHash line = new LinerHash();
	QuadraticProbing quad = new QuadraticProbing();
        
	
	LinerHash.LinearProbing();
	QuadraticProbing.QuadraticProb();
	DoubleHash.DoubleHashing();*/
        doinsertion();

    }

}
