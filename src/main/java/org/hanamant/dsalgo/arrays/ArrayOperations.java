/**
 * 
 */
package org.hanamant.dsalgo.arrays;

/**
 * @author hguggari
 *
 */
public class ArrayOperations {

	/**
	 * 
	 */
	public ArrayOperations() {
	}
	
	/**
	 * In place reverse the given array 
	 * @param arr
	 */
	public static <T> void reverseArray(T[] arr) {
		if(arr == null || arr.length <= 0) return;
		T temp;
		for(int left = 0, right = arr.length-1; left < right; left++,right--) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}
	
	/**
	 * Rotate the 'in-place' given array in left direction
	 * @param arr
	 * @param rotationCount
	 */
	public static <T> void rotateLeftShift(T[] arr, int rotationCount) {
		if(arr == null || arr.length == 0) return;
		int n = arr.length;
		for(int counter = 1; counter <= rotationCount; counter++) {
			T temp = arr[0];
			for(int index = 1; index < n; index ++) {
				arr[index-1] = arr[index];
			}
			arr[n-1] = temp;
		}
	}
	
	
	/**
	 * Rotate the 'in-place' given array in right direction
	 * @param arr
	 * @param rotationCount
	 */
	public static <T> void rotateRightShift(T[] arr, int rotationCount) {
		if(arr == null || arr.length == 0) return;
		int n = arr.length;
		for(int counter = 1; counter <= rotationCount; counter++) {
			T temp = arr[n-1];
			for(int index = n-2; index >= 0; index --) {
				arr[index+1] = arr[index];
			}
			arr[0] = temp;
		}
	}
	
}
