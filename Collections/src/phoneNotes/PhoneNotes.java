package phoneNotes;

//PhoneNotes.java: �������� ������
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PhoneNotes extends JFrame {

	JTextField fldFio = new JTextField(25);
	JTextField fldPhone = new JTextField(25);
	JTextField fldCnt = new JTextField(4);
	
	public PhoneNotes() {
		super("�������� ������");
		try {
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) {
		}
		setSize(400, 250);
		Container c = getContentPane();
	
		// ����������� ������
		JPanel centerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
		centerPanel.setBorder(BorderFactory.createEtchedBorder());
		JLabel aLabel = new JLabel("������� ");
		centerPanel.add(aLabel);
		centerPanel.add(fldFio);
		aLabel = new JLabel("������� ");
		centerPanel.add(aLabel);
		centerPanel.add(fldPhone);
		JButton btn = new JButton("��������");
		centerPanel.add(btn);
		c.add(centerPanel, BorderLayout.CENTER);
		
		// ������ ������
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(BorderFactory.createEtchedBorder());
		aLabel = new JLabel("���������� ������� ");
		statusPanel.add(aLabel);
		fldCnt.setEnabled(false);
		statusPanel.add(fldCnt);
		c.add(statusPanel, BorderLayout.SOUTH);
		
		// Listener'� ����� � ������
		fldPhone.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// ???
			}
		});
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// ???
			}
		});
		WindowListener wndCloser = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(wndCloser);
	}
	
	public static void main(String[] args) {
		new PhoneNotes();
		}
	
}