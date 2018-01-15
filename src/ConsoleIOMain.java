
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

//Console Desktop Application에서의 키보드 입력 및 콘솔 출력 프로그램
// => 이름과 태어난 년도를 키보드로 입력받아 이름과 나이 출력
public class ConsoleIOMain {
	public static void main(String[] args) throws IOException {
		//System.in : 1Byte 문자를 읽기 위한 입력 스트림 - 기본 키보드 입력 스트림
		//InputStreamReader : 1Byte 문자를 2Byte 문자로 인코딩하여 읽기 위한 입력 스트림\
		//BufferedReader : 2Byte 문자를 한꺼번에 여러 개 읽기 위한 입력 스트림
		BufferedReader br=new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 >> ");
		String name=br.readLine();
		
		System.out.print("태어난 년도 입력 >> ");
		int year=Integer.parseInt(br.readLine());
		
		@SuppressWarnings("deprecation")
		int age=(new Date().getYear()+1900)-year+1;
		
		System.out.println(name+"님의 나이는 "+age+"살입니다.");
	}
}


