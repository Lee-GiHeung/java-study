package ch04.sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간: " + time + "시]");

		// 시간의 변화에 따라 선택하기
		switch(time) {
		case 8 : 
			System.out.println("출근 합니다");
		case 9 :
			System.out.println("회의를 합니다");
		case 10 :
			System.out.println("업무를 봅니다");
		default : 
			System.out.println("외근을 나갑니다");
		}
	}

}
