package static1;

import javax.swing.JOptionPane;

public class ����ƽ�޼������غ��� {

	public static void main(String[] args) {
		// ��ü�� �������� �ʾƵ�(new�� �������� �ʾƵ�) 
	String age = JOptionPane.showInputDialog("age�Է�"); 
		int age2 = Integer.parseInt(age);
		
		JOptionPane.showMessageDialog(null, (age2 + 1) +"��");
		System.exit(1);
		

	}

}