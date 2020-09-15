package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Tea_register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tea_register frame = new Tea_register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tea_register() {
		setTitle("\u6559\u5E08\u8D26\u53F7\u6CE8\u518C");
		setBounds(100, 100, 595, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID");
		label.setFont(new Font("宋体", Font.PLAIN, 24));
		label.setBounds(158, 56, 30, 26);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(218, 62, 163, 24);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		label_1.setBounds(149, 98, 60, 24);
		contentPane.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(218, 99, 163, 23);
		contentPane.add(passwordField);
		
		JLabel label_2 = new JLabel("\u786E\u8BA4");
		label_2.setFont(new Font("宋体", Font.PLAIN, 24));
		label_2.setBounds(149, 132, 60, 37);
		contentPane.add(label_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setEchoChar('*');
		passwordField_1.setBounds(218, 142, 162, 25);
		contentPane.add(passwordField_1);
		
		JRadioButton radioButton = new JRadioButton("\u7537");
		radioButton.setBounds(218, 229, 44, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u5973");
		radioButton_1.setBounds(300, 229, 44, 23);
		contentPane.add(radioButton_1);
		
		JLabel label_3 = new JLabel("\u51FA\u751F\u5E74");
		label_3.setBounds(207, 258, 54, 15);
		contentPane.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 258, 60, 21);
		contentPane.add(comboBox);
		
		JLabel label_4 = new JLabel("\u51FA\u751F\u6708");
		label_4.setBounds(206, 295, 54, 15);
		contentPane.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(278, 292, 60, 21);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(254, 380, 149, 21);
		contentPane.add(textField_1);
		
		JLabel label_5 = new JLabel("QQ");
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		label_5.setBounds(188, 380, 56, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u7535\u8BDD");
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		label_6.setBounds(188, 415, 56, 18);
		contentPane.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(254, 412, 149, 21);
		contentPane.add(textField_2);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(177, 472, 71, 31);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(318, 472, 71, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u9000\u51FA");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(508, 529, 71, 31);
		contentPane.add(button_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(107, 332, 149, 26);
		contentPane.add(comboBox_2);
		
		JLabel label_7 = new JLabel("\u59D3\u540D");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.PLAIN, 24));
		label_7.setBounds(149, 179, 60, 37);
		contentPane.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(218, 181, 163, 28);
		contentPane.add(textField_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(299, 331, 149, 26);
		contentPane.add(comboBox_3);
	}

}
