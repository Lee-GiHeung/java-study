package ch06.sec00.overloading;

public class Ex01OverLoadingExample {
	// 변수 두개인 이항 덧셈 함수
	public int add(int x, int y) {
		return x + y;
	}
	
	// 변수가 세개인 삼항 덧셈 함수
	public int add1(int x, int y, int z) {
		return x + y + z;
	}
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	/**
   	변수가 세개인 삼항 덧셈 함수 단, 오버로딩을 사용
   	오버로딩(Overloading) :
   	함수 이름은 같고 매개변수의 데이터 형식과 갯수가 다르다
   	함수값의 리턴 형식은 관계없음
   	int add(100, 200, 300) float add(100, 200 ,300)은 오버로딩이 안됨
	함수의 선언부가 같이 때문에 에러가 발생
	*/
	
	public static void main(String[] args) {
		Ex01OverLoadingExample ex01 = new Ex01OverLoadingExample();
		// 100 + 200 = 300 계산하는 add(int, int) 이항 메소드
		System.out.println("100 + 200 = " + ex01.add(100, 200));
		
		// 기존 방법으로 (100 + 200) + 300 = 300 + 300 = 600
		
		System.out.println(
				"100 + 200 = 300 = " +
				ex01.add(ex01.add(100, 200), 300));
		
		// 새로운 삼항 덧셈 함수를 이요하면 조금 더 간결한 연산이 됨
		System.out.println("100 + 200 = 300 = " + 
							ex01.add1(100, 200, 300));
		
		// 함수오버로딩 적용하면 
		System.out.println(
				"100 + 200 + 300 = " +
				ex01.add(100, 200, 300)
				);
	
	}

}