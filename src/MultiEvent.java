

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//색상버튼를 누른면 해당 버튼에서 지정된 색상으로 TextArea 컴퍼넌트의 배경색 변경
//프로그램 종료 MenuItem을 선택하면 프로그램 종료
//TextField 영역에 문자열 입력 후 엔터를 누른면 TextArea 영역에 출력
public class MultiEvent extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	//이벤트 관련 컴퍼넌트는 필드로 선언하여 사용
	Button btn1,btn2,btn3;
	TextArea ta;
	TextField tf;
	
	public MultiEvent(String title) {
		super(title);
		
		//메뉴를 생성하여 Frame에 부착
		MenuBar bar=new MenuBar();
		Menu menu=new Menu("파일");
		MenuItem item=new MenuItem("프로그램 종료");
		menu.add(item);
		bar.add(menu);
		setMenuBar(bar);
		
		//Button 컴퍼넌트의 Text 데이타가 기본 ActionCommand로 설정
		btn1=new Button("빨간색");
		btn2=new Button("초록색");
		btn3=new Button("파란색");
		
		//setActionCommand(String) : ActionCommand를 변경하는 메소드
		btn1.setActionCommand("RED");
		btn2.setActionCommand("GREEN");
		btn3.setActionCommand("BLUE");
		
		Panel panel=new Panel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		ta=new TextArea();
		tf=new TextField();

		btn1.setBackground(new Color(255, 0, 0));
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.BLUE);
		panel.setBackground(Color.GRAY);
		tf.setBackground(Color.BLACK);
		
		tf.setForeground(Color.WHITE);
		
		ta.setFont(new Font("굴림", Font.PLAIN, 20));		
		tf.setFont(new Font("궁서", Font.BOLD+Font.ITALIC, 16));		
		panel.setFont(new Font("굴림", Font.BOLD, 16));
		
		ta.setFocusable(false);
		
		add(panel,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		setResizable(false);
		
		//이벤트 발생시 이벤트 처리 핸들러 인스턴스의 메소드 호출
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		tf.addActionListener(this);
		item.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(400, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MultiEvent("Event");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent e : 이벤트 관련 인스턴스 정보가 저장된 참조변수
		/*
		//getActionCommand() : ActionCommand를 반환하는 메소드
		//ActionCommand : ActionEvent를 발생하는 이벤트 소스에 부여된 고유값
		String actionCommand=e.getActionCommand();
		
		if(actionCommand.equals("RED")) {
			ta.setBackground(Color.RED);
		} else if(actionCommand.equals("GREEN")) {
			ta.setBackground(Color.GREEN);
		} else if(actionCommand.equals("BLUE")) {
			ta.setBackground(Color.BLUE);
		}
		*/
		//getSource() : 이벤트를 발생한 컴퍼넌트를 반환하는 메소드
		Object eventSource=e.getSource();
		
		if(eventSource instanceof Button) {
			if(eventSource==btn1) {
				ta.setBackground(Color.RED);
			} else if(eventSource==btn2) {
				ta.setBackground(Color.GREEN);
			} else if(eventSource==btn3) {
				ta.setBackground(Color.BLUE);
			}
		} else if(eventSource instanceof TextField) {
			//getText() : 컴퍼넌트의 문자열을 반환하는 메소드 
			String message=tf.getText();
			if(!message.equals("")) {//입력 문자열이 존재할 경우
				//append(String) : TextArea 컴퍼넌트에 문자열을 추가하는 메소드
				ta.append(message+"\n");
				//setText(String) : 컴퍼넌트의 문자열을 변경하는 메소드
				tf.setText("");
			}
		} else if(eventSource instanceof MenuItem) {
			System.exit(0);
		}
	}
}












