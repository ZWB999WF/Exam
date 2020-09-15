package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import java.awt.Insets;
import java.awt.Dimension;

import javax.swing.JLabel;

import java.awt.Font;

public class Befo_exam extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel befo_exam;
	private JRadioButton rbt_agree;
	private JRadioButton rbt_dis;
	 public String login_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Befo_exam frame = new Befo_exam();
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
	public Befo_exam() {
		setTitle("\u8003\u751F\u987B\u77E5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u9996\u9875");
		menu.setOpaque(true);
		menu.setMargin(new Insets(0, 5, 0, 10));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u56DE\u5230\u9996\u9875");
		menuItem.setHorizontalAlignment(SwingConstants.LEFT);
		menu.add(menuItem);
		
		JMenu mnNewMenu = new JMenu("\u8003\u8BD5\u8BBE\u7F6E");
		mnNewMenu.setOpaque(true);
		mnNewMenu.setPreferredSize(new Dimension(80, 22));
		mnNewMenu.setMargin(new Insets(0, 10, 0, 10));
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("\u5B66\u4E60\u6A21\u5F0F");
		menuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_1.setPreferredSize(new Dimension(80, 22));
		menuItem_1.setOpaque(true);
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u7EC3\u4E60\u6A21\u5F0F");
		menuItem_2.setPreferredSize(new Dimension(80, 22));
		menuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u8003\u8BD5\u6A21\u5F0F");
		mnNewMenu.add(menuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("\u6210\u7EE9\u67E5\u8BE2");
		mnNewMenu_1.setOpaque(true);
		mnNewMenu_1.setMargin(new Insets(0, 10, 0, 10));
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u5B66\u4E60\u6A21\u5F0F");
		menuItem_4.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_4.setPreferredSize(new Dimension(80, 22));
		mnNewMenu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u7EC3\u4E60\u6A21\u5F0F");
		menuItem_5.setPreferredSize(new Dimension(80, 22));
		menuItem_5.setOpaque(true);
		menuItem_5.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("\u8003\u8BD5\u6A21\u5F0F");
		menuItem_6.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_6.setOpaque(true);
		menuItem_6.setPreferredSize(new Dimension(80, 22));
		mnNewMenu_1.add(menuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("\u4E2A\u4EBA\u4FE1\u606F");
		mnNewMenu_2.setOpaque(true);
		mnNewMenu_2.setMargin(new Insets(0, 10, 0, 10));
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem menuItem_7 = new JMenuItem("\u4FE1\u606F\u67E5\u8BE2");
		menuItem_7.setPreferredSize(new Dimension(80, 22));
		menuItem_7.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_2.add(menuItem_7);
		
		JMenuItem menuItem_8 = new JMenuItem("\u4FE1\u606F\u4FEE\u6539");
		menuItem_8.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_8.setOpaque(true);
		menuItem_8.setPreferredSize(new Dimension(80, 22));
		mnNewMenu_2.add(menuItem_8);
		befo_exam = new JPanel();
		befo_exam.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(befo_exam);
		befo_exam.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setText("\u4E00\u3001\u8003\u8BD5\u5F00\u59CB\u524D15\u5206\u949F\u8003\u751F\u51ED\u5B66\u751F\u8BC1\u548C\u6709\u6548\u8EAB\u4EFD\u8BC1\u4EF6\uFF08\u8EAB\u4EFD\u8BC1\u7B49\uFF09\u8FDB\u5165\u89C4\u5B9A\u8003\u573A\u5BF9\u53F7\u5165\u5EA7\uFF0C\u5E76\u5C06\u6709\u6548\u8BC1\u4EF6\u653E\u5728\u8003\u684C\u5DE6\u4E0A\u89D2\uFF0C\u4EE5\u4FBF\u76D1\u8003\u4EBA\u5458\u67E5\u9A8C\u3002\u8003\u8BD5\u5F00\u59CB\u6307\u4EE4\u53D1\u51FA\u540E\uFF0C\u8003\u751F\u624D\u80FD\u5F00\u59CB\u7B54\u5377\u3002\r\n\u4E8C\u3001\u8003\u751F\u8FDB\u5165\u8003\u573A\u5FC5\u987B\u5173\u95ED\u5404\u79CD\u901A\u8BAF\u5DE5\u5177\u3002\r\n\u53C2\u52A0\u95ED\u5377\u8003\u8BD5\u8003\u751F\u5728\u5165\u573A\u65F6\u9664\u643A\u5E26\u5FC5\u8981\u7684\u6587\u5177\u5916\uFF0C\u4E0D\u51C6\u643A\u5E26\u5176\u5B83\u7269\u54C1(\u5982:\u4E66\u7C4D\u3001\u8D44\u6599\u3001\u7B14\u8BB0\u672C\u548C\u81EA\u5907\u8349\u7A3F\u7EB8\u4EE5\u53CA\u5177\u6709\u6536\u5F55\u3001\u50A8\u5B58\u3001\u8BB0\u5FC6\u529F\u80FD\u7684\u7535\u5B50\u5DE5\u5177\u7B49)\u3002\u5DF2\u643A\u5E26\u5165\u573A\u7684\u5E94\u6309\u8981\u6C42\u6307\u5B9A\u4F4D\u7F6E\u5B58\u653E\u3002\r\n\u53C2\u52A0\u975E\u95ED\u5377\u8003\u8BD5\u7684\u8003\u751F\u9664\u643A\u5E26\u5FC5\u8981\u7684\u6587\u5177\u5916\uFF0C\u53EF\u643A\u5E26\u8BE5\u8003\u8BD5\u79D1\u76EE\u89C4\u5B9A\u5141\u8BB8\u7684\u76F8\u5173\u8D44\u6599\u3002\r\n\u56DB\u3001\u5728\u8003\u8BD5\u671F\u95F4\u539F\u5219\u4E0A\u4E0D\u5141\u8BB8\u4E0A\u5395\u6240\uFF0C\u82E5\u9047\u7279\u6B8A\u60C5\u51B5\uFF0C\u987B\u7531\u5DE5\u4F5C\u4EBA\u5458\u966A\u540C\u51FA\u5165\u8003\u573A\u3002\r\n\u4E94\u3001\u8003\u8BD5\u7ED3\u675F\u6307\u4EE4\u53D1\u51FA\u540E\uFF0C\u8003\u751F\u7ACB\u5373\u505C\u6B62\u7B54\u5377\uFF0C\u5C06\u7B54\u5377\uFF08\u7B54\u9898\u5361\uFF09\u53CD\u6263\u5728\u684C\u9762\u4E0A\uFF0C\u5E76\u6309\u76D1\u8003\u4EBA\u5458\u8981\u6C42\u9000\u79BB\u8003\u573A\u3002\u4E25\u7981\u5C06\u8BD5\u5377\u3001\u7B54\u5377\uFF08\u7B54\u9898\u5361\uFF09\u548C\u8003\u573A\u7EDF\u4E00\u53D1\u653E\u7684\u8349\u7A3F\u7EB8\u5E26\u51FA\u8003\u573A\u3002\r\n\u516D\u3001\u7559\u8003\u8003\u751F\u5FC5\u987B\u670D\u4ECE\u8003\u8BD5\u5DE5\u4F5C\u4EBA\u5458\u548C\u76D1\u8003\u4EBA\u5458\u7684\u5B89\u6392\uFF0C\u4E0D\u5F97\u4E0E\u5176\u4ED6\u8003\u751F\u6216\u573A\u5916\u4EBA\u5458\u63A5\u89E6");
		textArea.setBounds(83, 69, 468, 317);
		befo_exam.add(textArea);
		
		rbt_agree = new JRadioButton("\u540C\u610F");
		rbt_agree.setBounds(193, 408, 62, 23);
		befo_exam.add(rbt_agree);
		
		rbt_dis = new JRadioButton("\u4E0D\u540C\u610F");
		rbt_dis.setBounds(331, 411, 68, 23);
		befo_exam.add(rbt_dis);
		
		JButton button = new JButton("\u6B63\u5F0F\u8003\u8BD5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbt_agree.isSelected()){
					Model_test md=new Model_test();
					md.setVisible(true);
					md.login_id=login_id;
					md.label_curloca.setText("当前位置：测验模式  "+"欢迎"+login_id+"同学进入考试");
				    dispose();
				}
			}
		});
		button.setBounds(241, 469, 112, 28);
		befo_exam.add(button);
		
		JLabel label = new JLabel("\u8003\u751F\u987B\u77E5");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBounds(188, 26, 226, 35);
		befo_exam.add(label);
	}
}
