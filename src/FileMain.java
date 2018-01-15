

import java.io.File;
import java.io.IOException;

//File Ŭ���� : ����(���丮)�� �����ϱ� ���� �޼ҵ带 �����ϴ� Ŭ����
public class FileMain {
	public static void main(String[] args) throws IOException {
		//File �ν��Ͻ� ���� => ���� ��� ����
		File fileOne=new File("c:\\test");
		
		//exists() : File �ν��Ͻ��� ���ϼҽ��� ������ ��� true 
		//��ȯ, ������ false ��ȯ�ϴ� �޼ҵ�
		if(!fileOne.exists()) {
			//mkdir() : File �ν��Ͻ��� ���ϼҽ��� ���丮 ����
			// => false:���� ����  true:���� ���� 
			if(fileOne.mkdir()) {
				System.out.println("���丮�� ���������� ���� �Ͽ����ϴ�.");
			} else {
				System.out.println("���丮�� �������� ���߽��ϴ�.");
			}
		} else {
			System.out.println("�̹� ���� �̸��� ���丮�� �����մϴ�.");
		}
		System.out.println("===================================");
		File fileTwo=new File("c:\\test\\aaa.txt");
		if(!fileTwo.exists()) {
			//createNewFile() : File �ν��Ͻ��� ���ϼҽ��� ���� ����
			// => false:���� ����  true:���� ���� 
			if(fileTwo.createNewFile()) {
				System.out.println("������ ���������� ���� �Ͽ����ϴ�.");
			} else {
				System.out.println("������ �������� ���߽��ϴ�.");
			}
		} else {
			System.out.println("�̹� ���� �̸��� ������ �����մϴ�.");
		}
		System.out.println("===================================");
		//File fileThree=new File("c:/test/bbb.txt");
		//File fileThree=new File("c:/test","bbb.txt");
		File fileThree=new File(fileOne,"bbb.txt");
		if(fileThree.exists()) {
			//delete() : File �ν��Ͻ��� ���ϼҽ��� ���� ����
			// => false:���� ����  true:���� ���� 
			if(fileThree.delete()) {
				System.out.println("������ ���������� ���� �Ͽ����ϴ�.");
			} else {
				System.out.println("������ ���� ���� ���߽��ϴ�.");
			}
 		} else {
			System.out.println("�����ϰ��� �ϴ� ������ �������� �ʽ��ϴ�.");
		}
		System.out.println("===================================");
		//�۾� ���丮 => workspace\������Ʈ��
		//ex) c:\java\workspace\java-3
		File fileFour=new File("src");
		//�������̵� ����� toString() �޼ҵ尡 ȣ��Ǿ� ���ϼҽ� ��ȯ ���
		System.out.println("����� = "+fileFour);
		//getAbsolutePath() : ���ϼҽ��� �����θ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("������ = "+fileFour.getAbsolutePath());
		System.out.println("===================================");
		File fileFive=new File("c:/");
		//isDirectory() : ���ϼҽ��� �Ϲ������� ��� false ��ȯ,
		//���丮�� ��� true�� ��ȯ�ϴ� �޼ҵ�
		if(fileFive.isDirectory()) {
			//listFiles() : ���丮 ������ �����ϴ� ����
			//(���丮)���� File �ν��Ͻ� �迭�� ��ȯ�ϴ� �޼ҵ�
			File[] subFiles=fileFive.listFiles();
			
			for(File file:subFiles) {
				//isFile() : ���ϼҽ��� ���丮�� ��� false ��ȯ,
				//�Ϲ������� ��� true�� ��ȯ�ϴ� �޼ҵ�
				if(file.isFile()) {
					System.out.println(file);
				} else {
					System.out.println("["+file+"]");
				}
			}
		}
		System.out.println("===================================");
	}
}









