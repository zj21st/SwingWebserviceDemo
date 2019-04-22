package client;

 
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
 
/**
 * �������������
 * @author Administrator
 *
 */
public class Calc extends JFrame{
	private void initFrame() {
		try {
			String lookAndFeel ="com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
			UIManager.setLookAndFeel(lookAndFeel);
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setSize(300, 420);
		this.setTitle("SIMPLE_CALC");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		// JTextField���÷���ʱ����
		JTextField jtf = this.topSurface();

/*		JPanel CalPanel = new JPanel();
		CalPanel.setBounds(5,60,300,50);		
		JTextField t1 = new JTextField();
		t1.setText("wewewe");
		CalPanel.add(t1);*/
		
		JPanel CalPanel = new JPanel();
		CalPanel.setBounds(0,60,300,50);		
		JComboBox status = new JComboBox();
		status.addItem("���ؼ���");
		status.addItem("Զ�̼���");
		CalPanel.add(status);
		
		
		
		this.add(CalPanel);
		
		this.bottomSurface(jtf,status);
		this.setVisible(true);
	}
	private JTextField topSurface(){
		JPanel topPanel = new JPanel();
		topPanel.setBounds(-5,10,300,50);
		JTextField jtf = new JTextField(16);
		// �����ļ��ұ���������
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setForeground(Color.red);
		jtf.setFont(new Font("SansSerif",Font.PLAIN,20));
		jtf.setEditable(false);
		jtf.setText("0");
		topPanel.add(jtf);
		this.add(topPanel);
		return jtf;
	}
	
	
	private void bottomSurface(JTextField jtf,JComboBox status){
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(8,100,270,250);
		bottomPanel.setLayout(new GridLayout(5,4,10,10));
		
		String[] buttonValue = {"1","2","3","C",
								"4","5","6","CE",
								"7","8","9","��",
								"+","-","0",".",
								"*","/","%","="};
		// �����������ظ�����
		CalcListener cl = new CalcListener(jtf,status);
		for (int i = 0; i < buttonValue.length; i++) {
			JButton button = new JButton(buttonValue[i]);
			button.setBorder(BorderFactory.createRaisedBevelBorder());
			button.setFont(new Font("����", 0, 25));
			button.setForeground(Color.blue);
			bottomPanel.add(button);
			button.addActionListener(cl);
		}
		
		this.add(bottomPanel);
	}
	
	

	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.initFrame();
	}
}