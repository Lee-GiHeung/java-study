package ch06.sec00.exam03;

import java.util.Iterator;

public class TelevisionManagerApp {
	
	public static void main(String[] args) {
		/**
		Television 클래스로부터
		메모리에 tv1이라는 참조변수로 
		주소를 참조하는 객체를 만들어라
		클래스는 설계도 = 정의 = 실체가 아님
		객체는 설계도의 내용을 구현한 실체
		메모리(힙 영역)에 만들어짐
		*/
		
		/////////////////////////////////
		// 텔레비젼 tv1
		/////////////////////////////////
		Television tv1 = new Television();
//		tv1.channel = 7;
//		tv1.volume = 3;
//		tv1.onOff = true;
//		tv1.brand ="LG";
//		tv1.size = 65;
//		tv1.owner = "홍길동";
	
		/////////////////////////////////
		// 텔레비젼 tv2
		/////////////////////////////////		
		Television tv2 = new Television();
//		tv2.channel = 9;
//		tv2.volume = 5;
//		tv2.onOff  = true;
//		tv2.brand = "SAMSUNG";
//		tv2.size = 75;
//		tv2.owner = "황진이";

		/////////////////////////////////
		// 텔레비젼 tv3
		/////////////////////////////////
		Television tv3 = new Television();
//		tv3.channel = 11;
//		tv3.volume = 7;
//		tv3.onOff = true;
//		tv3.brand = "LG";
//		tv3.size = 100;
//		tv3.owner = "MART";		
		
		// tv1과 tv2가 같은지 
		if(tv1 == tv2) {
			System.out.println("tv1과 tv2는 같은 객체 입니다.");
		} else {
			System.out.println("tv1과 tv2는 같은 객체가 아닙니다.");
		}
		
		// tv1 정보 출력
		tv1.printTvInfo();
		
		System.out.println("==========================");
		System.out.println();
		// tv2 정보 출력
		tv2.printTvInfo();
		
		System.out.println("==========================");
		System.out.println();
		// tv3 정보 출력
		tv3.printTvInfo();
		
		// tv3의 채널변경 3번으로 변경
		tv3.setChannel(3);		
		
		// tv3의 변경된 채널값 알아보기
		int ch = tv3.getChannel();
		System.out.println("tv3의 현재 channel은 : " + ch + " 입니다");				
	
		// tv1의 볼륨을 5로 변경하세요
		System.out.println("현재 볼륨의 상태는 " + tv1.getVolume());
		// tv1의 볼륨값을 읽어 오세요
		int vol = tv1.getVolume();
		// 현재 볼륨의 상태를 출력하세요
		System.out.println("현재 볼륨의 상태는 " + vol + "입니다.");
		
	}
	
//	// 각 tv객체의 필드를 화면에 보여줌 
//	public static void printTvInfo(Television tv) {
//		System.out.println("tv 객체 정보 : " + tv);
//		System.out.println("---------------------------");
//		System.out.println("tv channel : " + tv.channel);
//		System.out.println("tv volume : " + tv.volume);
//		System.out.println("tv onOff : " + tv.onOff);
//		System.out.println("tv brand : " + tv.brand);
//		System.out.println("tv size : " + tv.size);
//		System.out.println("tv owner : "  + tv.owner);
//	}
}