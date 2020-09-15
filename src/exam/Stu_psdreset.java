package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;
import java.awt.Color;

public class Stu_psdreset extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_id;
	private JLabel lblNewLabel_state;
	private JPasswordField passwordField_idty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stu_psdreset frame = new Stu_psdreset();
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
	public String checkidty(){
		
		Getconnection  getconn=new Getconnection();
        java.sql.Connection conn=getconn.getconn();
		
	    String  identity="";
	    String id = textField_id.getText().toString().trim();
	    String sear_idty="select identity from user_stu where id='"+id+"'";
	        if(id.isEmpty()){
	        	
	    	  lblNewLabel_state.setText("请输入ID");
			}else {
				try {
					Statement stmt=conn.createStatement();
					stmt.execute(sear_idty);
	                ResultSet rs=stmt.executeQuery(sear_idty);
	                while(rs.next()){
	                identity= rs.getString("identity");
	                  }  
				 }  
				   catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			  }
		}
			return identity;
	}
	public Stu_psdreset() {
		setTitle("\u5B66\u751F\u7AEF\u5BC6\u7801\u627E\u56DE");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_psd = new JLabel("\u8EAB\u4EFD\u8BC1\u540E\u516D\u4F4D");
		label_psd.setHorizontalAlignment(SwingConstants.CENTER);
		label_psd.setFont(new Font("宋体", Font.PLAIN, 14));
		label_psd.setBounds(108, 127, 118, 26);
		contentPane.add(label_psd);
		
		JButton button_exit = new JButton("\u9000\u51FA");
		button_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_exit.setFont(new Font("宋体", Font.PLAIN, 14));
		button_exit.setBounds(474, 517, 89, 24);
		contentPane.add(button_exit);
		
		JLabel label_newpsd = new JLabel("\u65B0\u5BC6\u7801");
		label_newpsd.setHorizontalAlignment(SwingConstants.CENTER);
		label_newpsd.setFont(new Font("宋体", Font.PLAIN, 14));
		label_newpsd.setBounds(108, 276, 118, 26);
		contentPane.add(label_newpsd);
		
		JButton button_cancle = new JButton("\u53D6\u6D88");
		button_cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText("");
				passwordField_1.setText("");
			}
		});
		button_cancle.setFont(new Font("宋体", Font.PLAIN, 14));
		button_cancle.setBounds(318, 422, 62, 24);
		contentPane.add(button_cancle);
		
		JLabel label_confirmpsd = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_confirmpsd.setHorizontalAlignment(SwingConstants.CENTER);
		label_confirmpsd.setFont(new Font("宋体", Font.PLAIN, 14));
		label_confirmpsd.setBounds(108, 341, 118, 26);
		contentPane.add(label_confirmpsd);
		
		JButton button_submit = new JButton("\u63D0\u4EA4");
		button_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Getconnection  getconn=new Getconnection();
		        java.sql.Connection conn=getconn.getconn();
		        String id = textField_id.getText().toString().trim();
		        String psd = new String(passwordField.getPassword());
		        String confirmpsd = new String(passwordField_1.getPassword());
		        try {
		        	if(psd.isEmpty()||confirmpsd.isEmpty())
		        	{
					lblNewLabel_state.setText("请输入密码");
				    }  else if(psd.equals(confirmpsd))
					{   String newpsd="update user_stu set psd= '"+psd+"' where id ='"+id+"'";
						Statement stmt=conn.createStatement();
						stmt.execute(newpsd);
						lblNewLabel_state.setText("密码重设成功");
					}else {
						lblNewLabel_state.setText("两次密码输入不一致");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button_submit.setFont(new Font("宋体", Font.PLAIN, 14));
		button_submit.setBounds(191, 422, 62, 24);
		contentPane.add(button_submit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(249, 279, 151, 26);
		passwordField.setEditable(false);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(249, 344, 151, 26);
		passwordField_1.setEditable(false);
		contentPane.add(passwordField_1);
		JButton button_confirm = new JButton("\u786E\u5B9A");
		button_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        String idty = new String(passwordField_idty.getPassword());
		        if(textField_id.getText().isEmpty())
		        {
					lblNewLabel_state.setText("请输入ID");
		        }
		        else if(idty.isEmpty()){
					lblNewLabel_state.setText("请输入身份证后六位");
				} else {
					if(idty.equals(checkidty()))
					{   
					   passwordField.setEditable(true);
				       passwordField_1.setEditable(true);
					} else{
						lblNewLabel_state.setText("身份证后六位输入错误");
					}
				}
			}
		});
		button_confirm.setFont(new Font("宋体", Font.PLAIN, 14));
		button_confirm.setBounds(191, 195, 62, 24);
		contentPane.add(button_confirm);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("宋体", Font.PLAIN, 23));
		lblId.setBounds(108, 79, 118, 26);
		contentPane.add(lblId);
		
		textField_id = new JTextField();
		textField_id.setColumns(10);
		textField_id.setBounds(249, 80, 151, 26);
		contentPane.add(textField_id);
		
		lblNewLabel_state = new JLabel("");
		lblNewLabel_state.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_state.setForeground(Color.RED);
		lblNewLabel_state.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel_state.setBounds(164, 504, 266, 44);
		contentPane.add(lblNewLabel_state);
		
		passwordField_idty = new JPasswordField();
		passwordField_idty.setBounds(249, 130, 151, 26);
		contentPane.add(passwordField_idty);
		
		JButton button_cancel1 = new JButton("\u53D6\u6D88");
		button_cancel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_id.setText("");
				passwordField_idty.setText("");
			}
		});
		button_cancel1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_cancel1.setBounds(318, 195, 62, 24);
		contentPane.add(button_cancel1);
		
		JButton button = new JButton("\u5168\u90E8\u6E05\u7A7A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_id.setText("");
				passwordField_idty.setText("");
				passwordField.setText("");
				passwordField_1.setText("");
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 12));
		button.setBounds(474, 472, 89, 24);
		contentPane.add(button);
	}
}
