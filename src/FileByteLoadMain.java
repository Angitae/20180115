

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//���Ͽ� ����� ����Ÿ�� ����(1Byte)�� �о� �ܼ� ȭ�鿡 ����ϴ� ���α׷�
public class FileByteLoadMain {
	public static void main(String[] args) throws IOException {
		System.out.println("c:\\test\\byte.txt ������ ���� >>");
		
		//FileInputStream : ���Ͽ� ����� ����Ÿ�� ����(1Byte)�� �б� ���� Ŭ����
		// => ������ ���� ���� ���� ��� ���α׷� ����
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("c:/test/byte.txt");
		} catch (FileNotFoundException e) {
			System.out.println("�ҽ������� �������� �ʾ� ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		int readByte;
		while(true) {
			//���� �Է� ��Ʈ������ ����(1Byte)�� ��ȯ�޾� ����
			readByte=fis.read();
			if(readByte==-1) break;
			System.out.write(readByte);
		}
		
		fis.close();
	}
}
