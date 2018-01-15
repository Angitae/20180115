

import java.io.FileOutputStream;
import java.io.IOException;

//Ű����� �Էµ� ����Ÿ�� ����(1Byte)�� �о� ���Ͽ� �����ϴ� ���α׷�
public class FileByteSaveMain {
	public static void main(String[] args) throws IOException {
		System.out.println("���Ͽ� �����ϰ��� �ϴ� ������ �Է��� �ּ���.[����:Ctrl+Z]");
		
		//FileOutputStream : ���Ͽ� ����(1Byte)�� �����Ͽ� �����ϱ� ���� ��� Ŭ����
		// => ������ ���� ���� ���� ��� : ���� ���� �� ��� ��Ʈ�� ����  
		// => ������ ������ ��� : ��� ��Ʈ�� ���� - ���� ���� ���� ������(OverWrite)
		//FileOutputStream fos=new FileOutputStream("c:/test/byte.txt");
		
		// => ������ ������ ��� : ��� ��Ʈ�� ���� - ���� ���� ���� �ڿ� ����(Append)
		FileOutputStream fos=new FileOutputStream("c:/test/byte.txt",true);
		
		int readByte;
		while(true) {
			readByte=System.in.read();
			if(readByte==-1) break;
			fos.write(readByte);//���� ��� ��Ʈ���� ����(1Byte) ����(����)
		}
		
		//���� ��� ��Ʈ�� ����
		fos.close();
		
		System.out.println("c:\\test\\byte.txt ������ ������ Ȯ���� ������.");
	}
}
