package client;
/**
 * @author
 * @vision createtime:2016����11:42:00
 */

 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;
 
/**
 * ����������߼�����
 * 
 * @author Administrator
 *
 */
public class CalcListener implements ActionListener {
	private JTextField jtf;
	private JComboBox calType;//0���ؼ��� 1Զ�̼���
	// �����ַ���������
	String content = "";
	private StringBuffer sb = new StringBuffer();
 
	public CalcListener(JTextField jtf,JComboBox calType) {
		this.jtf = jtf;
		this.calType = calType;
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch (command) {
		// caseͬʱд������������ֵĻ�������
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
		case ".":
		case "+":
		case "-":
		case "*":
		case "/":
		case "%":
			sb.append(command);
			jtf.setText(sb.toString().trim());
			break;
 
		// ��������������
		case "C":
		case "CE":
			// ���StringBuffer
			sb.setLength(0);
			jtf.setText("0");
			break;
 
		// �˸�
		case "��":
			break;
 
		// �������㴦�� ����������������������� TODO
		case "=":
			String content = jtf.getText();
			String rs = "";
			if (calType.getSelectedIndex() ==  0){
				 rs = CalLogic.run(content);
			}else {
				HelloWebServiceService hwss = new HelloWebServiceService(); 
			     HelloWebService hws = hwss.getHelloWebServicePort();
			      rs=hws.helloWord(content); 
			}  
		     
			jtf.setText(String.valueOf(rs));
			break;
		}
	}
}