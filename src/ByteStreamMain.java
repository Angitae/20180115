
import java.io.IOException;

//Ű����� �Էµ� ����Ÿ�� ����(1Byte)�� �о� �ܼ� ȭ�鿡 ����ϴ� ���α׷�
public class ByteStreamMain {
	public static void main(String[] args) throws IOException {
		System.out.println("Ű����� ���ڸ� �Է��� ������.[����:Ctrl+Z]");
		
		//Ű���忡�� �Էµ� ���ڸ� �����ϱ� ���� ����
		int readByte;
		
		while(true) {
			//System.in : �⺻������ �����Ǵ� Ű���� ����Ÿ�� ����
			//�� �ִ� InputStream Ŭ������ �ۼ��� �ν��Ͻ�
			// => �⺻���� Ű���� �Է� ��Ʈ��
			//read() : �Է� ��Ʈ������ ���ڸ� �о� ��ȯ�ϴ� �޼ҵ�
			// => �Է� ��Ʈ���� ���� ���ڰ� �������� ���� ��� ������ �Ͻ� ����
			// => Ű���带 ���� ����Ÿ �Է� �� ���͸� ������ ������ �����
			readByte=System.in.read();
			
			//�Է� ���Ḧ ǥ���ϴ� ����Ű : Ctrl+Z => -1 �߻�(EOF - End Of File)
			if(readByte==-1) break;
			
			//System.out : �⺻������ �����Ǵ� �ܼ� ȭ�鿡 ��� ��
			//�� �ִ� OutputStream(PrintStream) Ŭ������ �ۼ��� �ν��Ͻ�
			// => �⺻���� �ܼ� ��� ��Ʈ��
			//write(����) : �������� �ش��ϴ� �ڵ��� ���ڸ� �ַܼ� �����Ͽ� ����ϴ� �޼ҵ� 
			System.out.write(readByte);
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
