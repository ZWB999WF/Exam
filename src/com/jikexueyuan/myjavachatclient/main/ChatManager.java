package com.jikexueyuan.myjavachatclient.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

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
		window.appendText("文本框已经和chatmanger绑定了");
	}
	
	public void connect(String ip) {
		this.IP = ip;
		new Thread(){
			@Override
			public void run() {
				try {
					socket = new Socket(IP, 12345);
					writer = new PrintWriter(       //向服务端发送信息
							new OutputStreamWriter(
									socket.getOutputStream()));
					
					reader = new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
					//从服务端获取信息显示到文本区
					String line;
					Vector<String> user=new Vector<String>();
					while ((line = reader.readLine()) != null) {//把读取到的信息赋值给line字符串
						
						if(line.startsWith("id")){
							user.add(line);
							window.zaixian(user);
						}else{
							window.appendText(""+line);
						}
						
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
	public void send1(String out) {
		if (writer != null) { 
				writer.write(out+"\n");
				writer.flush(); 
			}
		else {
			window.appendText("当前连接已中断");
		}
	}
	//writer 不为空，说明已经有了来自客户端的socket，此时writer不是null
	public void send(String out) {
		if (writer != null) { 
			System.out.println("00000000000000");
			if(!window.list.isSelectionEmpty()){
				String st=(String) window.list.getSelectedValue();
			if(!st.equals("")){
				System.out.println("sendto"+st+out);
				System.out.println(("sendto"+st+out+"\n").substring(6,11));//忽略了应该先加个括号，就是优先级的问题，导致数组下边越界异常
				writer.write("sendto"+st+out+"\n");
				writer.flush();  //这个步骤绝对不能省略
				System.out.println("done");
			}
			
			}else{
				writer.write(out+"\n");
				writer.flush(); 
			}
		}else {
			window.appendText("当前连接已中断");
		}
	}
}
