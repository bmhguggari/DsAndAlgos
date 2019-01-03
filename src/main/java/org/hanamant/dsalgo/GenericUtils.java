/**
 * 
 */
package org.hanamant.dsalgo;

/**
 * @author hguggari
 *
 */
public class GenericUtils {

	/**
	 * 
	 */
	public GenericUtils() {
	}

	public static <T> void printArray(T[] arr) {
		if(arr == null || arr.length <= 0) return;
		for(T t: arr) { 
			System.out.print(t + "-");
		}
		System.out.println();
	}
}
