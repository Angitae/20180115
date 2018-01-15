

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Ű����� �Էµ� ����Ÿ�� ����(2Byte)�� �о� �ܼ� ȭ�鿡 ����ϴ� ���α׷�
// => CharacterSet(ĳ���ͼ�) : 1Byte ���ڸ� ���ڵ��Ͽ� 2Byte ���ڷ� ��ȯ
public class CharacterStreamMain {
	public static void main(String[] args) throws IOException {
		System.out.println("Ű����� ���ڸ� �Է��� ������.[����:Ctrl+Z]");
		
		int readByte;
		
		//InputStreamReader Ŭ���� : 1Byte ���ڸ� 2Byte ���ڷ� 
		//��ȯ�Ͽ� ���� �� �ִ� �Է� Ŭ����
		// => System.in �Է� ��Ʈ���� Ȯ���Ͽ� ���(��Ʈ�� �ٴܰ� ����)
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//OutputStreamWriter Ŭ���� : 1Byte ���ڸ� 2Byte ���ڷ� 
		//��ȯ�Ͽ� ������ �� �ִ� ��� Ŭ����
		// => System.,out ��� ��Ʈ���� Ȯ���Ͽ� ���(��Ʈ�� �ٴܰ� ����)
		//OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		//OutputStreamWriter Ŭ���� ��� PrintWriter Ŭ���� ��� ����
		PrintWriter pw=new PrintWriter(System.out);
		
		while(true) {
			readByte=isr.read();
			if(readByte==-1) break;
			//Writer Ŭ������ ��ӹ��� ��� �ν��Ͻ��� ��Ʈ����
			//2Byte ���ڸ� ��Ƽ� �� ���� �����Ϸ��� �Ӽ��� ����
			//osw.write(readByte);
			pw.write(readByte);
			//flush() : 2Byte ���ڸ� ��� ��Ʈ������ ������ �����ϱ� ���� �޼ҵ�
			//osw.flush();
			pw.flush();
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}





