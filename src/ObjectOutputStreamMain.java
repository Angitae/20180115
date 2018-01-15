

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class ObjectOutputStreamMain {
	public static void main(String[] args) throws IOException {
		//ObjectOutputStream : ���ϴ� DataType ���� �Ǵ� �ν��Ͻ�  
		//(��ü)�� ����ϱ� ���� �޼ҵ带 �����ϴ� ��� Ŭ����
		ObjectOutputStream oos=new ObjectOutputStream
				(new FileOutputStream("c:/test/object.txt"));
		
		oos.writeObject(new String("ȫ�浿"));
		oos.writeObject(new Date());
		//Arrays.asList(��ü,��ü,...) : �迭�� List �ν��Ͻ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => �ʱⰪ���� ������ ��ü���� List �ν��Ͻ��� ����
		oos.writeObject(Arrays.asList
			("������ũ","�ҳ�ô�","�ɽ�����","����ģ��","����ũ"));
		
		oos.close();
		System.out.println("c:\\test\\object.txt ������ ������ Ȯ���� ������.");
	}
}