

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 입력된 데이타를 문자(2Byte)로 읽어 파일에 저장하는 프로그램
public class FileCharacterSaveMain {
	public static void main(String[] args) throws IOException {
		System.out.println("파일에 저장하고자 하는 내용을 입력해 주세요.[종료:Ctrl+Z]");

		//키보드로 입력된 데이타를 인코딩하여 2Byte 문자로 읽기 위한 입력 스트림 생성
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//FileWriter : 파일에 문자(2Byte)를 전달하여 저장하기 위한 출력 클래스
		//FileWriter fw=new FileWriter("c:/test/character.txt");

		FileWriter fw=new FileWriter("c:/test/character.txt",true);
		
		int readByte;
		while(true) {
			readByte=isr.read();
			if(readByte==-1) break;
			fw.write(readByte);
			fw.flush();//파일 출력 스트림으로 무조건 문자 전송
		}
		
		fw.close();
		System.out.println("c:\\test\\character.txt 파일의 내용을 확인해 보세요.");		
	}
}
