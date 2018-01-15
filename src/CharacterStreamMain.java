

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//키보드로 입력된 데이타를 문자(2Byte)로 읽어 콘솔 화면에 출력하는 프로그램
// => CharacterSet(캐릭터셋) : 1Byte 문자를 인코딩하여 2Byte 문자로 변환
public class CharacterStreamMain {
	public static void main(String[] args) throws IOException {
		System.out.println("키보드로 문자를 입력해 보세요.[종료:Ctrl+Z]");
		
		int readByte;
		
		//InputStreamReader 클래스 : 1Byte 문자를 2Byte 문자로 
		//변환하여 읽을 수 있는 입력 클래스
		// => System.in 입력 스트림을 확장하여 사용(스트림 다단계 연결)
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//OutputStreamWriter 클래스 : 1Byte 문자를 2Byte 문자로 
		//변환하여 전달할 수 있는 출력 클래스
		// => System.,out 출력 스트림을 확장하여 사용(스트림 다단계 연결)
		//OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		//OutputStreamWriter 클래스 대신 PrintWriter 클래스 사용 가능
		PrintWriter pw=new PrintWriter(System.out);
		
		while(true) {
			readByte=isr.read();
			if(readByte==-1) break;
			//Writer 클래스를 상속받은 출력 인스턴스는 스트림에
			//2Byte 문자를 모아서 한 번에 전달하려는 속성이 존재
			//osw.write(readByte);
			pw.write(readByte);
			//flush() : 2Byte 문자를 출력 스트림으로 무조건 전달하기 위한 메소드
			//osw.flush();
			pw.flush();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}





