/**
 * 
 */
package org.hanamant.dsalgo;

/**
 * @author hguggari
 *
 */
public class TypeConverterUtils {

	/**
	 * 
	 */
	public TypeConverterUtils() {
	}


	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Byte[] convertToWrapperType(byte[] arr) {
		Byte[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Byte[0];
		wrapArr = new Byte[arr.length];
		int index = 0;
		for(byte i : arr) {
			wrapArr[index++] = new Byte(i);
		}
		return wrapArr;
	}
	
	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Short[] convertToWrapperType(short[] arr) {
		Short[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Short[0];
		wrapArr = new Short[arr.length];
		int index = 0;
		for(short i : arr) {
			wrapArr[index++] = new Short(i);
		}
		return wrapArr;
	}
	
	
	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Integer[] convertToWrapperType(int[] arr) {
		Integer[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Integer[0];
		wrapArr = new Integer[arr.length];
		int index = 0;
		for(int i : arr) {
			wrapArr[index++] = new Integer(i);
		}
		return wrapArr;
	}
	
	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Long[] convertToWrapperType(long[] arr) {
		Long[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Long[0];
		wrapArr = new Long[arr.length];
		int index = 0;
		for(long i : arr) {
			wrapArr[index++] = new Long(i);
		}
		return wrapArr;
	}
	
	
	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Float[] convertToWrapperType(float[] arr) {
		Float[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Float[0];
		wrapArr = new Float[arr.length];
		int index = 0;
		for(float i : arr) {
			wrapArr[index++] = new Float(i);
		}
		return wrapArr;
	}
	
	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Double[] convertToWrapperType(double[] arr) {
		Double[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Double[0];
		wrapArr = new Double[arr.length];
		int index = 0;
		for(double i : arr) {
			wrapArr[index++] = new Double(i);
		}
		return wrapArr;
	}
	
	/**
	 * Converts the primitive type array to IntegerWrapper
	 * @param arr
	 * @return
	 */
	public static Character[] convertToWrapperType(char[] arr) {
		Character[] wrapArr = null;
		if(arr == null) return wrapArr;
		
		if(arr.length  == 0) return new Character[0];
		wrapArr = new Character[arr.length];
		int index = 0;
		for(char i : arr) {
			wrapArr[index++] = new Character(i);
		}
		return wrapArr;
	}
}
