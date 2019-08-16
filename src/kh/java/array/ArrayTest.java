package kh.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
//		a.test();
//		a.test2();
//		a.test3();
//		a.test4();
		a.test5();
//		a.test6();
		
		
	}
	
	public void test() {
		//변수만 사용해 점수 데이터 처리하기
		//국:100, 영:90, 수:80,사:70,과:60
		int kor = 100;
		int eng = 90;
		int math = 80;
		int soc = 70;
		int sci = 60;
		
		int sum = kor + eng + math+ soc + sci;
		double avg = sum / 5.0;
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
	}

	/*
	 * 배열은 동일한 타입의 여러 데이터를 담을 수 있는 데이터 타입
	 * 자바 배열은 반드시 크기를 지정해서 사용해야 한다.
	 * 배열의 크기를 변경할 수 없다.
	 */
	public void test2() {
		//1.배열 선언
		int[] subject;
//		int subject[];
		
		//2.대입/할당
		subject = new int[5];
		System.out.println(subject[0]);
		System.out.println(subject[1]);
		System.out.println(subject[2]);
		System.out.println(subject[3]);
		System.out.println(subject[4]);
		
		//점수입력
		subject[0] = 100;
		subject[1] = 90;
		subject[2] = 80;
		subject[3] = 70;
		subject[4] = 60;
		
		System.out.println(subject[0]);
		System.out.println(subject[1]);
		System.out.println(subject[2]);
		System.out.println(subject[3]);
		System.out.println(subject[4]);
		
//		int total = subject[0]
//				  + subject[1]
//				  + subject[1]
//				  + subject[2]
//				  + subject[3]
//				  + subject[4];
		
		//반복문을 사용
		int total=0;
		for(int i=0;i<subject.length;i++) {
			total += subject[i];
		}
		
		//length 필드가 배열의크기 정보를 가지고있다.
		double avg = 1.0*total/subject.length;
		System.out.println(total);
		System.out.println(avg);
		
	}
	
	/*
	 * 배열 초기화 : 배열 선언과 동시에 값 할당
	 * heap에서 지정하는 타입별 초기값이 대입되지 않는다.
	 */
	public void test3() {
//		int[] subject = new int[5];
//		subject[0] = 100;
//		subject[1] = 90;
//		subject[2] = 80;
//		subject[3] = 70;
//		subject[4] = 60;
	
//		int[] subject = new int[] {100,90,80,70,60};
		int[] subject = {100,90,80,70,60};
		
		for(int i=0;i<subject.length;i++) {
			System.out.println("Subject["+i+"] = "+subject[i]);
		}
	}
	
	/*
	 * 실습문제 
	 * 알파벳 소문자로 구성된 문자 배열을 생성하고,
	 * 값을 대입한후.
	 * 콘솔에 출력하세요.
	 */
	public void test4() {
//		int tempInt=0;
		char[] lowwerAlphabet = new char[26];
		
//		for(int i=0;i<lowwerAlphabet.length;i++) {
//			if(tempInt==0) {
//				for(int j=1;j<=128;j++) {				
//					if(Character.isLowerCase(j)) {
//						tempInt = j;
//						lowwerAlphabet[i] = (char)j;
//						break;
//					}
//				}
//			}
//			else {
//				for(int j=tempInt+1;j<=128;j++) {				
//					if(Character.isLowerCase(j)) {
//						tempInt = j;
//						lowwerAlphabet[i] = (char)j;
//						break;
//					}
//				}
//			}
//		}
		
//		//case 2
//		char c ='a';
//		for(int i = 0; i < lowwerAlphabet.length; i++){
//		    lowwerAlphabet[i] = (char)(97 + i);
//		}

		//case 3
//		int count=0;
//		for(char i='a';i<='z';i++) {
//			lowwerAlphabet[count]=i;
//			count++;
//			System.out.println(lowwerAlphabet[count]); 
//			//출력이 안나온 이유 : 0번 위치에 값을 저장시키고, 비어있는 1번을 출력하기 때문에 출력이 안된다.
//		}

		//case 4
		char c ='a';
		for(int i = 0; i < lowwerAlphabet.length; i++){
		    lowwerAlphabet[i] = c++;
//		    lowwerAlphabet[i] = c;
//		    c = c +1;
		}
		
		System.out.println(lowwerAlphabet);
	}
	
	public void test5() {
		int[] iArr = new int[5];
		
		//객체정보를 문자열로 출력
		//객체의 hashCode값을 16진수로 표현한 것.
		System.out.println(iArr);
		
		//자바에서 객체의 실제 주소값은 얻을 수 없다.(보호되어있다)
		//hashCode값은 실제 주소를 가르키는 key값
		System.out.println(iArr.hashCode());
		
		//배열의 생성될 때의 크기를 변경하지 못한다.
		double[] dArr = new double[10];
		System.out.println(dArr);
		dArr = new double[12];
		System.out.println(dArr);
		
		//배열(객체)의 삭제는 해당 참조형 변수에
		//null(값업음)을 대입 -> 가비지콜렉터가 추후 반납처리
		//가비지 콜렉터(garbage collector) : 돌아다니면서 null값 회수
		dArr = null;
		
		//nullPointerException
		//null값에 대해 메소드 호출, 필드값 호출시 발생하는 에러
//		System.out.println(dArr.length);
	}
	
	public void test6() {
		String[] str_arr = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 문자열을 입력하세요 : ");
		str_arr[0]=sc.next();
		System.out.print("2번째 문자열을 입력하세요 : ");
		str_arr[1]=sc.next();
		System.out.print("3번째 문자열을 입력하세요 : ");
		str_arr[2]=sc.next();
		
		System.out.println(Arrays.toString(str_arr));
	}
}
