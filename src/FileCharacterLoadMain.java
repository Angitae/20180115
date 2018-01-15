

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//���Ͽ� ����� ����Ÿ�� ����(2Byte)�� �о� �ܼ� ȭ�鿡 ����ϴ� ���α׷�
public class FileCharacterLoadMain {
	public static void main(String[] args) throws IOException {
		System.out.println("c:\\test\\character.txt ������ ���� >>");
		
		//FileReader : ���Ͽ� ����� ����Ÿ�� ����(2Byte)�� �б� ���� Ŭ����
		FileReader fr=null;
		try {
			fr=new FileReader("c:/test/character.txt");
		} catch (FileNotFoundException e) {
			System.out.println("�ҽ������� �������� �ʾ� ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		//1Byte ���ڸ� 2Byte ���ڷ� ��ȯ�Ͽ� ������ �� �ִ� ��� ��Ʈ�� ����
		PrintWriter pw=new PrintWriter(System.out);
		
		int readByte;
		while(true) {
			readByte=fr.read();
			if(readByte==-1) break;
			pw.write(readByte);
			pw.flush();
		}
		
		fr.close();
	}
}



