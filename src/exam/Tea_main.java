package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tea_main extends JFrame {

	private JPanel contentPane;
	 public String login_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tea_main frame = new Tea_main();
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
	public Tea_main() {
		setTitle("\u6559\u5E08\u7AEF\u9996\u9875");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u9996\u9875");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_5 = new JMenuItem("\u56DE\u5230\u9996\u9875");
		menuItem_5.setPreferredSize(new Dimension(70, 22));
		mnNewMenu.add(menuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("\u9898\u5E93\u8BBE\u8BA1");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u9898\u5E93\u7F16\u8F91");
		menuItem_4.setPreferredSize(new Dimension(70, 22));
		menuItem_4.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(menuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("\u6210\u7EE9\u67E5\u8BE2");
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem menuItem_2 = new JMenuItem("\u6D4B\u9A8C\u6210\u7EE9");
		menuItem_2.setPreferredSize(new Dimension(70, 22));
		mnNewMenu_2.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u8003\u8BD5\u6210\u7EE9");
		menuItem_3.setPreferredSize(new Dimension(70, 22));
		mnNewMenu_2.add(menuItem_3);
		
		JMenu mnNewMenu_3 = new JMenu("\u4FE1\u606F\u67E5\u8BE2");
		mnNewMenu_3.setPreferredSize(new Dimension(70, 22));
		mnNewMenu_3.setOpaque(true);
		mnNewMenu_3.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu_3);
		
		JMenuItem menuItem = new JMenuItem("\u5B66\u751F\u4FE1\u606F");
		menuItem.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem.setPreferredSize(new Dimension(70, 22));
		mnNewMenu_3.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u4E2A\u4EBA\u4FE1\u606F");
		menuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		menuItem_1.setPreferredSize(new Dimension(70, 22));
		mnNewMenu_3.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u9009\u62E9\u79D1\u76EE");
		label.setBounds(222, 121, 81, 31);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u9A6C\u539F", "\u6BDB\u6982", "\u8FD1\u4EE3\u53F2"}));
		comboBox.setBounds(333, 126, 93, 21);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("\u9009\u62E9\u5377\u7EB8");
		label_1.setBounds(222, 188, 81, 31);
		contentPane.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_1.setBounds(333, 188, 93, 21);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("\u7F16\u8F91\u9898\u5E93");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Tea_titleedit().setVisible(true);
				dispose();
			}
		});
		button.setActionCommand("\u7F16\u8F91\u9898\u5E93");
		button.setBounds(193, 262, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setBounds(333, 262, 93, 23);
		contentPane.add(button_1);
	}

}
