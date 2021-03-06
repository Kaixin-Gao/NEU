package assignment5new;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class DoubleHash {

    static int count = 0;
    static int countInsert = 0;

    public static void DoubleHashing() {

        int hashLength = 10000;
        int arraySize;
        double loadFactor;

        int[] countIns = new int[100];
        double loadFacs[] = new double[100];
        long timeCos[] = new long[100];

        for (int l = 0; l < 100; l++) {

            count = 0;
            countInsert = 0;
            arraySize = 100 * (l + 1);

            loadFactor = arraySize / 10000.0;
            /////		System.out.println(loadFactor);
            loadFacs[l] = loadFactor;

            // create random array
            int[] array = randomArray(0, 10000, arraySize);

/////			System.out.println("LoadFact: " + loadFactor + " arraySize: " + arraySize + " HashLength: " + hashLength);
            /////		System.out.println(Arrays.toString(array));
            int[] hash = new int[hashLength];
            // 创建hash
            // insert
            long sumTime = 0;
            //		for (int a = 0; a < 10; a++) {

            //			hash = new int[hashLength];
            long startTime = System.nanoTime();
            for (int i = 0; i < array.length; i++) {

                insertHash(hash, hashLength, array[i]);
            }
//				System.out.println(Arrays.toString(hash));
            long endTime = System.nanoTime();
//				System.out.println(a + "completed" + " time:" + (endTime - startTime));
            sumTime = (endTime - startTime);
            //		}
            timeCos[l] = sumTime;
            countIns[l] = countInsert;
            /////	System.out.println();

            /////	System.out.println("loadFactor is: " + loadFactor);
            /////	System.out.println("Insert completed!  Insertcount: " + countInsert);
            /////	System.out.println("Time cost: " + sumTime );
        }
        /////	System.out.println("Double Probing");
        System.out.println(Arrays.toString(loadFacs));
        System.out.println(Arrays.toString(timeCos));
        /////	System.out.println(Arrays.toString(countIns));
    }

    public static void insertHash(int[] hash, int hashLength, int data) {
        int hashAddress = data % hashLength;
        countInsert++;
        int stepSize, constant = 5;
        while (hash[hashAddress] != 0) {
            stepSize = constant - (hashAddress % constant);
            hashAddress = (hashAddress + stepSize) % hashLength;
            countInsert++;
        }
        hash[hashAddress] = data;
    }

    public static int[] randomArray(int min, int max, int n) {
        int len = max - min + 1;

        if (max < min || n > len) {
            return null;
        }

        // 初始化给定范围的待选数组
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
        return result;
    }

}
