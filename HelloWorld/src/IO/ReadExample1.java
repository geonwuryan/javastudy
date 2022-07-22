package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws IOException{
		// 한 바이트씩 읽기
		// InputStream은 추상클래스이므로 객체화를 할 수 없음
		InputStream is = new FileInputStream("C:/Temp/test.txt"); // 예외 처리 해주어야 함
		int readByte;
		while(true) {
			readByte = is.read(); // read() : 한 바이트씩 읽는다. -> 반환형은 int
			if(readByte == -1) {  // -1 : EOF(End Of File) -> 데이터의 맨 끝
				break; // 데이터를 다 읽었으므로 반복문 종
			}
			System.out.println((char)readByte);
		}
		is.close(); // 자원 반납.
		

	}

}
