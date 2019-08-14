package kh.java.array;

public class ShallowCopy {

	/**
	 * 배열복사 - 얕은 복사
	 * 주소값만 복사하는 경우
	 * 
	 */
	public static void main(String[] args) {
		ShallowCopy s = new ShallowCopy();
		s.test();
	}

	public void test() {
		char[] carr1 = {'a','b','c','d'};
		char[] carr2 = carr1;//carr1의 주소값을 가져왔다.
		
		carr1[3] = 'z';
		
		System.out.println(carr1.hashCode());
		System.out.println(carr2.hashCode());
		
		System.out.println(carr2[3]);
	}
}
