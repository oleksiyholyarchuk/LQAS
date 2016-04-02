package dialog9home;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialog9Home extends JFrame {
	JTextField fldi = new JTextField(20);
	JTextField fldo = new JTextField(20);

	Dialog9Home() {
		super("Example");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		setSize(400, 150);
		Container c = getContentPane();
		JLabel lblin = new JLabel("Поле ввода ");
		JLabel lblout = new JLabel("Поле вывода ");
		JButton btn = new JButton("Скопировать");
		JPanel pnlout = new JPanel();
		JPanel pnlin = new JPanel();
		pnlin.add(lblin);
		pnlin.add(fldi);
		c.add(pnlin, BorderLayout.NORTH);
		pnlout.add(lblout);
		pnlout.add(fldo);
		c.add(pnlout, BorderLayout.CENTER);
		JPanel pnlBtn = new JPanel();
		pnlBtn.add(btn);
		c.add(pnlBtn, BorderLayout.SOUTH);
		// Listener для поля ввода
		fldi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fldo.setText(fldi.getText());
				fldi.setText("");
			}
		});
		// Listener для кнопки копирования.
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fldo.setText(fldi.getText());
				fldi.setText("");
				fldi.requestFocus();
			}
		});
		WindowListener wndCloser = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(wndCloser);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Dialog9Home();
	}
}