import java.util.Arrays;
import java.util.Random;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		char[] a = new char[]{'A','T','U','P','B','M','D','F','G'};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
//		System.out.println();
//		int size =500;
//		SortingAlgorithms sa = new SortingAlgorithms();
//	
//		Node[] arr1 = new Node[size];
//		Node[] arr2 = new Node[size];
//		Node[] arr3 = new Node[size];
//		Node[] arr4 = new Node[size];
//		Node[] arr5 = new Node[size];
//		
//		Random r = new Random();
//		int temp ;
//		for (int i = 0; i < arr3.length; i++) {
//			temp = r.nextInt(40000);
//			arr1[i] = new Node(temp,null);
//			arr2[i] = new Node(temp,null);
//			arr3[i] = new Node(temp,null);
//			arr4[i] = new Node(temp,null);
//			arr5[i] = new Node(temp,null);
//			
//		}
//
//		
//		System.out.println(size);
//		double start = System.nanoTime();
//		sa.mergeSort(arr1);
//		System.out.println( "Merge Sort (ns): "+ (System.nanoTime()-start));
////		
//		
//		
//
//		 start = System.nanoTime();
//		sa.bubbleSort(arr1);
//		System.out.println( "Bubble Sort (ns): "+ (System.nanoTime()-start));
////		
//		
////		
//		start = System.nanoTime();
//		sa.quickSort(arr2, 0, size-1);
//		System.out.println( "Quick Sort (ns): "+ (System.nanoTime()-start));
////		
////		
//		start = System.nanoTime();
//		sa.selectionSort(arr2);
//		System.out.println( "Selection Sort (ms): "+ (System.nanoTime()-start));
////
////		
////	
//		start = System.nanoTime();
//		sa.heapSort(arr3);
//		System.out.println( "Heap Sort (ns): "+ (System.nanoTime()-start));
////		
////		for (int i = 0; i < arr3.length; i++) {
////			System.out.println(arr3[i].getKey());
////		}
		
	}

}
