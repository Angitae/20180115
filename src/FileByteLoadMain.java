

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일에 저장된 데이타를 문자(1Byte)로 읽어 콘솔 화면에 출력하는 프로그램
public class FileByteLoadMain {
	public static void main(String[] args) throws IOException {
		System.out.println("c:\\test\\byte.txt 파일의 내용 >>");
		
		//FileInputStream : 파일에 저장된 데이타를 문자(1Byte)로 읽기 위한 클래스
		// => 파일이 존재 하지 않을 경우 프로그램 종료
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("c:/test/byte.txt");
		} catch (FileNotFoundException e) {
			System.out.println("소스파일이 존재하지 않아 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		int readByte;
		while(true) {
			//파일 입력 스트림에서 문자(1Byte)를 반환받아 저장
			readByte=fis.read();
			if(readByte==-1) break;
			System.out.write(readByte);
		}
		
		fis.close();
	}
}
