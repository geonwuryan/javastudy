package IO;

public class WhriteExample {
	
/*
 * OutputStream : 바이트 단위로 출력하는 최상위 추상 클래스
 * OutputStream 클래스를 상속해서 클래스를 만든다.
 * - FileOutputStream : 파일에 출력
 * - BufferedOutputStream : 버퍼를 사용해서 출력 성능을 높일 때
 * - DataOutputStream : 데이터타입 형태로 출력 할 때  -> 순서가 중요하다(쓰고 읽을 때)
 *  + int int byte byte -> int int byte byte
 *  ObjectOutputStream : 객체단위로 출력 할 때 사용
 *  - 제공되는 메소드 : 
 *  + write(ch) : 1 바이트를 쓰기
 *  + write(byte[] bytes) 배열 단위로 쓰기 -> 반환값은 쓴 바이트 수
 *  + write(byte[] b, int offset, int les) : 배열의 일정한 크기를 쓸 때
 *  + flush : 버퍼에 저장된 데이터를 출력
 *  + close : 자원 납
 */

	public static void main(String[] args) {
		// 쓰기
		// 예외 처리가 필요한 이유 : 쓰기 금지가 되어 있을 경우, I/O 동작 중 예외 발생(선이 끊어진다.)
		// 파일 시스템의 여유 공간이 부족할 경우
	}
	
		// os.flush(); 버퍼에 저장된 내용을 빨리 써라.

}
