package exam;
import java.awt.EventQueue;
import com.jikexueyuan.myjavachatclient.main.StartClient;
import com.jikexueyuan.testmysetversocket.main.MyServerSocket;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stu_main extends JFrame {

	private JPanel contentPane;
    public String login_id="140401046";
    public JLabel label_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stu_main frame = new Stu_main();
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
	public Stu_main() {
		setTitle("\u5B66\u751F\u7AEF\u9996\u9875");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("\u8D26\u53F7\u7BA1\u7406");
		mnNewMenu_1.setPreferredSize(new Dimension(60, 22));
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u5207\u6362\u8D26\u53F7");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Login().setVisible(true);
				dispose();
			}
		});
		menuItem_4.setPreferredSize(new Dimension(60, 22));
		menuItem_4.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u9000\u51FA");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menuItem_5.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_5.setPreferredSize(new Dimension(60, 22));
		mnNewMenu_1.add(menuItem_5);
		
		JMenu mnNewMenu = new JMenu("\u9009\u62E9\u6A21\u5F0F");
		mnNewMenu.setMargin(new Insets(0, 10, 0, 10));
		mnNewMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.setPreferredSize(new Dimension(60, 22));
		mnNewMenu.setOpaque(true);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u7EC3\u4E60\u6A21\u5F0F");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Befo_exam be=	new Befo_exam();
				be.setVisible(true);
				be.login_id=login_id;
				dispose();
			}
		});
		mntmNewMenuItem.setActionCommand("\u7EC3\u4E60\u6A21\u5F0F");
		mntmNewMenuItem.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmNewMenuItem.setVerticalAlignment(SwingConstants.BOTTOM);
		mntmNewMenuItem.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.setPreferredSize(new Dimension(60, 22));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u6D4B\u9A8C\u6A21\u5F0F");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Befo_exam be=	new Befo_exam();
				be.setVisible(true);
				be.login_id=login_id;
				dispose();
			}
		});
		menuItem_1.setPreferredSize(new Dimension(60, 22));
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u8003\u8BD5\u6A21\u5F0F");
		menuItem_2.setPreferredSize(new Dimension(60, 22));
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Befo_exam be=	new Befo_exam();
				be.setVisible(true);
				be.login_id=login_id;
				dispose();
			}
		});
		mnNewMenu.add(menuItem_2);
		
		JMenu menu = new JMenu("\u8003\u8BD5\u4E0B\u8F7D");
		menu.setHorizontalTextPosition(SwingConstants.LEFT);
		menu.setHorizontalAlignment(SwingConstants.LEFT);
		menu.setOpaque(true);
		menu.setMargin(new Insets(0, 10, 0, 0));
		menu.setPreferredSize(new Dimension(60, 22));
		menuBar.add(menu);
		
		JMenuItem menuItem_6 = new JMenuItem("\u8003\u8BD5\u4E0B\u8F7D");
		menuItem_6.setHorizontalTextPosition(SwingConstants.LEFT);
		menuItem_6.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lookandfeel=UIManager.getSystemLookAndFeelClassName();
				try {
					UIManager.setLookAndFeel(lookandfeel);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JFileChooser fi=new JFileChooser();
				fi.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				int i=fi.showSaveDialog(menuItem_6);
				if(i==JFileChooser.APPROVE_OPTION){
					File f=fi.getSelectedFile();
					File f1=new File("File/马原单选题.docx");
					try {
						
						FileInputStream fin=new FileInputStream(f1);
						FileOutputStream fou=new FileOutputStream(f+"/马原习题下载.doc");
						byte read[]=new byte[50];
						while(fin.read(read)!=-1){
						       fou.write(read);
						}
						fou.close();
						fin.close();
						System.out.print("done");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print(f.getAbsolutePath());
				}
				else{
					System.out.print("Fail");
				}
			}
		});
		menuItem_6.setPreferredSize(new Dimension(60, 22));
		menu.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("\u6210\u7EE9\u4E0B\u8F7D");
		menuItem_7.setHorizontalTextPosition(SwingConstants.LEFT);
		menuItem_7.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_7.setPreferredSize(new Dimension(60, 22));
		menu.add(menuItem_7);
		
		JMenu mnNewMenu_2 = new JMenu("\u4FE1\u606F\u67E5\u8BE2");
		mnNewMenu_2.setMargin(new Insets(0, 10, 0, 0));
		mnNewMenu_2.setOpaque(true);
		mnNewMenu_2.setPreferredSize(new Dimension(65, 22));
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u4FE1\u606F\u67E5\u8BE2");
		menuItem_3.setPreferredSize(new Dimension(60, 22));
		mnNewMenu_2.add(menuItem_3);
		
		JMenuItem menuItem = new JMenuItem("\u6210\u7EE9\u67E5\u8BE2");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Grade_view grade=new Grade_view(login_id);
				 grade.setVisible(true);
				 grade.login_id=login_id;
			}
		});
		menuItem.setPreferredSize(new Dimension(60, 22));
		menuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.add(menuItem);
		
		JMenu menu_3 = new JMenu("\u5B9E\u65F6\u54A8\u8BE2");
		menu_3.setMargin(new Insets(0, 10, 0, 0));
		menu_3.setOpaque(true);
		menu_3.setPreferredSize(new Dimension(60, 22));
		menuBar.add(menu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u54A8\u8BE2\u8001\u5E08");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MyServerSocket();
				new StartClient();
			}
		});
		mntmNewMenuItem_3.setPreferredSize(new Dimension(60, 22));
		menu_3.add(mntmNewMenuItem_3);
		
		JMenu menu_1 = new JMenu("\u8054\u7CFB\u6211\u4EEC");
		menu_1.setOpaque(true);
		menu_1.setMargin(new Insets(0, 15, 0, 0));
		menu_1.setHorizontalTextPosition(SwingConstants.LEFT);
		menu_1.setHorizontalAlignment(SwingConstants.LEFT);
		menu_1.setPreferredSize(new Dimension(70, 22));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_8 = new JMenuItem("\u4FE1\u606F\u53CD\u9988");
		menuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Runtime r=Runtime.getRuntime();
				try {
					Process p=r.exec("cmd /c start File/反馈.html");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		menuItem_8.setHorizontalTextPosition(SwingConstants.LEFT);
		menuItem_8.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_8.setPreferredSize(new Dimension(60, 22));
		menu_1.add(menuItem_8);
		
		JMenu menu_2 = new JMenu("\u5E2E\u52A9");
		menu_2.setOpaque(true);
		menu_2.setMargin(new Insets(0, 20, 0, 0));
		menu_2.setPreferredSize(new Dimension(50, 22));
		menu_2.setHorizontalTextPosition(SwingConstants.LEFT);
		menu_2.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(menu_2);
		
		JMenuItem menuItem_9 = new JMenuItem("\u4F7F\u7528\u89C6\u9891");
		menuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Runtime r=Runtime.getRuntime();
				try {
					Process p=r.exec("cmd /c start File/数据库课设考试系统.avi");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		menuItem_9.setPreferredSize(new Dimension(60, 22));
		menuItem_9.setHorizontalTextPosition(SwingConstants.LEFT);
		menuItem_9.setHorizontalAlignment(SwingConstants.LEFT);
		menu_2.add(menuItem_9);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u4F7F\u7528\u6587\u6863");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Runtime r=Runtime.getRuntime();
				try {
					Process p=r.exec("cmd /c start File/马克思主义基本原理必考选择题.doc");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mntmNewMenuItem_1.setPreferredSize(new Dimension(60, 22));
		menu_2.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setToolTipText("123");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Stu_main = new JPanel();
		Stu_main.setBounds(64, 48, 517, 401);
		contentPane.add(Stu_main);
		Stu_main.setLayout(null);
		
		JLabel label_sub = new JLabel("\u9009\u62E9\u79D1\u76EE");
		label_sub.setBounds(136, 118, 81, 31);
		Stu_main.add(label_sub);
		
		JLabel label_model = new JLabel("\u9009\u62E9\u6A21\u5F0F");
		label_model.setBounds(136, 177, 81, 31);
		Stu_main.add(label_model);
		
		label_id = new JLabel("140401046");
		label_id.setHorizontalAlignment(SwingConstants.LEFT);
		label_id.setFont(new Font("宋体", Font.PLAIN, 18));
		label_id.setBounds(268, 57, 98, 31);
		Stu_main.add(label_id);
		
		JComboBox comboBox_model = new JComboBox();
		comboBox_model.setModel(new DefaultComboBoxModel(new String[] {"\u5B66\u4E60\u6A21\u5F0F", "\u6D4B\u9A8C\u6A21\u5F0F", "\u8003\u8BD5\u6A21\u5F0F"}));
		comboBox_model.setBounds(268, 182, 93, 21);
		Stu_main.add(comboBox_model);
		
		JComboBox comboBox_sub = new JComboBox();
		comboBox_sub.setModel(new DefaultComboBoxModel(new String[] {"\u9A6C\u539F", "\u8FD1\u4EE3\u53F2", "\u6BDB\u6982"}));
		comboBox_sub.setBounds(268, 115, 93, 21);
		Stu_main.add(comboBox_sub);
		
		JButton button_enter = new JButton("\u8FDB\u5165");
		button_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Befo_exam befo=new Befo_exam();
				befo.setVisible(true);
				befo.login_id=login_id;
				dispose();
			}
		});
		button_enter.setBounds(136, 256, 72, 23);
		Stu_main.add(button_enter);
		
		JButton button_button = new JButton("\u53D6\u6D88");
		button_button.setBounds(287, 256, 74, 23);
		Stu_main.add(button_button);
		
		JMenuItem menuItem_10 = new JMenuItem("");
		menuItem_10.setBounds(195, 25, 135, 22);
		Stu_main.add(menuItem_10);
		
		JButton button_exit = new JButton("\u9000\u51FA");
		button_exit.setBounds(439, 368, 68, 23);
		Stu_main.add(button_exit);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("宋体", Font.PLAIN, 22));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(136, 61, 60, 31);
		Stu_main.add(lblId);
	}
}
