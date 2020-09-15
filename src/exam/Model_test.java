package exam;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ScrollPaneConstants;

import exam.Getconnection;

import java.awt.SystemColor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.Point;

public class Model_test extends JFrame {
     
	public JPanel model_test;
    JLabel lab[] = new JLabel[100];
    private JTextArea textArea_ques;
    private JTextArea textArea_A;
    private JTextArea textArea_B;
    private JTextArea textArea_C;
    private JTextArea textArea_D;
    private JRadioButton opt_A;
    private JRadioButton opt_B;
    private JRadioButton opt_C;
    private JRadioButton opt_D;
    private JRadioButton opt_E;
    public float score =0;
    String option_cor1="";
	String option_cor2="";
	char opt_corre[] =new char[100]; 
	private  JTextArea textArea_lefttime;
	String begin_time;
			String end_time;
	 public String login_id="140401046";
	 public JLabel label_curloca;
	/**
	 * Launch the application.
	 */
    public static void main(String[] args) {
    	Model_test frame = new Model_test();
    	frame.setVisible(true);
    	}
    	

	/**
	 * Create the frame.
	 */
    
	public Model_test() {
		setUndecorated(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle bound=new Rectangle(screensize);
		setBounds(bound);
		model_test = new JPanel();
		model_test.setBackground(SystemColor.controlHighlight);
		model_test.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(model_test);
		try {
			String lookandfeel=UIManager.getSystemLookAndFeelClassName();
				UIManager.setLookAndFeel(lookandfeel);
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (InstantiationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IllegalAccessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (UnsupportedLookAndFeelException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		label_curloca = new JLabel("\u5F53\u524D\u4F4D\u7F6E\uFF1A\u6D4B\u9A8C\u6A21\u5F0F");
		label_curloca.setBounds(6, 10, 273, 15);
		
		JLabel label_lasttitle = new JLabel("\u4E0A\u4E00\u9898");
		label_lasttitle.setBounds(302, 596, 87, 32);
		label_lasttitle.setFont(new Font("宋体", Font.PLAIN, 16));
		label_lasttitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		textArea_ques = new JTextArea();
		textArea_ques.setBounds(209, 61, 430, 77);
		textArea_ques.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_ques.setLineWrap(true);
		textArea_ques.setEditable(false);
		textArea_ques.setBackground(new Color(152, 251, 152));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(719, 61, 202, 469);
		scrollPane_1.setPreferredSize(new Dimension(95, 180));
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel panel = new JPanel();
		panel.setLocation(new Point(1500, 0));
		panel.setPreferredSize(new Dimension(90, 1000));
		panel.setLayout(null);
		scrollPane_1.setViewportView(panel);
		
		JLabel label_4 = new JLabel("\u5355\u9009");
		label_4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(23, 10, 54, 15);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\u591A\u9009");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(98, 10, 54, 15);
		panel.add(label_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(47, 35, 1, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(new Rectangle(0, 0, 90, 1000));
		panel_1.setPreferredSize(new Dimension(90, 1000));
		panel_1.setBounds(10, 35, 170, 890);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel label_titleID = new JLabel("1");
		label_titleID.setBounds(114, 99, 39, 28);
		label_titleID.setHorizontalAlignment(SwingConstants.CENTER);
		label_titleID.setFont(new Font("宋体", Font.PLAIN, 18));
		JLabel label_nexttitle = new JLabel("\u4E0B\u4E00\u9898");
		label_nexttitle.setBounds(500, 596, 78, 32);
		
		
		
		 label_nexttitle.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				textArea_ques.setText("");
				textArea_A.setText("");
				textArea_B.setText("");
				textArea_C.setText("");
				textArea_D.setText("");
				Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
				int i=Integer.parseInt(label_titleID.getText());
				String corrthis="select title_ques,option_1,option_2,option_3,option_4 ,option_corret from titlesea where titlenum="+i;
				ResultSet rsthis=getconn.getRs(corrthis);
				String corr="";
				
					try {
						while(rsthis.next()){
							corr=rsthis.getString("option_corret");
							}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
				String sql="select title_ques,option_1,option_2,option_3,option_4 ,option_corret from titlesea where titlenum="+(i+1);
				//System.out.println(sql);
				ResultSet rs=getconn.getRs(sql);
			
				try {
					while(rs.next()){
						textArea_ques.setText(rs.getString("title_ques"));
						textArea_A.setText(rs.getString("option_1"));
						textArea_B.setText(rs.getString("option_2"));
						textArea_C.setText(rs.getString("option_3"));
						textArea_D.setText(rs.getString("option_4"));
//						option_cor1=rs.getString("option_corret");
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
				if((opt_A.isSelected()||opt_B.isSelected()||opt_C.isSelected()||opt_D.isSelected())){
					if(opt_A.isSelected()) option_cor2="A";
					if(opt_B.isSelected())option_cor2="B";
					if(opt_C.isSelected())option_cor2="C";
					if(opt_D.isSelected())option_cor2="D";
					
					if(corr.equals(option_cor2))   score=score+1;  //计算考试得分
					System.out.println(score);
				    lab[i-1].setBackground(Color.BLUE);
				    
				}
				opt_E.setSelected(true);
				
			}
		});
		label_nexttitle.setHorizontalAlignment(SwingConstants.CENTER);
		label_nexttitle.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textArea_A = new JTextArea();
		textArea_A.setBounds(209, 148, 430, 77);
		textArea_A.setLineWrap(true);
		textArea_A.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_A.setEditable(false);
		textArea_A.setBackground(new Color(152, 251, 152));
		
		textArea_B = new JTextArea();
		textArea_B.setBounds(209, 251, 430, 77);
		textArea_B.setLineWrap(true);
		textArea_B.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_B.setEditable(false);
		textArea_B.setBackground(new Color(152, 251, 152));
		
		textArea_C = new JTextArea();
		textArea_C.setBounds(209, 353, 430, 77);
		textArea_C.setLineWrap(true);
		textArea_C.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_C.setEditable(false);
		textArea_C.setBackground(new Color(152, 251, 152));
		
		textArea_D = new JTextArea();
		textArea_D.setBounds(209, 458, 430, 72);
		textArea_D.setLineWrap(true);
		textArea_D.setFont(new Font("宋体", Font.PLAIN, 12));
		textArea_D.setEditable(false);
		textArea_D.setBackground(new Color(152, 251, 152));
		
		textArea_lefttime = new JTextArea();
		textArea_lefttime.setBounds(735, 628, 202, 55);
		textArea_lefttime.setBackground(SystemColor.controlHighlight);
		textArea_lefttime.setForeground(Color.RED);
		textArea_lefttime.setFont(new Font("楷体", Font.PLAIN, 22));
		textArea_lefttime.setBorder(null);
		textArea_lefttime.setText("\u8DDD\u79BB\u8003\u8BD5\u7ED3\u675F\u8FD8\u6709\uFF1A\r\n  40  \u5206  60  \u79D2");
		
		opt_B = new JRadioButton("B");
		opt_B.setBounds(115, 281, 48, 23);
		opt_B.setHorizontalAlignment(SwingConstants.CENTER);
		opt_B.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		
		opt_A = new JRadioButton("A");
		opt_A.setBounds(105, 178, 48, 23);
		opt_A.setHorizontalAlignment(SwingConstants.CENTER);
		opt_A.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		
		opt_C = new JRadioButton("C");
		opt_C.setBounds(115, 393, 48, 23);
		opt_C.setHorizontalAlignment(SwingConstants.CENTER);
		opt_C.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		
		opt_D = new JRadioButton("D");
		opt_D.setBounds(114, 483, 48, 23);
		opt_D.setHorizontalAlignment(SwingConstants.CENTER);
		opt_D.setFont(new Font("SimSun-ExtB", Font.PLAIN, 14));
		
		opt_E = new JRadioButton("");
		opt_E.setBounds(107, 707, 21, 23);
		opt_E.setVisible(false);
		
		ButtonGroup btngp=new ButtonGroup();
		btngp.add(opt_A);
		btngp.add(opt_B);
		btngp.add(opt_C);
		btngp.add(opt_D);
		btngp.add(opt_E);
		JLabel label_optcheck = new JLabel("\u5355\u9009");
		label_optcheck.setBounds(104, 61, 39, 28);
		label_optcheck.setHorizontalAlignment(SwingConstants.CENTER);
		label_optcheck.setFont(new Font("宋体", Font.PLAIN, 12));
		
		
	
	     begin_time=new SimpleDateFormat("YY/MM/dd HH:mm:ss").format(new Date());


		JButton btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.setBounds(383, 690, 135, 42);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Getconnection getconn=new Getconnection();
				java.sql.Connection conn=getconn.getconn();
			    end_time=new SimpleDateFormat("YY/MM/dd HH:mm:ss").format(new Date());
				try {
					PreparedStatement pstmt = conn.prepareStatement("insert into sc values(?,?,?,?,?,?,?)");
					pstmt.setString(1, login_id);
					pstmt.setString(2, "测验模式");
					pstmt.setString(3, "马原");
					pstmt.setInt(4, 1);
					pstmt.setString(5,begin_time);
					pstmt.setString(6,end_time);
					pstmt.setFloat(7,score);
					pstmt.execute();
					pstmt.execute();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				score=0;
			FinishExam fs=new FinishExam();
			fs.setVisible(true);
			fs.login_id=login_id;
				dispose();
				
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 28));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		model_test.setLayout(null);
		model_test.add(label_curloca);
		model_test.add(label_optcheck);
		model_test.add(label_titleID);
		model_test.add(opt_A);
		model_test.add(opt_B);
		model_test.add(opt_C);
		model_test.add(opt_D);
		model_test.add(opt_E);
		model_test.add(textArea_ques);
		model_test.add(textArea_A);
		model_test.add(textArea_B);
		model_test.add(textArea_C);
		model_test.add(textArea_D);
		model_test.add(label_lasttitle);
		model_test.add(label_nexttitle);
		model_test.add(scrollPane_1);
		model_test.add(textArea_lefttime);
		model_test.add(btnNewButton);
		
		
		
		
		for(int i=0;i<70;i++){
			lab[i]= new JLabel(""+(i+1));
			lab[i].setOpaque(true);
			lab[i].setBackground(Color.RED);
			lab[i].setBorder(null);
			lab[i].setPreferredSize(new Dimension(40, 30));
			lab[i].setHorizontalAlignment(SwingConstants.CENTER);
			final int k=i;
			lab[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					Getconnection getconn=new Getconnection();
					java.sql.Connection conn=getconn.getconn();
					int j=Integer.parseInt(lab[k].getText());
					String sql="select title_ques,option_1,option_2,option_3,option_4  from titlesea  where titlenum="+(j);
					
					ResultSet rs=getconn.getRs(sql);
					try {
						while(rs.next()){
							textArea_ques.setText(rs.getString("title_ques"));
							textArea_A.setText(rs.getString("option_1"));
							textArea_B.setText(rs.getString("option_2"));
							textArea_C.setText(rs.getString("option_3"));
							textArea_D.setText(rs.getString("option_4"));
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
					
					
					label_titleID.setText(""+j);
					
					
					
				}
			});
		    panel_1.add(lab[i]);
		    
		}
		 new Thread(){
			String minute="40";
			String second="00";
			int second1=Integer.parseInt(second);
			int minute1=Integer.parseInt(minute);
			void lefttime(){
				String lefttime="距离考试结束还有"+"\n"+"  "+minute+" 分: "+second+" 秒";
			    textArea_lefttime.setText(lefttime);
			}
			public void run(){
				
				while(true){
					
					if(minute1==0&&second1==0)  
						{
						   break;
						}
					if(minute1<10){
						minute="0"+minute1;
					}
					lefttime();
					if(second1==0){
						minute1--;
						second1=60;
					}
					second1--;
					minute=""+minute1;
					if(second1>=10){
						second=""+second1;
					}
					else {
						if(second1<10)
						{
							second="0"+second1;
						}
					}
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   }
				//textArea_lefttime.setText("即将交卷");
		   }
	}.start();
    
	}
	
}

