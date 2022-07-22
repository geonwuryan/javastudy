package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		// 배열로 읽기
		InputStream is = new FileInputStream("/Users/test.rtf");
		byte[] readBytes = new byte[3];
		int num;   // 읽은 바이트 
		while((num = is.read(readBytes)) != 0) { // EOF이 아닐 떄까지
			System.out.println(num);
			data += new String(readBytes);
			
		}
		System.out.println(data);
		is.close();

	}

}
