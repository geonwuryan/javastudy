package exam03;

public class Exam3_10 {

	public static void main(String[] args) {
		char ch = 'A' ;
		
		char lowerCase = ('A' <= ch && ch <= 'z') ? (char)(ch+32) : ch ;
		
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase:" + lowerCase);

	}

}
