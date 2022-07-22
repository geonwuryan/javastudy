package chap09_nested_interface;

// 중첩 인터페이스의 사용 방법을 익힌다.
// 인터페이스 : 버튼에 따라서 동작을 다르게 하려고 -> 구현 객체를 다르게 하면 다른 동작이 실행 

public class Button { // Outer 클래스
	// 인터페이스 선언
	OnClickListener listener;
	
	// setter
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 앱의 버튼을 눌렀을 때 
	void touch() {
		listener.onClick(); // 인터페이스의 메소드를 호출
		
	}
	interface OnClickListener { // 버튼이 눌리면 동작하는 메소
		void onClick(); // 인터페이스의 메소드를 호출
	}

}
