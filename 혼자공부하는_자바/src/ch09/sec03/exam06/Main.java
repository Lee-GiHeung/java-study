package ch09.sec03.exam06;

public class Main {
	public static void main(String[] args) {
		Creature monster = new Creature();
		
		// 메소드의 arguement(매개변수 = 인수) 입력값 할당
		monster.method(
			new Animal() {
				public String bark() {
					return "멍멍 ㅠ";
				}
				
			});		
		
	}
}
