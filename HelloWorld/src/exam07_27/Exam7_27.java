package exam07_27;

import exam07_27.Outer.Inner;

public class Exam7_27 {

	public static void main(String[] args) {
		
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner();
		
		
	Inner.method1();
	}

}
class Outer{
	int value = 10;
	
	// 인스턴스 멤버 클래스 -> Outer 객체를 생성해야함.
	class Inner{
		int value = 20;
		void method1() { // 인스턴스 메소드 -> Inner 객체가 존재 해야함.
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value); // this -> inner 객
			System.out.println(Outer.this.value); 
		}
	}
	
}
