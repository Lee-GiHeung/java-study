package ch08.extra.toy;

// 인터페이스는 자바에서 다중상속을 구현하게 합니다
// 자바는 다중상속의 복잡성과 유지 예외처리에 어려움이 많은것을 
//개선하기 위해 다중 상속을 없앰
// 다중상속을 하더라도 실제 구현은 메소드재정의를 통하여
// 자식클래스로 이루어짐
// 이 부분을 의미하는 인터페이스라는 개념을 강조
// 그리고 실제구현을 자식클래스에게 하도록 언어문법상세에 강조
public interface HintHelper {
	// 인터페이스는 실제 구현이 아니므로
	// 상속받는 구현클래스에서 구현한다
	// 메소드 선언
	// 인터페이슨느 외부 클래스에서 접근을 해야하므로
	// public 제한을 가짐
	String getHint();
	
	
}
