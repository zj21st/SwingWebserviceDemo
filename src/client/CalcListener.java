package client;
/**
 * @author
 * @vision createtime:2016上午11:42:00
 */

 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import client.wsdl.ServerMain;
import client.wsdl.ServerMainService;

 
/**
 * 处理计算器逻辑运算
 * 
 * @author Administrator
 *
 */
public class CalcListener implements ActionListener {
	private JTextField jtf;
	private JComboBox calType;//0本地计算 1远程计算
	// 创建字符缓冲区域
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
		// case同时写多个条件，数字的基本处理
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
 
		// 清空输入框中内容
		case "C":
		case "CE":
			// 清空StringBuffer
			sb.setLength(0);
			jtf.setText("0");
			break;
 
		// 退格
		case "←":
			break;
 
		// 四则运算处理 处理两个运算符问题两个点 TODO
		case "=":
			String content = jtf.getText();
			String rs = "";
			if (calType.getSelectedIndex() ==  0){
				 rs = CalLogic.run(content);
			}else {
				ServerMainService hwss = new ServerMainService(); 
			     //HelloWebService hws = hwss.getHelloWebServicePort();
			     ServerMain hws = hwss.getServerMainPort();
			      rs=hws.runCal(content); 
			}  
		     
			jtf.setText(String.valueOf(rs));
			break;
		}
	}
}