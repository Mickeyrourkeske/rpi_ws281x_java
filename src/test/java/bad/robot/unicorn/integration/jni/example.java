package bad.robot.unicorn.integration.jni;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class example {

	static {
		System.loadLibrary("example");
	}

	public static void setMy_variable(double value) {
		exampleJNI.My_variable_set(value);
	}

	public static double getMy_variable() {
		return exampleJNI.My_variable_get();
	}

	public static int fact(int n) {
		return exampleJNI.fact(n);
	}

	public static int my_mod(int x, int y) {
		return exampleJNI.my_mod(x, y);
	}

	public static String get_time() {
		return exampleJNI.get_time();
	}

}
