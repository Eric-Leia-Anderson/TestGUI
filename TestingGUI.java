package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TestingGUI {

	private JFrame frame;
	private JTextField txtClickTheCheck;
	private JTextField txtPleaseChooseThe;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Color col;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestingGUI window = new TestingGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestingGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		col = Color.red;
		
		txtClickTheCheck = new JTextField();
		txtClickTheCheck.setText("Click the check mark below to confirm you are human...");
		txtClickTheCheck.setBounds(21, 22, 321, 19);
		frame.getContentPane().add(txtClickTheCheck);
		txtClickTheCheck.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Definitely human!");
		chckbxNewCheckBox.setBounds(83, 54, 169, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Black");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(251, 213, 103, 21);
		rdbtnNewRadioButton.setActionCommand("black");
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Red");
		buttonGroup.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_1.setBounds(21, 213, 169, 21);
		rdbtnNewRadioButton_1.setActionCommand("red");
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		
		txtPleaseChooseThe = new JTextField();
		txtPleaseChooseThe.setText("Please choose a color");
		txtPleaseChooseThe.setBounds(10, 186, 353, 19);
		frame.getContentPane().add(txtPleaseChooseThe);
		txtPleaseChooseThe.setColumns(10);
		
		Label label = new Label("Canvas area");
		label.setBounds(269, 116, 126, 21);
		frame.getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textPane.setBackground(col);
				textPane.setText("x");
			}
		});
		textPane.setBounds(30, 91, 21, 19);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textPane_1.setForeground(col);
				textPane_1.setText("x");
			}
		});
		textPane_1.setBounds(61, 91, 21, 19);
		frame.getContentPane().add(textPane_1);
	}
}
