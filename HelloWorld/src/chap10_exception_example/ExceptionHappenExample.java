package chap10_exception_example;

/*
 * 예외 : 사용자의 오동작이나 프로그램어의 오류로 발생되는 예외
 * 모든 예외는 Exception 클래스를 상속함.
 * 일반예외 : 컴파일러가 컴파일시 알려줌. 문법적인 에러 -> 에러원인을 해결해주면 됨
 * ClassNotFoundException, InterruptedException
 * 실행예외 : 문법적인 오류가 없고, 구문(Semantic) 에러 -> 프로그램 실행시 발생되는 예외 
 * RuntimeExceptionn 클래스를 상속함.
 * NullPointException, NumberFormatException, ArrayIndexOutOfBoundException
 */

public class ExceptionHappenExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString()); // 문자열 정보를 출력
		// NullPounterException이 발생 -> default로 스택에 저장된 내용을 출력
		// 예외가 발생되면 스택의 내용을 출력함.
		

	}

}
