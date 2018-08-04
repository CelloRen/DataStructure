package pac;

import java.util.Arrays;

public class array {
	static int size=2;
	public static void main(String[] args) {
		//New a array[]
		int[] a1=new int[size];
		int a2[]=new int[size];
		//New a array[][]
		int[][] b1=new int[size][size];
		int[]b2[] =new int[size][size];
		int b3[][]=new int[size][size];
		//new a array[][][]
		int[][][] c1=new int[size][size][size];
		int[]c2[][] =new int[size][size][size];
		int[][]c3[] =new int[size][size][size];
		int c4[][][]=new int[size][size][size];
        
		//Add elements to a1
		a1[0]=10;a1[1]=4;
		
		//Foreach
		for(int e:a1) {
			System.out.println(e);
		}
		
		//Arrays
		//asList
		System.out.println(Arrays.asList(a1).toString());
		//sort
		Arrays.sort(a1);
		for(int e:a1) {
			System.out.println(e);
		}
		//binarySearch
		System.out.println(Arrays.binarySearch(a1, 4));
		//equal
		System.out.println(Arrays.equals(a1, a2));
		//fill
		Arrays.fill(a1,0, 1, 11);
		for(int e:a1) {
			System.out.println(e);
		}
		
	}
}
