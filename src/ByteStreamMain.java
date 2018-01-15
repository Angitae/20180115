
import java.io.IOException;

//키보드로 입력된 데이타를 문자(1Byte)로 읽어 콘솔 화면에 출력하는 프로그램
public class ByteStreamMain {
	public static void main(String[] args) throws IOException {
		System.out.println("키보드로 문자를 입력해 보세요.[종료:Ctrl+Z]");
		
		//키보드에서 입력된 문자를 저장하기 위한 변수
		int readByte;
		
		while(true) {
			//System.in : 기본적으로 제공되는 키보드 데이타를 읽을
			//수 있는 InputStream 클래스로 작성된 인스턴스
			// => 기본적인 키보드 입력 스트림
			//read() : 입력 스트림에서 문자를 읽어 반환하는 메소드
			// => 입력 스트림에 읽을 문자가 존재하지 않을 경우 스레드 일시 중지
			// => 키보드를 눌러 데이타 입력 후 엔터를 누르면 스레드 재실행
			readByte=System.in.read();
			
			//입력 종료를 표현하는 단축키 : Ctrl+Z => -1 발생(EOF - End Of File)
			if(readByte==-1) break;
			
			//System.out : 기본적으로 제공되는 콘솔 화면에 출력 할
			//수 있는 OutputStream(PrintStream) 클래스로 작성된 인스턴스
			// => 기본적인 콘솔 출력 스트림
			//write(정수) : 정수값에 해당하는 코드의 문자를 콘솔로 전달하여 출력하는 메소드 
			System.out.write(readByte);
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
