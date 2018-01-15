

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelMain extends Frame {
	private static final long serialVersionUID = 1L;

	public PanelMain(String title) {
		super(title);
		
		//Frame 북쪽에 부착될 컴퍼넌트 생성
		Button btn1=new Button("빨간색");
		Button btn2=new Button("초록색");
		Button btn3=new Button("파란색");
		
		Panel panel=new Panel();
		//Panel 컨테이너의 Default LayoutManager가 FlowLayout이므로 변경 생략 
		//panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		//Frame 중앙에 부착될 컴퍼넌트 생성
		TextArea ta=new TextArea();
		
		//Frame 남쪽에 부착될 컴퍼넌트 생성
		TextField tf=new TextField();

		//컴퍼넌트 배경색 변경
		btn1.setBackground(new Color(255, 0, 0));
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.BLUE);
		panel.setBackground(Color.GRAY);
		tf.setBackground(Color.BLACK);
		
		//컴퍼넌트 글자색 변경
		tf.setForeground(Color.WHITE);
		
		//글꼴 및 크기 변경
		ta.setFont(new Font("굴림", Font.PLAIN, 20));		
		tf.setFont(new Font("궁서", Font.BOLD+Font.ITALIC, 16));		
		panel.setFont(new Font("굴림", Font.BOLD, 16));
		
		//컴퍼넌트 비활성화
		//ta.setEnabled(false);
		//ta.setEditable(false);//TextComponent에서만 사용 가능
		ta.setFocusable(false);//포커스가 위치하지 않도록 설정
		
		//컴퍼넌트(컨테이너)를 Frame에 부착
		add(panel,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		//Frame 크기 변경 불가
		setResizable(false);
		
		setBounds(400, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelMain("Panel");
	}
}