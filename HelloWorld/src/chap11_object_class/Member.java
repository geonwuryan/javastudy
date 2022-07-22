package chap11_object_class;


// 모든 클래스는 Object 클래스를 상속받는다.
// clone(), finalize(), toString(), equals(), hasdhCode()
// equals() -> 비교 -> 기본적으로 주소를 비 -> 논리적 동등비교(equals() 메소드를 재정의 해야함)
// hashCode() -> 물리적인 id를 반환 : 물리적으로 다른 놈이면 다른 값을 반환
// 논리적 동등 비교를 하려면 물리적으로 다르더라도 같은 hashCode를 가지도록 재정의 해주어야 함.
// toString() -> 클래스의 패키지 경로와 클래스의 주소를 출력 하도록 되있음.
// 객체를 출력할 때 객체의 toString() 메소드가 호출이 됨.
// 주소는 사용자에게 별 의미 없는 값
// 클래스의 정보를 출력하도록 재정의 해야함.
// clone() -> 객체를 복제할 때 사용
// 얕은복제 : 클래스내에 참조변수나 배열이 있을 때, 주소만 복사
// 깊은복제 : 클래스내에 참조변수나 배열이 있을 때, 복사를 하는데 참조객체의 내용이나 배열을 복사.

public class Member {
	Object obj1 = new Object();

}
