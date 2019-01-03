/**
 * 
 */
package org.hanamant.dsalgo.arrays;

import org.hanamant.dsalgo.GenericUtils;
import org.hanamant.dsalgo.TypeConverterUtils;

/**
 * @author hguggari
 *
 */
public class ArryaDriver {

	/**
	 * 
	 */
	public ArryaDriver() {
	}

	public static void main(String[] args) {
		byte[] b = {2,3,4,9,5,6};
		short[] s = {2,3,4,9,5,6};
		int[] i = {2,3,4,9,5,6};
		long[] l = {2,3,4,9,5,6};
		float[] f = {2,3,4,9,5,6};
		double[] d = {2,3,4,9,5,6};
		char[] c = {'A','B','C','D','E','F','G'};
		Character[] t = TypeConverterUtils.convertToWrapperType(c);
		GenericUtils.printArray(t);
		ArrayOperations.rotateRightShift(t, 3);
		GenericUtils.printArray(t);
	}
}
