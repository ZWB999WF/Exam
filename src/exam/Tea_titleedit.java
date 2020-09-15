package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import java.awt.Dimension;

import javax.swing.ScrollPaneConstants;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

public class Tea_titleedit extends JFrame {
	private JRadioButton option_A;
	private JRadioButton option_B;
	private JRadioButton option_C;
	private JRadioButton option_D;
    JLabel lab[]=new JLabel[100];
    private JPanel contentPane;
    private JComboBox comboBox_choosub;
    private JComboBox comboBox_choopaper;
    private JLabel label_titleID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Tea_titleedit frame = new Tea_titleedit();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	
	public Tea_titleedit() {
		setTitle("\u9898\u5E93\u7BA1\u7406");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label_choosub = new JLabel("\u9009\u62E9\u79D1\u76EE");
		label_choosub.setHorizontalAlignment(SwingConstants.CENTER);
		label_choosub.setBounds(17, 18, 81, 31);
		contentPane.add(label_choosub);
		
		JComboBox comboBox_choosub = new JComboBox();
		comboBox_choosub.setModel(new DefaultComboBoxModel(new String[] {"\u9A6C\u539F", "\u6BDB\u6982", "\u8FD1\u4EE3\u53F2"}));
		//comboBox_choosub.set
		comboBox_choosub.setBounds(108, 23, 93, 21);
		contentPane.add(comboBox_choosub);
		
		JLabel label_choopaper = new JLabel("\u9009\u62E9\u5377\u7EB8");
		label_choopaper.setHorizontalAlignment(SwingConstants.CENTER);
		label_choopaper.setBounds(245, 18, 81, 31);
		contentPane.add(label_choopaper);
		
		comboBox_choopaper = new JComboBox();
		comboBox_choopaper.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_choopaper.setBounds(336, 23, 93, 21);
		contentPane.add(comboBox_choopaper);
		
		JTextArea textArea_A = new JTextArea();
		textArea_A.setLineWrap(true);
		textArea_A.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_A.setBackground(new Color(152, 251, 152));
		textArea_A.setBounds(76, 221, 353, 64);
		contentPane.add(textArea_A);
		
		JTextArea textArea_B = new JTextArea();
		textArea_B.setLineWrap(true);
		textArea_B.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_B.setBackground(new Color(152, 251, 152));
		textArea_B.setBounds(76, 295, 353, 64);
		contentPane.add(textArea_B);
		
		JTextArea textArea_C = new JTextArea();
		textArea_C.setLineWrap(true);
		textArea_C.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_C.setBackground(new Color(152, 251, 152));
		textArea_C.setBounds(76, 369, 353, 64);
		contentPane.add(textArea_C);
		
		JTextArea textArea_D = new JTextArea();
		textArea_D.setLineWrap(true);
		textArea_D.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_D.setBackground(new Color(152, 251, 152));
		textArea_D.setBounds(76, 443, 353, 64);
		contentPane.add(textArea_D);
		
		option_B = new JRadioButton("B");
		option_B.setHorizontalAlignment(SwingConstants.CENTER);
		option_B.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		option_B.setBounds(17, 292, 48, 23);
		contentPane.add(option_B);
		
		option_A = new JRadioButton("A");
		option_A.setHorizontalAlignment(SwingConstants.CENTER);
		option_A.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		option_A.setBounds(17, 206, 48, 23);
		contentPane.add(option_A);
		
		option_C = new JRadioButton("C");
		option_C.setHorizontalAlignment(SwingConstants.CENTER);
		option_C.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		option_C.setBounds(17, 367, 48, 23);
		contentPane.add(option_C);
		
		option_D = new JRadioButton("D");
		option_D.setHorizontalAlignment(SwingConstants.CENTER);
		option_D.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		option_D.setBounds(17, 441, 48, 23);
		contentPane.add(option_D);
		ButtonGroup btngp=new ButtonGroup();
		btngp.add(option_A);
		btngp.add(option_B);
		btngp.add(option_C);
		btngp.add(option_D);
		
		JLabel label_optcheck = new JLabel("\u5355\u9009");
		label_optcheck.setHorizontalAlignment(SwingConstants.CENTER);
		label_optcheck.setFont(new Font("宋体", Font.PLAIN, 12));
		label_optcheck.setBounds(17, 90, 39, 28);
		contentPane.add(label_optcheck);
		
		label_titleID = new JLabel("1");
		label_titleID.setHorizontalAlignment(SwingConstants.CENTER);
		label_titleID.setFont(new Font("宋体", Font.PLAIN, 18));
		label_titleID.setBounds(17, 124, 39, 28);
		contentPane.add(label_titleID);
		
		JTextArea textArea_ques = new JTextArea();
		textArea_ques.setLineWrap(true);
		textArea_ques.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_ques.setBackground(new Color(152, 251, 152));
		textArea_ques.setBounds(52, 59, 394, 149);
		contentPane.add(textArea_ques);
		
		JButton button_add = new JButton("\u6DFB\u52A0");
		button_add.setMnemonic('A');
		button_add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
//				String str_0=textArea_ques.getText();
//				int a1=str_0.indexOf('\n');
//				int a2=str_0.indexOf('\n', ++a1);
//				int a3=str_0.indexOf('\n', ++a2);
//				int a4=str_0.indexOf('\n', ++a3);
//				String str1=str_0.substring(0,++a1);
//				String str2=str_0.substring(a1,++a2);
//				String str3=str_0.substring(a1,++a2);
//				String str4=str_0.substring(a1,++a2);
//				String str5=str_0.substring(a1,++a2);
//				textArea_ques.setText(str1);
//				textArea_A.setText(str2);
//				textArea_B.setText(str3);
//				textArea_C.setText(str4);
//				textArea_D.setText(str5);
				Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
				String sub=(String) comboBox_choosub.getSelectedItem();
				int paper=Integer.parseInt((String) comboBox_choopaper.getSelectedItem());
				int titlenum=Integer.parseInt((String)label_titleID.getText());
				Boolean optcheck=true;
				String title_ques=textArea_ques.getText();
				String option_a=textArea_A.getText();
				String option_b=textArea_B.getText();
				String option_c=textArea_C.getText();
				String option_d=textArea_D.getText();
				String option_correct=new String("A");
				if(option_A.isSelected()){ option_correct="A";}
				if(option_B.isSelected()){ option_correct="B";}
				if(option_C.isSelected()){option_correct="C";}
				if(option_D.isSelected()){ option_correct="D";}
                String sql="insert into titlesea values ('"+sub+"',"+paper+","+titlenum+","+optcheck+",'"+title_ques+"','"+option_a+"','"+option_b+"','"+option_c+"','"+option_d+"','"+option_correct+"')";
				getconn.Exeupdate(conn,sql);
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				setTitle(titlenum+"  添加成功");
			}
		});
		button_add.setBounds(108, 516, 93, 23);
		contentPane.add(button_add);
		
		JButton button_cancel = new JButton("\u62C6\u5206");
		button_cancel.setMnemonic('n');
		button_cancel.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				String str_0=textArea_ques.getText();
				int a1=str_0.indexOf('\n');
				int a2=str_0.indexOf('\n', ++a1);
				int a3=str_0.indexOf('\n', ++a2);
				int a4=str_0.indexOf('\n', ++a3);
				String str1=str_0.substring(0,a1);
				String str2=str_0.substring(a1,a2);
				String str3=str_0.substring(a2,a3);
				String str4=str_0.substring(a3,a4);
				String str5=str_0.substring(a4);
				textArea_ques.setText(str1.trim());
				textArea_A.setText(str2.replaceAll("\\s*",""));
				textArea_B.setText(str3.replaceAll("\\s*",""));
				textArea_C.setText(str4.replaceAll("\\s*",""));
				textArea_D.setText(str5.replaceAll("\\s*",""));
				System.out.println(textArea_A.getText());
				System.out.println(textArea_B.getText());
				System.out.println(textArea_C.getText());
				System.out.println(textArea_D.getText());
			
				int i= str_0.indexOf('(');
				String str6=str_0.substring(++i, str_0.indexOf(')'));
				System.out.print(str6);
				if(str6.equals("A")){option_A.setSelected(true);}
				if(str6.equals("B")){option_B.setSelected(true);}
				if(str6.equals("C")){option_C.setSelected(true);}
				if(str6.equals("D")){option_D.setSelected(true);}
			}
		});
		button_cancel.setBounds(245, 516, 93, 23);
		contentPane.add(button_cancel);
		
		JButton button_last = new JButton("\u4E0A\u4E00\u9898");
		button_last.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int i=Integer.parseInt(label_titleID.getText());
				if(i!=1){
					Getconnection getconn=new Getconnection();
					java.sql.Connection conn=getconn.getconn();
				String sql="select title_ques,option_1,option_2,option_3,option_4,option_corret from titlesea  where titlenum="+(i-1);
				System.out.println(sql);
				textArea_ques.setText("");
				textArea_A.setText("");
				textArea_B.setText("");
				textArea_C.setText("");
				textArea_D.setText("");
				ResultSet rs=getconn.getRs(sql);
				try {
					while(rs.next()){
						textArea_ques.setText(rs.getString("title_ques"));
						textArea_A.setText(rs.getString("option_1"));
						textArea_B.setText(rs.getString("option_2"));
						textArea_C.setText(rs.getString("option_3"));
						textArea_D.setText(rs.getString("option_4"));
						if(option_A.getText().equals(rs.getString("option_corret"))){
							option_A.setSelected(true);
						}
						if(option_B.getText().equals(rs.getString("option_corret"))){
							option_B.setSelected(true);
						}
						if(option_C.getText().equals(rs.getString("option_corret"))){
							option_C.setSelected(true);
						}
						if(option_D.getText().equals(rs.getString("option_corret"))){
							option_D.setSelected(true);
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("查询异常");
					e1.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				label_titleID.setText(""+(i-1));
				int id=Integer.parseInt(label_titleID.getText());
				label_titleID.setText(""+id);
				
			}
		  }
		});
		button_last.setBounds(504, 399, 93, 23);
		contentPane.add(button_last);
		
		JButton button_next = new JButton("\u4E0B\u4E00\u9898");
		button_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea_ques.setText("");
				textArea_A.setText("");
				textArea_B.setText("");
				textArea_C.setText("");
				textArea_D.setText("");
				Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
				int i=Integer.parseInt(label_titleID.getText());
				String sql="select title_ques,option_1,option_2,option_3,option_4,option_corret from titlesea  where titlenum="+(i+1);
				System.out.println(sql);
				ResultSet rs=getconn.getRs(sql);
				try {
					while(rs.next()){
						textArea_ques.setText(rs.getString("title_ques"));
						textArea_A.setText(rs.getString("option_1"));
						textArea_B.setText(rs.getString("option_2"));
						textArea_C.setText(rs.getString("option_3"));
						textArea_D.setText(rs.getString("option_4"));
						if(option_A.getText().equals(rs.getString("option_corret"))){
							option_A.setSelected(true);
						}
						if(option_B.getText().equals(rs.getString("option_corret"))){
							option_B.setSelected(true);
						}
						if(option_C.getText().equals(rs.getString("option_corret"))){
							option_C.setSelected(true);
						}
						if(option_D.getText().equals(rs.getString("option_corret"))){
							option_D.setSelected(true);
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("查询异常");
					e1.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				label_titleID.setText(""+(i+1));
				int id=Integer.parseInt(label_titleID.getText());
				label_titleID.setText(""+id);
				
			}
		});
		button_next.setBounds(504, 441, 93, 23);
		contentPane.add(button_next);
		
		JButton button_viewall = new JButton("\u67E5\u770B\u5F55\u9898");
		button_viewall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
				String sub=(String)comboBox_choosub.getSelectedItem();
		        int paper=Integer.parseInt((String)comboBox_choopaper.getSelectedItem());
				String sql="select titlenum from titlesea where subnum='"+sub+"' and papernum='"+paper+"'";
				
				ResultSet rs=getconn.getRs(sql);
				for(int j=0;j<100;j++){
					lab[j].setBackground(Color.RED);
				}
				try {
					while(rs.next()){
						int i=Integer.parseInt(rs.getString("titlenum"))-1;
						System.out.println(i+1);
						lab[i].setBackground(Color.BLUE);
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
		});
		button_viewall.setBounds(504, 307, 93, 23);
		contentPane.add(button_viewall);
		
		JButton button_delete = new JButton("\u5220\u9664");
		button_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=Integer.parseInt(label_titleID.getText());
				String sql="delete from titlesea where titlenum="+i;
				Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
				getconn.Exeupdate(conn,sql);
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(sql);
			}
		});
		button_delete.setBounds(504, 352, 93, 23);
		contentPane.add(button_delete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(120, 220));
		scrollPane.setBounds(456, 52, 169, 243);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(120, 1200));
		scrollPane.setViewportView(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("\u5F55\u9898\u60C5\u51B5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(456, 26, 158, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u6279\u91CF\u5F55\u9898");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  new Tea_titlebatch().setVisible(true);
			  dispose();
			}
		});
		btnNewButton.setBounds(504, 484, 93, 23);
		contentPane.add(btnNewButton);
		 int i=0;
		for( ;i<100;i++){
	     lab[i] = new JLabel(""+(i+1));
	     lab[i].setFont(new Font("宋体", Font.PLAIN, 20));
	     lab[i].setOpaque(true);
	     lab[i].setHorizontalAlignment(SwingConstants.CENTER);
	     lab[i].setBackground(Color.RED);
	     lab[i].setPreferredSize(new Dimension(35, 30));
	     final int k=i;
	     lab[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0){
					textArea_ques.setText("");
					textArea_A.setText("");
					textArea_B.setText("");
					textArea_C.setText("");
					textArea_D.setText("");
			     Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
				final int j=Integer.parseInt(lab[k].getText());
				String sql="select title_ques,option_1,option_2,option_3,option_4,option_corret from titlesea  where titlenum="+j;
				System.out.println(sql);
				ResultSet rs=getconn.getRs(sql);
				try {
					while(rs.next()){
						textArea_ques.setText(rs.getString("title_ques"));
						textArea_A.setText(rs.getString("option_1"));
						textArea_B.setText(rs.getString("option_2"));
						textArea_C.setText(rs.getString("option_3"));
						textArea_D.setText(rs.getString("option_4"));
						if(option_A.getText().equals(rs.getString("option_corret"))){
							option_A.setSelected(true);
						}
						if(option_B.getText().equals(rs.getString("option_corret"))){
							option_B.setSelected(true);
						}
						if(option_C.getText().equals(rs.getString("option_corret"))){
							option_C.setSelected(true);
						}
						if(option_D.getText().equals(rs.getString("option_corret"))){
							option_D.setSelected(true);
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("查询异常");
					e1.printStackTrace();
				}
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				label_titleID.setText(""+(j));
				int id=Integer.parseInt(label_titleID.getText());
				label_titleID.setText(""+id);
				}
	         });
		     panel.add(lab[i]);
		}
		

//	public void viewtitle(){
//		Getconnection getconn=new Getconnection();
//		java.sql.Connection conn=getconn.getconn();
//		String sub=(String)comboBox_choosub.getSelectedItem();
//        int paper=Integer.parseInt((String)comboBox_choopaper.getSelectedItem());
//		String sql="select titlenum from titlesea where subnum='"+sub+"' and papernum='"+paper+"'";
//		System.out.println(sql);
//		ResultSet rs=getconn.getRs(sql);
//		try {
//			while(rs.next()){
//				int i=Integer.parseInt(label_titleID.getText());
//				int i=Integer.parseInt(rs.getString("titlenum"))-1;
//				lab[i].setBackground(Color.RED);
//			}
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
}