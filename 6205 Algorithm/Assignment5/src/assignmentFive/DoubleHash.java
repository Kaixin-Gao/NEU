package assignmentFive;
import java.math.BigDecimal;
import java.util.Arrays;

public class DoubleHash {
	
		static int count = 0;
		static int countInsert = 0;

		public void DoubleHashing() {
			// “除法取余法”
			int hashLength;
			double loadFactor = 0.0;

			int[] array = { 13, 29, 27, 28, 26, 30, 38, 17, 21, 23, 35, 31, 33, 39, 4, 9 };
                       // int[] array = new array[1000];
			int[] result = new int[16];
			int[] countSearch = new int[20];
			double loadFacs[] = new double[20];
			long timeCos[] = new long[20];
			

			int size = array.length;

			// 哈希表长度
			for (int l = 0; l < 20; l++) {
				count = 0;
				countInsert = 0;
				Double loadFactor1 = 0.05 * (l + 1);
				//keep 2 decimal factors
				BigDecimal   b   =   new   BigDecimal(loadFactor1);    
				  
				loadFactor   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
				
				
				loadFacs[l] = loadFactor;
				hashLength = (int) (size / loadFactor);
				System.out.println("LoadFact: " + loadFactor +" Size: " + size + " HashLength: " + hashLength);
				int[] hash = new int[hashLength];
				// 创建hash
				//insert
				for (int i = 0; i < array.length; i++) {
					insertHash(hash, hashLength, array[i]);
//					System.out.print(countInsert + " - " + "\n");

				}
				System.out.println();
				System.out.println(Arrays.toString(hash));

				// search 10 tiems, take average time cost
				long sumTime = 0;
				for ( int t =0; t < 10; t++){
				long startTime = System.nanoTime();
				for (int i = 0; i < size; i++) {
					int searchNum = array[i];
					result[i] = searchHash(hash, hashLength, searchNum);
//					System.out.println("已经在数组中找到value:" + array[i] + " - key is: " + result[i] + " - " + count);
				}
				long endTime = System.nanoTime();
				sumTime += (endTime - startTime);
				}
				timeCos[l] = sumTime / 10;
				countSearch[l] = count / 10;
				System.out.println("loadFactor is: " + loadFactor);

				System.out.println("Insert completed!  Insertcount: " + countInsert);
				System.out.println("Search completed!  ASL count: " + count / 160 + "test");
				System.out.println("Time cost: " + sumTime / 10);
				System.out.println(l);

			}
			System.out.println("Double Hashing");
			System.out.println(Arrays.toString(loadFacs));
			System.out.println(Arrays.toString(timeCos));
			System.out.println(Arrays.toString(countSearch));
		}

		public static int searchHash(int[] hash, int hashLength, int key) {
			// 哈希函数
			int hashAddress = key % hashLength;
			int stepSize,constant=5; 
			// 指定hashAdrress对应值存在但不是关键值，则用开放寻址法解决
			while (hash[hashAddress] != 0 && hash[hashAddress] != key) {
				count++;
//				System.out.println(count + " - " + hashAddress);
				stepSize = constant - (hashAddress % constant); //再哈希法：stepSize = constant - (key % constant)  保证对每个关键字可能产生不同的步长    
		        hashAddress = (hashAddress + stepSize) % hashLength;//再哈希法要求表的长度是一个质数，例如13。假设是15非质数，插入元素0，步长是5，那么可能的插入位置只有0,5,10  
		                                       
//				System.out.println(count + " - " + hashAddress);

			}
			count++;
//			System.out.println("Found " + count + " - " + hashAddress);
			// 查找到了开放单元，表示查找失败
			if (hash[hashAddress] == 0)
				return -1;
			return hashAddress;

		}

		public static void insertHash(int[] hash, int hashLength, int data) {
			// 哈希函数
			int hashAddress = data % hashLength;
			countInsert++;
//			System.out.println(countInsert + " - " + hashAddress);
			int stepSize,constant=5; 
			// 如果key存在，则说明已经被别人占用，此时必须解决冲突
			while (hash[hashAddress] != 0) {
				// 用开放寻址法找到
//				System.out.println(countInsert + " - " + hashAddress);
				stepSize = constant - (hashAddress % constant); //再哈希法：stepSize = constant - (key % constant)  保证对每个关键字可能产生不同的步长    
		        hashAddress = (hashAddress + stepSize) % hashLength;//再哈希法要求表的长度是一个质数，例如13。假设是15非质数，插入元素0，步长是5，那么可能的插入位置只有0,5,10  
		                                                            //假如是13，则可能的插入位置有0,5,10，2，7，12等等，可以遍历所有剩余位置。  
				
				
				countInsert++;
//				System.out.println(hash[hashAddress]);
				
			}

			// 将data存入字典中
//			System.out.println(Arrays.toString(hash));
//			System.out.println("Insert complete: " + data + " hassAddress: " + hashAddress);
			hash[hashAddress] = data;
		}



}

