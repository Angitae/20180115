

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class ObjectOutputStreamMain {
	public static void main(String[] args) throws IOException {
		//ObjectOutputStream : 원하는 DataType 형태 또는 인스턴스  
		//(객체)로 출력하기 위한 메소드를 제공하는 출력 클래스
		ObjectOutputStream oos=new ObjectOutputStream
				(new FileOutputStream("c:/test/object.txt"));
		
		oos.writeObject(new String("홍길동"));
		oos.writeObject(new Date());
		//Arrays.asList(객체,객체,...) : 배열을 List 인스턴스로 변환하여 반환하는 메소드
		// => 초기값으로 설정된 객체들이 List 인스턴스에 저장
		oos.writeObject(Arrays.asList
			("에이핑크","소녀시대","걸스데이","여자친구","블랙핑크"));
		
		oos.close();
		System.out.println("c:\\test\\object.txt 파일의 내용을 확인해 보세요.");
	}
}