package com.psja.CheckAspect.api;

public class MergeEnd {

	public static void main( String args[] ) {
		Integer[] arr1 = {0,1,2,3,0,4,6};
		int count = 0;
		for ( int i =0; i<arr1.length; i++ ) {
			if ( arr1[i] == 0 ) {
				count++;
				for ( int j = i; j<arr1.length; j++ ) {
					if ( j+1 != arr1.length )
						arr1[j] = arr1[j+1];
					for ( int t = 1; t<arr1.length; t++ ) {
						System.out.print(arr1[t]);
					}
					System.out.println("\n");
				}
			}
			
			
		}
		
		
//		if ( count > 0 ) {
//			arr1
//		}
	}
}
