

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingMain extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JButton btn1,btn2,btn3;
	JTextArea ta;
	JTextField tf;
	
	public SwingMain(String title) {
		super(title);
		
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("파일");
		JMenuItem item=new JMenuItem("프로그램 종료");
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
		btn1=new JButton("빨간색");
		btn2=new JButton("초록색");
		btn3=new JButton("파란색");
		
		btn1.setActionCommand("RED");
		btn2.setActionCommand("GREEN");
		btn3.setActionCommand("BLUE");
		
		JPanel panel=new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		ta=new JTextArea();
		tf=new JTextField();

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
		
		JScrollPane pane=new JScrollPane(ta);
		
		getContentPane().add(panel,BorderLayout.NORTH);
		getContentPane().add(pane,BorderLayout.CENTER);
		getContentPane().add(tf,BorderLayout.SOUTH);
		
		setResizable(false);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		tf.addActionListener(this);
		item.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(400, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingMain("Event");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource=e.getSource();
		
		if(eventSource instanceof JButton) {
			if(eventSource==btn1) {
				ta.setBackground(Color.RED);
			} else if(eventSource==btn2) {
				ta.setBackground(Color.GREEN);
			} else if(eventSource==btn3) {
				ta.setBackground(Color.BLUE);
			}
		} else if(eventSource instanceof JTextField) {
			String message=tf.getText();
			if(!message.equals("")) {
				ta.append(message+"\n");
				tf.setText("");
			}
		} else if(eventSource instanceof JMenuItem) {
			System.exit(0);
		}
	}
}