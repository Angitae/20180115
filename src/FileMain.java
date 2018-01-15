

import java.io.File;
import java.io.IOException;

//File 클래스 : 파일(디렉토리)를 관리하기 위한 메소드를 제공하는 클래스
public class FileMain {
	public static void main(String[] args) throws IOException {
		//File 인스턴스 생성 => 파일 경로 설정
		File fileOne=new File("c:\\test");
		
		//exists() : File 인스턴스의 파일소스가 존재할 경우 true 
		//반환, 없으면 false 반환하는 메소드
		if(!fileOne.exists()) {
			//mkdir() : File 인스턴스의 파일소스로 디렉토리 생성
			// => false:생성 실패  true:생성 성공 
			if(fileOne.mkdir()) {
				System.out.println("디렉토리를 성공적으로 생성 하였습니다.");
			} else {
				System.out.println("디렉토리를 생성하지 못했습니다.");
			}
		} else {
			System.out.println("이미 같은 이름의 디렉토리가 존재합니다.");
		}
		System.out.println("===================================");
		File fileTwo=new File("c:\\test\\aaa.txt");
		if(!fileTwo.exists()) {
			//createNewFile() : File 인스턴스의 파일소스로 파일 생성
			// => false:생성 실패  true:생성 성공 
			if(fileTwo.createNewFile()) {
				System.out.println("파일을 성공적으로 생성 하였습니다.");
			} else {
				System.out.println("파일을 생성하지 못했습니다.");
			}
		} else {
			System.out.println("이미 같은 이름의 파일이 존재합니다.");
		}
		System.out.println("===================================");
		//File fileThree=new File("c:/test/bbb.txt");
		//File fileThree=new File("c:/test","bbb.txt");
		File fileThree=new File(fileOne,"bbb.txt");
		if(fileThree.exists()) {
			//delete() : File 인스턴스의 파일소스로 파일 삭제
			// => false:삭제 실패  true:삭제 성공 
			if(fileThree.delete()) {
				System.out.println("파일을 성공적으로 삭제 하였습니다.");
			} else {
				System.out.println("파일을 삭제 하지 못했습니다.");
			}
 		} else {
			System.out.println("삭제하고자 하는 파일이 존재하지 않습니다.");
		}
		System.out.println("===================================");
		//작업 디렉토리 => workspace\프로젝트명
		//ex) c:\java\workspace\java-3
		File fileFour=new File("src");
		//오버라이드 선언된 toString() 메소드가 호출되어 파일소스 반환 출력
		System.out.println("상대경로 = "+fileFour);
		//getAbsolutePath() : 파일소스의 절대경로를 반환하는 메소드
		System.out.println("절대경로 = "+fileFour.getAbsolutePath());
		System.out.println("===================================");
		File fileFive=new File("c:/");
		//isDirectory() : 파일소스가 일반파일인 경우 false 반환,
		//디렉토리인 경우 true를 반환하는 메소드
		if(fileFive.isDirectory()) {
			//listFiles() : 디렉토리 하위에 존재하는 파일
			//(디렉토리)들을 File 인스턴스 배열로 반환하는 메소드
			File[] subFiles=fileFive.listFiles();
			
			for(File file:subFiles) {
				//isFile() : 파일소스가 디렉토리인 경우 false 반환,
				//일반파일인 경우 true를 반환하는 메소드
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









