package com.jikexueyuan.myjavachatclient.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.jikexueyuan.myjavachatclient.main.ChatManager;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainWIndow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ip;
	private JTextField send;
	private JScrollPane scrollPane;
	public JTextArea txt;
	public  JList list;
	private JLabel label;



	/**
	 * Create the frame.
	 */
	public MainWIndow() {
		//setAlwaysOnTop(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 559, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ip = new JTextField();
		ip.setBounds(15, 6, 402, 21);
		ip.setText("127.0.0.1");
		ip.setColumns(10);
		
		JButton button = new JButton("连接到服务器");
		button.setBounds(423, 5, 105, 23);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ChatManager.getCM().connect(ip.getText()); 
			}
		});
		
		send = new JTextField();
		send.setBounds(15, 406, 333, 52);
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChatManager.getCM().send(send.getText());
				appendText("我 说 ："+send.getText());
				send.setText("");
			}
		});
		send.setText("你好");
		send.setColumns(10);
		JButton button_1 = new JButton("发送");
		button_1.setBounds(366, 405, 162, 23);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ChatManager.getCM().send(send.getText());
				appendText("我 说 ："+send.getText());
				send.setText("");
			}
		});
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(253, 46, 275, 349);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JButton btnNewButton = new JButton("\u663E\u793A\u5728\u7EBF\u7528\u6237");
		btnNewButton.setBounds(0, 58, 116, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChatManager.getCM().send1("zaixian");
			}
		});
		
		list = new JList();
		list.setBounds(0, 91, 116, 281);int x=list.getX();int y=list.getY();int w=list.getWidth();int h=list.getHeight();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				list.setBounds(x, y, w/20, h);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				list.setBounds(x, y, w, h);
			}
		});
	
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		txt = new JTextArea();
		txt.setText("Ready...");
		scrollPane.setViewportView(txt);
		contentPane.setLayout(null);
		contentPane.add(list);
		contentPane.add(btnNewButton);
		contentPane.add(scrollPane);
		contentPane.add(ip);
		contentPane.add(button);
		contentPane.add(send);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("\u6587\u4EF61");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MainWIndow.this.setBounds(500, 100, 559, 580);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(376, 438, 55, 20);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("\u6587\u4EF62");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MainWIndow.this.setBounds(500, 100, 559, 497);
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(473, 438, 55, 20);
		contentPane.add(label);
	}

	
	public void appendText(String in) {
		txt.append("\n"+in);
	}
	public void zaixian(Vector user) {
		System.out.println(user.size());
		list.setListData(user);
	}
}
