package kh.java.array;

import java.util.Arrays;

/**
 * heap영역에 생성된 배열 객체를 값을 포함하여
 * 그대로 복사해 새로 생성
 *
 */
public class DeepCopy {
	public static void main(String[] args) {
		DeepCopy d = new DeepCopy();
//		d.test1();
		d.test2();
//		d.test3();
	}

	/*
	 * 반복문을 통해 복사
	 */
	public void test1() {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
//			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.print("arr1 = [");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
			System.out.print((i<arr1.length-1) ? "," : "");
		}
		System.out.print("]");
		
		System.out.println();
		
		System.out.print("arr2 = [");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
			System.out.print((i<arr2.length-1) ? "," : "");
		}
		System.out.print("]");
		
//		System.out.println(arr1);
//		System.out.println(arr2);
	}
	
	/*
	 * System 클래스가 가진 메소드 사용 방법
	 * System.arraycopy
	 */
	public void test2() {
		char[] arr1 = {'a','b','c','d','e'};
		char[] arr2 = new char[arr1.length];
		
//		void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
			System.out.print(i!=arr1.length-1?",":"");
		}
		
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
			System.out.print(i!=arr2.length-1?",":"");
		}
		
		//길이가 다른 배열의 깊은 복사
		char[] arr3 = new char[3];
		System.arraycopy(arr1, 2, arr3, 0, 3);
		
		System.out.println(Arrays.toString(arr3));
	}
	
	/*
	 * 배열이 가진 clone메소드
	 */
	public void test3() {
		double[] arr1 = {0.1,1.2,3.4,5.6};
		double[] arr2 = arr1.clone();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
	}
}
