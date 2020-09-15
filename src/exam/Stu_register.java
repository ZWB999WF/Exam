package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;




import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;

public class Stu_register extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_id;
	private JPasswordField passwordField_psd;
	private JPasswordField passwordField_confirmpsd;
	private JTextField textField_QQ;
	private JTextField textField_phone;
	private JTextField textField_name;
	private JPasswordField passwordField_idty;
	String regex="^14040\\d{4}";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Stu_register frame = new Stu_register();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Stu_register() {
		setTitle("\u5B66\u751F\u8D26\u53F7\u6CE8\u518C");
		
		setBounds(320, 60, 607, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("*ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(169, 42, 54, 26);
		lblId.setFont(new Font("宋体", Font.PLAIN, 24));
		contentPane.add(lblId);
		
		textField_id = new JTextField();
		textField_id.setToolTipText("ID\u5E94\u4EE5\u201C1404010\u201D\u5F00\u5934\uFF0C\u540E\u52A04\u4F4D\u6570\u5B57");
		textField_id.setBounds(253, 48, 163, 24);
		textField_id.setColumns(10);
		contentPane.add(textField_id);
		
		JLabel label_psd = new JLabel("*\u5BC6\u7801");
		label_psd.setHorizontalAlignment(SwingConstants.CENTER);
		label_psd.setBounds(149, 84, 95, 24);
		label_psd.setFont(new Font("宋体", Font.PLAIN, 24));
		contentPane.add(label_psd);
		
		passwordField_psd = new JPasswordField();
		passwordField_psd.setBounds(253, 85, 163, 23);
		passwordField_psd.setEchoChar('*');
		contentPane.add(passwordField_psd);
		passwordField_psd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent agrv){
				passwordField_confirmpsd.requestFocus();
			}
		});
		JLabel label_confirm = new JLabel("*\u786E\u8BA4");
		label_confirm.setHorizontalAlignment(SwingConstants.CENTER);
		label_confirm.setBounds(149, 118, 95, 37);
		label_confirm.setFont(new Font("宋体", Font.PLAIN, 24));
		contentPane.add(label_confirm);
		
		passwordField_confirmpsd = new JPasswordField();
		passwordField_confirmpsd.setBounds(253, 128, 162, 25);
		passwordField_confirmpsd.setEchoChar('*');
		contentPane.add(passwordField_confirmpsd);
		
		JRadioButton radioButton_male = new JRadioButton("\u7537");
		radioButton_male.setBounds(227, 276, 44, 23);
		contentPane.add(radioButton_male);
		
		JRadioButton radioButton_female = new JRadioButton("\u5973");
		radioButton_female.setBounds(321, 276, 44, 23);
		contentPane.add(radioButton_female);
		ButtonGroup btngp=new ButtonGroup();
		btngp.add(radioButton_male);
		btngp.add(radioButton_female);
		JLabel label_year = new JLabel("\u51FA\u751F\u5E74");
		label_year.setBounds(233, 320, 54, 15);
		contentPane.add(label_year);
		
		JComboBox comboBox_year = new JComboBox();
		comboBox_year.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006"}));
		comboBox_year.setBounds(305, 314, 60, 21);
		contentPane.add(comboBox_year);
		
		JLabel label_4_month = new JLabel("\u51FA\u751F\u6708");
		label_4_month.setBounds(233, 362, 54, 15);
		contentPane.add(label_4_month);
		
		JComboBox comboBox_month = new JComboBox();
		comboBox_month.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_month.setBounds(305, 359, 60, 21);
		contentPane.add(comboBox_month);
		
		textField_QQ = new JTextField();
		textField_QQ.setBounds(281, 447, 149, 21);
		textField_QQ.setColumns(10);
		contentPane.add(textField_QQ);
		
		JLabel label_QQ = new JLabel("QQ");
		label_QQ.setBounds(215, 447, 56, 18);
		label_QQ.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(label_QQ);
		
		JLabel label_phone = new JLabel("\u7535\u8BDD");
		label_phone.setBounds(215, 482, 56, 18);
		label_phone.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(label_phone);
		
		textField_phone = new JTextField();
		textField_phone.setBounds(281, 479, 149, 21);
		textField_phone.setColumns(10);
		contentPane.add(textField_phone);
		String regex="^14040\\d{4}";
		
		textField_id.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField_id.getText().equals("")){
					JOptionPane.showMessageDialog(null, "请输入ID", "提示",
							JOptionPane.INFORMATION_MESSAGE);}
				else if(!(textField_id.getText().matches(regex))){
					JOptionPane.showMessageDialog(null, "ID输入不合法", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else passwordField_psd.requestFocus();
				
			}
		});
		passwordField_confirmpsd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent agrv){
				String psd1=new String(passwordField_psd.getPassword());
			    String psd2=new String(passwordField_confirmpsd.getPassword());
				if(!psd1.equals(psd2)){
					JOptionPane.showMessageDialog(null, "两次密码输入不一致", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else passwordField_idty.requestFocus();
			}
		});
		JButton button_submit = new JButton("\u63D0\u4EA4");
		button_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String psd1=new String(passwordField_psd.getPassword());
			    String psd2=new String(passwordField_confirmpsd.getPassword());
			    String idty=new String(passwordField_idty.getPassword());
			if(textField_id.getText().equals("")){
				JOptionPane.showMessageDialog(null, "请输入ID", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			}  else if(!(textField_id.getText().matches(regex))){
				JOptionPane.showMessageDialog(null, "ID输入不合法", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			}   else if(!psd1.equals(psd2)){
				JOptionPane.showMessageDialog(null, "两次密码输入不一致", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			}  else if(idty.isEmpty()){
				JOptionPane.showMessageDialog(null, "请输入身份证后六位以用来找回密码", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				 try {
					    Getconnection conn1=new Getconnection();
						java.sql.Connection conn=  conn1.getconn();;
						//System.out.print("146");
						PreparedStatement pstmt = conn.prepareStatement("insert into user_stu values(?,?,?)");
						String text=textField_id.getText();
						String psd=new String(passwordField_psd.getPassword());
						//System.out.print();
						pstmt.setString(1, text);
						pstmt.setString(2, psd);
						pstmt.setString(3, idty);
						pstmt.execute();
						conn.close();
						JOptionPane.showMessageDialog(null, "注册成功", "提示",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			
			}
		});
		button_submit.setBounds(179, 540, 71, 31);
		button_submit.setFont(new Font("宋体", Font.PLAIN, 14));
		contentPane.add(button_submit);
		
		JButton button_cancle = new JButton("\u53D6\u6D88");
		button_cancle.setBounds(345, 540, 71, 31);
		button_cancle.setFont(new Font("宋体", Font.PLAIN, 14));
		contentPane.add(button_cancle);
		
		JButton button_exit = new JButton("\u9000\u51FA");
		button_exit.setBounds(520, 593, 71, 31);
		button_exit.setFont(new Font("宋体", Font.PLAIN, 14));
		contentPane.add(button_exit);
		
		JComboBox comboBox_dept = new JComboBox();
		comboBox_dept.setModel(new DefaultComboBoxModel(new String[] {"\u7535\u5B50\u4FE1\u606F\u5DE5\u7A0B\u5B66\u9662", "\u5916\u8BED\u5B66\u9662", "\u673A\u68B0\u5B66\u9662", "\u7406\u5B66\u9662", "\u8F66\u8F86\u5DE5\u7A0B\u5B66\u9662", "\u6CD5\u5B66\u9662", "\u7ECF\u6D4E\u4E0E\u91D1\u878D\u7BA1\u7406", "\u7535\u6C14\u5B66\u9662"}));
		comboBox_dept.setBounds(134, 399, 149, 26);
		contentPane.add(comboBox_dept);
		
		JLabel lblNewLabel_name = new JLabel("\u59D3\u540D");
		lblNewLabel_name.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_name.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel_name.setBounds(149, 218, 95, 37);
		contentPane.add(lblNewLabel_name);
		
		textField_name = new JTextField();
		textField_name.setBounds(253, 227, 163, 28);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"\u8BA1\u7B97\u673A142", "\u8BA1\u7B97\u673A141", "\u7535\u5B50141", "\u7535\u5B50142", "\u901A\u4FE1141", "\u901A\u4FE1142", "\u8F6F\u4EF6141", "\u8F6F\u4EF6142"}));
		comboBox_3.setBounds(315, 399, 149, 26);
		contentPane.add(comboBox_3);
		
		JLabel label__idty = new JLabel("*\u8EAB\u4EFD\u8BC1\u540E\u516D\u4F4D");
		label__idty.setToolTipText("\u7528\u6765\u627E\u56DE\u5BC6\u7801");
		label__idty.setHorizontalAlignment(SwingConstants.CENTER);
		label__idty.setFont(new Font("宋体", Font.PLAIN, 24));
		label__idty.setBounds(55, 171, 189, 37);
		contentPane.add(label__idty);
		
		passwordField_idty = new JPasswordField();
		passwordField_idty.setEchoChar('*');
		passwordField_idty.setBounds(253, 181, 162, 25);
		contentPane.add(passwordField_idty);
		
		JLabel lblNewLabel = new JLabel("\u6CE8\uFF1A\u6807\u6CE8*\u7684\u4E3A\u5FC5\u586B\uFF0C\u5176\u4F59\u4E3A\u9009\u586B");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 12));
		lblNewLabel.setBounds(204, 597, 203, 23);
		contentPane.add(lblNewLabel);
	}
}
