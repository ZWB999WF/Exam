package com.jikexueyuan.myjavachatclient.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.jikexueyuan.myjavachatclient.view.MainWIndow;


public class ChatManager {

	private ChatManager(){}
	private static final ChatManager instance = new ChatManager();
	public static ChatManager getCM() {
		return instance;
	}
	
	MainWIndow window;
	String IP;
	Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	
	public void setWindow(MainWIndow window) {
		this.window = window;
		window.appendText("�ı����Ѿ���chatmanger����");
	}
	
	public void connect(String ip) {
		this.IP = ip;
		new Thread(){
			@Override
			public void run() {
				try {
					socket = new Socket(IP, 12345);
					writer = new PrintWriter(       //�����˷�����Ϣ
							new OutputStreamWriter(
									socket.getOutputStream()));
					
					reader = new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
					//�ӷ���˻�ȡ��Ϣ��ʾ���ı���
					String line;
					while ((line = reader.readLine()) != null) {//�Ѷ�ȡ������Ϣ��ֵ��line�ַ���
						window.appendText(""+line);
					}
					writer.close();
					reader.close();
					writer = null;
					reader = null;
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	public void send(String out) {
		if (writer != null) {  //writer ��Ϊ�գ�˵���Ѿ��������Կͻ��˵�socket����ʱwriter����null
			writer.write(out+"\n");
			writer.flush();
		}else {
			window.appendText("��ǰ�������ж�");
		}
	}
}
