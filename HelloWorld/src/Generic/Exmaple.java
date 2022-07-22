package Generic;

public class Exmaple {
	
	class Person<T>{
		public T info;
	}
	Person<String> p1 = new Person<String>();
	Person<StringBuilder> p2 = new Person<StringBuilder>();
}
