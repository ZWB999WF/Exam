package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JTextArea;

import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grade_view extends JFrame {
	private JTextArea textArea_exam;
	private JTextArea textArea_test;
	private JTextArea textArea_study;
    public String login_id="140401046"; 
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grade_view frame = new Grade_view("140401046");
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
	public Grade_view(String login_id) {
		this.login_id=login_id;
		System.out.println(login_id+"gradevies");
		setTitle("\u6210\u7EE9\u67E5\u770B");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 75, 615, 443);
		panel.add(tabbedPane);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		tabbedPane.addTab("\u5B66\u4E60\u6A21\u5F0F", null, scrollPane_2, null);
		
		textArea_study = new JTextArea();
		textArea_study.setEditable(false);
		textArea_study.setText("   \u5B66\u53F7       \u79D1\u76EE    \u8BD5\u5377\u7F16\u53F7        \u5F00\u59CB\u65F6\u95F4          \u7ED3\u675F\u65F6\u95F4          \u6210\u7EE9\r\n  ");
		textArea_study.setFont(new Font("宋体", Font.PLAIN, 20));
		scrollPane_2.setViewportView(textArea_study);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("\u6D4B\u9A8C\u6A21\u5F0F", null, scrollPane, null);
		
		textArea_test = new JTextArea();
		textArea_test.setEditable(false);
		textArea_test.setWrapStyleWord(true);
		textArea_test.setText("   \u5B66\u53F7       \u79D1\u76EE    \u8BD5\u5377\u7F16\u53F7        \u5F00\u59CB\u65F6\u95F4          \u7ED3\u675F\u65F6\u95F4          \u6210\u7EE9");
		textArea_test.setFont(new Font("宋体", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea_test);
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("\u8003\u8BD5\u6A21\u5F0F", null, scrollPane_1, null);
		
		textArea_exam = new JTextArea();
		textArea_exam.setEditable(false);
		textArea_exam.setText("   \u5B66\u53F7       \u79D1\u76EE    \u8BD5\u5377\u7F16\u53F7        \u5F00\u59CB\u65F6\u95F4          \u7ED3\u675F\u65F6\u95F4          \u6210\u7EE9\r\n  ");
		textArea_exam.setFont(new Font("宋体", Font.PLAIN, 20));
		scrollPane_1.setViewportView(textArea_exam);
		
		JLabel lblNewLabel = new JLabel("\u5F53\u524D\u4F4D\u7F6E\uFF1A\u6210\u7EE9\u67E5\u770B");
		lblNewLabel.setBounds(45, 20, 126, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u56DE\u5230\u9996\u9875");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Stu_main stu=new Stu_main();
			stu.setVisible(true);
			stu.login_id=login_id;
				dispose();
			
			}
		});
		
		lblNewLabel_1.setBounds(194, 20, 65, 15);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u5237\u65B0");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				textArea_test.setText("");
//				Getconnection getconn=new Getconnection();
//		        java.sql.Connection conn=getconn.getconn();
//		ResultSet rs=getconn.getRs("select * from sc where category='测验模式'");
//			     try {
//					while(rs.next()){
//						textArea_test.append("\n"+rs.getString(1)+"     "+rs.getString(3)+"       "+rs.getString(4)+"        "+rs.getString(5)+"  "+rs.getString(6)+"     "+rs.getString(7));
//					 }
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			     try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(10, 45, 65, 23);
		panel.add(btnNewButton);
		Getconnection getconn=new Getconnection();
        java.sql.Connection conn=getconn.getconn();
        System.out.println(login_id);
        ResultSet rs=getconn.getRs("select * from sc where category='测验模式' and sno='"+login_id+"'");
	     try {
			while(rs.next()){
				textArea_test.append("\n"+rs.getString(1)+"     "+rs.getString(3)+"       "
			+rs.getString(4)+"        "+rs.getString(5)+"  "+rs.getString(6)+"     "+rs.getString(7));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}
