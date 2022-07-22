package chap09_nested;

public class Outer {
	// 멤버 : 필드, 생성자, 메소드
	// 인스턴스 멤버 클래스
	public class InnerA{
		// 생성자
		InnerA(){
			
		}
		// 멤버 : 인스턴스(O) , 정적멤버(X)
		int field1;
		public void imethod() {}
		

	
		
	}
	
	// 정적 멤버 클래스 : 객체의 생성없이 접근 -> 클래스 이름으로 접근 가능
	public static class InnerB{
		// 멤버 : 인스턴스 멤버 (O), 정적 멤버(O)
		int field3;
		static String str3;
		void method3() {}
		static void method4() {}
		
	}
	
	// 메소드
	public void method(){
		// 로컬 클래스 : 메소드 내에서만 사용 -> 정의
		class CommThread extends Thread { // 서버와 통신을 하는 스레드 클래스
			@Override
			public void run() {
				// 서버와 통신 -> 예) 파일다운로
			System.out.println("스레드가 작동");
		
		CommThread com = new CommThread(); // 객체 생성
		com.start();					   // 쓰레드를 시작
				
	}

}
		}
	}
