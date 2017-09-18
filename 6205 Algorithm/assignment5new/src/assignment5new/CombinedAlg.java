package assignment5new;

public class CombinedAlg {
	static int count = 0;
	static int countInsert = 0;

	public void combinedAlgorithm(int[] array, int[] countIns, long[] timeCos, int l) {		
		int hashLength = 10000;
		int arraySize = array.length;		
		int[] hash = new int[hashLength];
		Double loadF = arraySize / 10000.0;		
		long timeCost = 0;
		long startTime = System.nanoTime();
		if (loadF <= 0.4) {
			for (int i = 0; i < arraySize; i++) {				
				linearInsert(hash, hashLength, array[i]);
			}
		} else {
			for (int i = 0; i < arraySize; i++) {				
				doubleInsert(hash, hashLength, array[i]);
			}
		}
		long endTime = System.nanoTime();// calculate time cost
		timeCost = endTime - startTime;
		timeCos[l] = timeCost;
		countIns[l] = countInsert;
	}
	public static void linearInsert(int[] hash, int hashLength, int data) {		
		int hashAddress = data % hashLength;
		countInsert++;
		while (hash[hashAddress] != 0) {
			hashAddress = (++hashAddress) % hashLength;
			countInsert++;
		}
		hash[hashAddress] = data;
	}

	public static void doubleInsert(int[] hash, int hashLength, int data) {		
		int hashAddress = data % hashLength;
		countInsert++;
		int i = 1;
		int stepSize = 0;
		while (hash[hashAddress] != 0) {
			stepSize = i * i;
			hashAddress = (hashAddress + stepSize) % hashLength;
			countInsert++;
			i++;
		}
		hash[hashAddress] = data;
	}

}
