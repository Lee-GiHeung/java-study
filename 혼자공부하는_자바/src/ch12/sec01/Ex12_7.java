package ch12.sec01;

import java.util.Arrays;
import java.util.Comparator;
// Arrays.sort()는 배열을 정렬할 때, Comparator를 지정해주지 않으면, 
// 저장하는 객체에 구현된 내용에 따라 정렬됨
// String의 Comparable 구현은 문자열이 사전 순으로 정렬되도록 작성되어 있음
public class Ex12_7 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); // String의 Comparable 구현에 의한 정렬
		System.out.println("strrArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		
	}
}
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {		
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // -1 곱해서 기본 정렬방식의 역으로 변경
										// 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다
		}
		return -1;
	}
}
/*
 *  strrArr = [Dog, cat, lion, tiger] 기본정렬
	strArr = [cat, Dog, lion, tiger]
	strArr = [tiger, lion, cat, Dog] 기본정렬 역순
 */

