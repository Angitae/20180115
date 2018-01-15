
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

//Console Desktop Application������ Ű���� �Է� �� �ܼ� ��� ���α׷�
// => �̸��� �¾ �⵵�� Ű����� �Է¹޾� �̸��� ���� ���
public class ConsoleIOMain {
	public static void main(String[] args) throws IOException {
		//System.in : 1Byte ���ڸ� �б� ���� �Է� ��Ʈ�� - �⺻ Ű���� �Է� ��Ʈ��
		//InputStreamReader : 1Byte ���ڸ� 2Byte ���ڷ� ���ڵ��Ͽ� �б� ���� �Է� ��Ʈ��\
		//BufferedReader : 2Byte ���ڸ� �Ѳ����� ���� �� �б� ���� �Է� ��Ʈ��
		BufferedReader br=new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է� >> ");
		String name=br.readLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		int year=Integer.parseInt(br.readLine());
		
		@SuppressWarnings("deprecation")
		int age=(new Date().getYear()+1900)-year+1;
		
		System.out.println(name+"���� ���̴� "+age+"���Դϴ�.");
	}
}


