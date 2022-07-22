package chap09_nested;

public class A { // Outer ( 외부 ) 클래스
	// 인스턴스 멤버 클래스 -> 객체 A가 생성 되어야만 존재
	class B { }
	
	// 정적 멤버 클래스
	static class C { } // -> 객체 A의 생성과는 무관하게 존재
	
	// 인스턴스 필드 -> 객체 A가 생성되어야만 의미가 있음 -> 객체 A 생성 됨
	B field1 = new B();

}
