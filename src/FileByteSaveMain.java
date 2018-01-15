

import java.io.FileOutputStream;
import java.io.IOException;

//키보드로 입력된 데이타를 문자(1Byte)로 읽어 파일에 저장하는 프로그램
public class FileByteSaveMain {
	public static void main(String[] args) throws IOException {
		System.out.println("파일에 저장하고자 하는 내용을 입력해 주세요.[종료:Ctrl+Z]");
		
		//FileOutputStream : 파일에 문자(1Byte)를 전달하여 저장하기 위한 출력 클래스
		// => 파일이 존재 하지 않을 경우 : 파일 생성 후 출력 스트림 생성  
		// => 파일이 존재할 경우 : 출력 스트림 생성 - 기존 파일 내용 덮어씌우기(OverWrite)
		//FileOutputStream fos=new FileOutputStream("c:/test/byte.txt");
		
		// => 파일이 존재할 경우 : 출력 스트림 생성 - 기존 파일 내용 뒤에 저장(Append)
		FileOutputStream fos=new FileOutputStream("c:/test/byte.txt",true);
		
		int readByte;
		while(true) {
			readByte=System.in.read();
			if(readByte==-1) break;
			fos.write(readByte);//파일 출력 스트림에 문자(1Byte) 전송(저장)
		}
		
		//파일 출력 스트림 제거
		fos.close();
		
		System.out.println("c:\\test\\byte.txt 파일의 내용을 확인해 보세요.");
	}
}
