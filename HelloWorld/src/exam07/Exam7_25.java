package exam07;

public class Exam7_25 {

	public static void main(String[] args) {
	
		
		Outer outer = new Outer();
		Outer.Inner oi = outer.new Inner();
		System.out.println(oi.iv);
		System.out.println(outer.toString());

	}

}
class Outer{
	// 인스턴스 멤버 클래스 : Outer객체가 생성되어야만 존재 -> Outer객체를 생성해야
	class Inner {
		// 인스턴스 멤버 필드 -> Inner 객체가 있어야만 존
		int iv = 100;
	}
}
