package org.example.main;
public class Program {
	private static int linearSearch(int[] arr, int key) {
		for( int index = 0; index < arr.length; ++ index ) {
			if( arr[ index ] == key )
				return index;
		}
		return -1;
	}
	private static int binSearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while( left <= right ) {
			int mid = ( left + right ) / 2;
			if( key == arr[ mid ])
				return mid;
			if( key < arr[ mid ] )
				right = mid -1;
			else
				left = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int key = 10;
		int[] arr = new int[ ] { 10, 20, 30, 40, 50, 60, 70 };
		//int index = linearSearch( arr, key );
		int index = binSearch( arr, key );
		if( index != -1 )
			System.out.println( key+" found at index "+index);
		else
			System.out.println(key+" not found");
	}

}
