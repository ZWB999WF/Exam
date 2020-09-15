package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Rectangle;

import javax.swing.ScrollPaneConstants;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Tea_titlebatch extends JFrame {

	private JPanel contentPane;
	private JButton button_addbatch;
	private JComboBox comboBox_choopaper;
	private JComboBox comboBox_choosub;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tea_titlebatch frame = new Tea_titlebatch();
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
	public Tea_titlebatch() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 12000));
		panel.setBounds(new Rectangle(0, 0, 0, 12000));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 93, 567, 11800);
		panel.add(textArea);
		
		button_addbatch = new JButton("New button");
		button_addbatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str[]=new String[610];
				 str[0]=textArea.getText();
				 String ques;
				 String A;
				 String B;
				 String C;
				 String D;
				 
				 
				  String sub=(String) comboBox_choosub.getSelectedItem();
				  str[6]=""; //初始化下面循环的判断条件
				   Getconnection getconn=new Getconnection();
				   java.sql.Connection conn=getconn.getconn();

				 for(int i=0;;i++)
				 {
				   System.out.println(i+1);
			
				 int a1=str[i*6].indexOf('\n');
				 int a2=str[i*6].indexOf('\n',++a1);
				 int a3=str[i*6].indexOf('\n',++a2);
				 int a4=str[i*6].indexOf('\n',++a3);
				 int a5=str[i*6].indexOf('\n',++a4);
				 str[i*6+1]=str[i*6].substring(0,a1);
				 str[i*6+2]=str[i*6].substring(a1,a2);
				 str[i*6+3]=str[i*6].substring(a2,a3);
				 str[i*6+4]=str[i*6].substring(a3,a4);
				 System.out.println(a3+"   "+a4+"   "+a5);
				 ques=str[i*6+1].trim();
					
				  if(a5==-1){
						str[i*6+5]=str[i*6].substring(a4);
						
						str[i*6+6]=str[i*6]="exit";
					 }
				   //读取最后一题的最后一个字符越界
				   if(a5!=-1){
				   str[i*6+5]=str[i*6].substring(a4,a5);
				   str[i*6+6]=str[i*6].substring(a5+1);
				   }
				   
				   System.out.print(str[i*6+1]);
				   System.out.print(str[i*6+2]);
				   System.out.print(str[i*6+3]);
				   System.out.print(str[i*6+4]);
				   System.out.print(str[i*6+5]);
					
				   int j= str[i*6+1].indexOf('(');
				   String str6=str[i*6+1].substring(++j, str[i*6+1].indexOf(')'));
				   System.out.println(str6);
				   
				   
				   A=str[i*6+2].replaceAll("\\s*","");
				   B=str[i*6+3].replaceAll("\\s*","");
				   C=str[i*6+4].replaceAll("\\s*","");
				   D=str[i*6+5].replaceAll("\\s*","");

                
				  
//				if(str6.equals("A")){option_A.setSelected(true);}
//				if(str6.equals("B")){option_B.setSelected(true);}
//				if(str6.equals("C")){option_C.setSelected(true);}
//				if(str6.equals("D")){option_D.setSelected(true);}
				
				
				int paper=Integer.parseInt((String) comboBox_choopaper.getSelectedItem());
			
				Boolean optcheck=true;
				
                String sql="insert into titlesea values ('"+sub+"',"+paper+","+(i+1)+","+optcheck+",'"+ques+"','"+A+"','"+B+"','"+C+"','"+D+"','"+str6+"')";
				getconn.Exeupdate(conn,sql);
			    System.out.println("插入成功"+(i+1));
			    if(str[i*6+6].equals("exit")) break;
			    }  
				 try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button_addbatch.setBounds(20, 60, 93, 23);
		panel.add(button_addbatch);
		
		JButton button_backhome = new JButton("New button");
		button_backhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tea_main tea=new Tea_main();
				tea.setVisible(true);
				
			}
		});
		button_backhome.setBounds(148, 60, 93, 23);
		panel.add(button_backhome);
		
		comboBox_choosub = new JComboBox();
		comboBox_choosub.setModel(new DefaultComboBoxModel(new String[] {"\u9A6C\u539F", "\u6BDB\u6982", "\u8FD1\u4EE3\u53F2"}));
		comboBox_choosub.setBounds(20, 29, 93, 21);
		panel.add(comboBox_choosub);
		
		comboBox_choopaper = new JComboBox();
		comboBox_choopaper.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_choopaper.setBounds(148, 29, 93, 21);
		panel.add(comboBox_choopaper);
	}
}
