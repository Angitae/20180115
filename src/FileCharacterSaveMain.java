

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Ű����� �Էµ� ����Ÿ�� ����(2Byte)�� �о� ���Ͽ� �����ϴ� ���α׷�
public class FileCharacterSaveMain {
	public static void main(String[] args) throws IOException {
		System.out.println("���Ͽ� �����ϰ��� �ϴ� ������ �Է��� �ּ���.[����:Ctrl+Z]");

		//Ű����� �Էµ� ����Ÿ�� ���ڵ��Ͽ� 2Byte ���ڷ� �б� ���� �Է� ��Ʈ�� ����
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//FileWriter : ���Ͽ� ����(2Byte)�� �����Ͽ� �����ϱ� ���� ��� Ŭ����
		//FileWriter fw=new FileWriter("c:/test/character.txt");

		FileWriter fw=new FileWriter("c:/test/character.txt",true);
		
		int readByte;
		while(true) {
			readByte=isr.read();
			if(readByte==-1) break;
			fw.write(readByte);
			fw.flush();//���� ��� ��Ʈ������ ������ ���� ����
		}
		
		fw.close();
		System.out.println("c:\\test\\character.txt ������ ������ Ȯ���� ������.");		
	}
}
