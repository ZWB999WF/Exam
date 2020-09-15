package exam;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.io.IOException;

import javax.swing.JSeparator;
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;
	private JPasswordField passwordField_psd;
	private JRadioButton rdbtnNewRadioButton_tea;
	private JRadioButton rdbtnNewRadioButton_stu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					Login frame = new Login();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	
	public Login() {
		setTitle("\u767B\u9646\u754C\u9762");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP-PC\\Desktop\\\u5B66\u751F\u6210\u7EE9\u7BA1\u7406.jpg"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_id = new JTextField();
		textField_id.addActionListener(new ActionListener() {    //文本域敲击 "Enter"触发此事件
			public void actionPerformed(ActionEvent arg0) {
				passwordField_psd.requestFocus();  //密码域获得焦点
			}
		});
		textField_id.setColumns(10);
		textField_id.setBounds(274, 136, 209, 35);
		contentPane.add(textField_id);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setIcon(null);
		lblId.setFont(new Font("宋体", Font.PLAIN, 28));
		lblId.setBounds(181, 136, 64, 35);
		contentPane.add(lblId);
		
		JLabel label_psd = new JLabel("\u5BC6\u7801");
		label_psd.setHorizontalAlignment(SwingConstants.CENTER);
		label_psd.setIcon(null);
		label_psd.setFont(new Font("宋体", Font.PLAIN, 28));
		label_psd.setBounds(182, 204, 74, 41);
		contentPane.add(label_psd);
		
		passwordField_psd = new JPasswordField();
		passwordField_psd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName = textField_id.getText().toString().trim();
				String psd = new String(passwordField_psd.getPassword());
				if(rdbtnNewRadioButton_tea.isSelected()){
					new Event_login().select_tea(userName,psd);
				}
				if(rdbtnNewRadioButton_stu.isSelected()){
					new Event_login().select_stu(userName,psd);
				}
			}
		});
		passwordField_psd.setEchoChar('*');
		passwordField_psd.setDragEnabled(true);
		passwordField_psd.setDoubleBuffered(true);
		passwordField_psd.setBounds(274, 213, 209, 34);
		contentPane.add(passwordField_psd);
		
		JButton button_login = new JButton("\u767B\u5F55");
		button_login.setIcon(null);
		button_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = textField_id.getText().toString().trim();
				String psd = new String(passwordField_psd.getPassword());
				if(rdbtnNewRadioButton_tea.isSelected()){
					new Event_login().select_tea(userName,psd);
				}
				if(rdbtnNewRadioButton_stu.isSelected()){
					new Event_login().select_stu(userName,psd);
				}
			}
		});
		button_login.setBounds(230, 347, 64, 26);
		contentPane.add(button_login);
		
		JButton button_register = new JButton("\u6CE8\u518C");
		
		
		button_register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(rdbtnNewRadioButton_tea.isSelected())
				{
					Tea_register psdrt=new Tea_register();
			        psdrt.setVisible(true);
				}  else{
					Stu_register psdrt=new Stu_register();
				    psdrt.setVisible(true);
				}
			}
		});
		button_register.setBounds(364, 347, 64, 26);
		contentPane.add(button_register);
		
		JButton button_exit = new JButton("\u9000\u51FA");
		button_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		button_exit.setFont(new Font("宋体", Font.PLAIN, 12));
		button_exit.setBounds(547, 491, 64, 26);
		contentPane.add(button_exit);
		
		rdbtnNewRadioButton_tea = new JRadioButton("\u6559\u5E08\u7AEF");
		rdbtnNewRadioButton_tea.setBounds(228, 279, 74, 23);
		contentPane.add(rdbtnNewRadioButton_tea);
		
		rdbtnNewRadioButton_stu = new JRadioButton("\u5B66\u751F\u7AEF");
		rdbtnNewRadioButton_stu.setSelected(true);
		rdbtnNewRadioButton_stu.setBounds(342, 279, 74, 23);
		contentPane.add(rdbtnNewRadioButton_stu);
		ButtonGroup btngp=new ButtonGroup();
		btngp.add(rdbtnNewRadioButton_tea);
		btngp.add(rdbtnNewRadioButton_stu);
		
		JButton btnNewButton_forgetpsd = new JButton("\u5FD8\u8BB0\u5BC6\u7801\uFF1F");
		btnNewButton_forgetpsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_tea.isSelected())
				{
					Tea_psdreset psdrt=new Tea_psdreset();
			        psdrt.setVisible(true);
				}  else{
					Stu_psdreset psdrt=new Stu_psdreset();
				    psdrt.setVisible(true);
				}
				
			}
		});
		btnNewButton_forgetpsd.setBounds(276, 404, 104, 23);
		contentPane.add(btnNewButton_forgetpsd);
		
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Runtime r=Runtime.getRuntime();
				try {
					Process p=r.exec("cmd /c start C:/Users/HP-PC/Desktop/SourceCode/网站制作/index.html");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		textArea.setText("\u5236\u4F5C\u4EBA\uFF1A\u8BA1\u7B97\u673A142  \u8D75\u6587\u6CE2\r\n   phone\uFF1A18841603190\r\n      qq\uFF1A1643054079");
		textArea.setLineWrap(true);
		textArea.setForeground(Color.MAGENTA);
		textArea.setEditable(false);
		textArea.setCaretColor(Color.CYAN);
		textArea.setBorder(null);
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(252, 457, 176, 60);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("\u5B66\u751F\u5728\u7EBF\u8003\u8BD5\u7CFB\u7EDF");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 36));
		label.setBounds(134, 31, 380, 50);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(0, 91, 650, 5);
		contentPane.add(separator);
	}
	
}
