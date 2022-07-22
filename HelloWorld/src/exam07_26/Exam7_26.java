package exam07_26;

import exam07_26.Outer.Inner;

public class Exam7_26 {

	public static void main(String[] args) {
	
		Outer.Inner i1 = new Outer.Inner();
		System.out.println(i1.iv);
	}

}
class Outer{
	static class Inner{
		int iv = 200;
	}
}