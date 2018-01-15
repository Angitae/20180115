

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamMain {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		//ObjectInputStream : ���ϴ� DataType ���� �Ǵ� �ν��Ͻ�  
		//(��ü)�� �Է¹ޱ� ���� �޼ҵ带 �����ϴ� �Է� Ŭ����
		ObjectInputStream ois=new ObjectInputStream
				(new FileInputStream("c:/test/object.txt"));
		
		//readObject() : �Է� ��Ʈ�����κ��� ��ü�� �б� ���� �޼ҵ�
		// => Object �ν��Ͻ��� ��ȯ�ϹǷ� �ݵ�� ��ü ����ȯ�� �ؾ߸� �ȴ�.
		String string=(String)ois.readObject();
		Date date=(Date)ois.readObject();
		@SuppressWarnings("unchecked")
		List<String> list=(List<String>)ois.readObject();
		
		//�������� ��½� toString() �޼ҵ� �ڵ� ȣ��
		System.out.println("String instance = "+string);
		System.out.println("Date instance = "+date);
		System.out.println("List instance = "+list);
		
		ois.close();
	}
}





