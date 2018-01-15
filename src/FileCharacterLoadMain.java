

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//파일에 저장된 데이타를 문자(2Byte)로 읽어 콘솔 화면에 출력하는 프로그램
public class FileCharacterLoadMain {
	public static void main(String[] args) throws IOException {
		System.out.println("c:\\test\\character.txt 파일의 내용 >>");
		
		//FileReader : 파일에 저장된 데이타를 문자(2Byte)로 읽기 위한 클래스
		FileReader fr=null;
		try {
			fr=new FileReader("c:/test/character.txt");
		} catch (FileNotFoundException e) {
			System.out.println("소스파일이 존재하지 않아 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		//1Byte 문자를 2Byte 문자로 변환하여 전달할 수 있는 출력 스트림 생성
		PrintWriter pw=new PrintWriter(System.out);
		
		int readByte;
		while(true) {
			readByte=fr.read();
			if(readByte==-1) break;
			pw.write(readByte);
			pw.flush();
		}
		
		fr.close();
	}
}



