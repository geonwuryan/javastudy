package chap09_nested;

public class NestedExample {

	public static void main(String[] args) {
		// InnerClass 접근 방법
		
		// 인스턴스 멤버는 객체가 생성되어야 존재
		// 정적 멤버는 객체의 생성없이 접근 가능
		
		// Inner 클래스 중에서 인스턴스 클래스
		Outer outer = new Outer();
		Outer.InnerA ia = outer.new InnerA(); // 인스턴스 멤버 클래스 접근 방법
		ia.field1 = 10 ;
		ia.imethod();
		
		outer.method(); // 로컬 클래스가 동작함.
		// 로컬 클래스는 메소드가 실행 될 때만 사용되는 클래스이다.

		
		// 정적 멤버 클래스에 접근하는 방법
		Outer.InnerB ib = new Outer.InnerB(); // 클래스 이름으로 접근 가능
		ib.field3 = 20; // 인스턴스 멤버 필드
		// 정적 필드는 객체의 생성 없이 접근
		Outer.InnerB.str3 = "홍길동";
		ib.method3(); // 인스턴스 멤버 메소드
		

	}

}
