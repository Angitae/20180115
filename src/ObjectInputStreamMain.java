

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamMain {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		//ObjectInputStream : 원하는 DataType 형태 또는 인스턴스  
		//(객체)로 입력받기 위한 메소드를 제공하는 입력 클래스
		ObjectInputStream ois=new ObjectInputStream
				(new FileInputStream("c:/test/object.txt"));
		
		//readObject() : 입력 스트림으로부터 객체를 읽기 위한 메소드
		// => Object 인스턴스로 반환하므로 반드시 객체 형변환을 해야만 된다.
		String string=(String)ois.readObject();
		Date date=(Date)ois.readObject();
		@SuppressWarnings("unchecked")
		List<String> list=(List<String>)ois.readObject();
		
		//참조변수 출력시 toString() 메소드 자동 호출
		System.out.println("String instance = "+string);
		System.out.println("Date instance = "+date);
		System.out.println("List instance = "+list);
		
		ois.close();
	}
}





